/*******************************************************************************
 * Copyright (C) 2019 IMT Mines Alès
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package defaultpackage;

import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;

import de.prob.statespace.Transition;
import dedal.Assembly;
import dedal.CompClass;
import dedal.CompRole;
import dedal.Configuration;
import dedal.DedalDiagram;
import dedal.Interaction;
import dedal.Repository;
import dedal.Specification;
import dedal.impl.ClassConnectionImpl;
import dedal.impl.CompClassImpl;
import dedal.impl.CompInstanceImpl;
import dedal.impl.CompRoleImpl;
import dedal.impl.InstConnectionImpl;
import dedal.impl.RoleConnectionImpl;

public class ChangeParser {

	static String repo = "repo";

	public static void parse(List<Transition> initialChange) {

		EMFModelLoad loader = new EMFModelLoad();
		DedalDiagram myDedal = loader.load();
		parse(initialChange, myDedal);
	}

	public static void parse(List<Transition> initialChange,
			DedalDiagram myDedal) {
		String splitBy = "->";

		EMFModelLoad loader = new EMFModelLoad();
		// DedalDiagram myDedal = dd;

		/*
		 * for (int l = 0; l < initialChange2.size(); l++) { Transition
		 * initialChange = initialChange2.get(l);
		 */

		for (int i = 0; i < initialChange.size(); i++) {
			String name = initialChange.get(i).getName();
			if (!initialChange.get(i).getParams().equals(null)) {
				switch (name) {

				/* specification evolution rules */

				case "spec_addRole":
					if (initialChange.get(i).getParams().size() == 2) {
						String spec = (String) initialChange.get(i).getParams()
								.get(0);
						String newRole = (String) initialChange.get(i)
								.getParams().get(1);

						Repository myRepo = loader
								.RepositoryLoad(myDedal, repo);
						CompRoleImpl role = null;
						for (int j = 0; j < myRepo.getComponents().size(); j++) {
							if (myRepo.getComponents().get(j).getClass()
									.equals(CompRoleImpl.class)) {
								if (myRepo.getComponents().get(j).getId().equals(newRole)) {
									role = (CompRoleImpl) myRepo
											.getComponents().get(j);
								}
							}
						}

						if (!role.equals(null)) {
							((Specification) loader
									.ArchitectureDescriptionLoad(myDedal, spec))
									.getSpecComponents().add(role);
						}

					} else {

						System.out
								.println("The size of params does not equal the size required for the command "
										+ name + ".");
					}
					break;

				case "spec_connect":
					if (initialChange.get(i).getParams().size() == 3) {
						String spec = (String) initialChange.get(i).getParams()
								.get(2);
						String cl[] = ((String) initialChange.get(i)
								.getParams().get(0)).split(splitBy);
						String se[] = ((String) initialChange.get(i)
								.getParams().get(1)).split(splitBy);

						Specification mySpec = (Specification) loader
								.ArchitectureDescriptionLoad(myDedal, spec);

						Interaction intSe = null;
						Interaction intCl = null;
						for (int j = 0; j < mySpec.getSpecComponents().size(); j++) {

							CompRoleImpl component = (CompRoleImpl) mySpec
									.getSpecComponents().get(j);
							for (int k = 0; k < component.getCompInterfaces()
									.size(); k++) {
								if (component
										.getCompInterfaces()
										.get(k)
										.getName()
										.equals(se[1].substring(0,
												se[1].length() - 1))) {
									intSe = component.getCompInterfaces()
											.get(k);
								} else if (component
										.getCompInterfaces()
										.get(k)
										.getName()
										.equals(cl[1].substring(0,
												cl[1].length() - 1))) {
									intCl = component.getCompInterfaces()
											.get(k);
								}
							}
						}

						if (!intSe.equals(null) && !intCl.equals(null)) {
							RoleConnectionImpl connection = new RoleConnectionImpl();
							connection.setServerIntElem(intSe);
							connection.setServerCompElem((CompRole) intSe
									.eContainer());
							connection.setClientIntElem(intCl);
							connection.setClientCompElem((CompRole) intCl
									.eContainer());
							mySpec.getSpecConnections().add(connection);
						}

					} else {
						System.out
								.println("The size of params does not equal the size required for the command "
										+ name + ".");
					}
					break;

				case "spec_removeRole":
					if (initialChange.get(i).getParams().size() == 2) {
						String spec = (String) initialChange.get(i).getParams()
								.get(0);
						String role = (String) initialChange.get(i).getParams()
								.get(1);

						Specification mySpec = (Specification) loader
								.ArchitectureDescriptionLoad(myDedal, spec);

						for (int j = 0; j < mySpec.getSpecComponents().size(); j++) {
							if (mySpec.getSpecComponents().get(j).getId().equals(role)) {
								EcoreUtil.delete(mySpec.getSpecComponents()
										.get(j));
								System.out.println("specClass deleted");
								break;
							}
						}

					} else {
						System.out
								.println("The size of params does not equal the size required for the command "
										+ name + ".");
					}
					break;

				case "spec_disconnect":
					if (initialChange.get(i).getParams().size() == 3) {
						String spec = (String) initialChange.get(i).getParams()
								.get(0);
						String cl[] = ((String) initialChange.get(i)
								.getParams().get(2)).split(splitBy);
						String se[] = ((String) initialChange.get(i)
								.getParams().get(1)).split(splitBy);

						Specification mySpec = (Specification) loader
								.ArchitectureDescriptionLoad(myDedal, spec);
						int size = mySpec.getSpecConnections().size();
						for (int j = 0; j < size; j++) {
							RoleConnectionImpl connection = (RoleConnectionImpl) mySpec
									.getSpecConnections().get(j);
							if (connection
									.basicGetClientIntElem()
									.getName()
									.equals(cl[1].substring(0,
											cl[1].length() - 1))
									&& connection
											.basicGetServerIntElem()
											.getName()
											.equals(se[1].substring(0,
													se[1].length() - 1))) {
								EcoreUtil.delete(connection);
								System.out.println("deleted");
								break;

							}
						}

					} else {
						System.out
								.println("The size of params does not equal the size required for the command "
										+ name + ".");
					}
					break;

				case "spec_replaceRole":
					if (initialChange.get(i).getParams().size() == 3) {
						String spec = (String) initialChange.get(i).getParams()
								.get(0);
						String oldRole = (String) initialChange.get(i)
								.getParams().get(1);
						String newRole = (String) initialChange.get(i)
								.getParams().get(2);

						Specification mySpec = (Specification) loader
								.ArchitectureDescriptionLoad(myDedal, spec);

						for (int j = 0; j < mySpec.getSpecComponents().size(); j++) {
							if (mySpec.getSpecComponents().get(j).getId().equals(oldRole)) {
								EcoreUtil.delete(mySpec.getSpecComponents()
										.get(j));
								System.out.println("specClass deleted");
								break;
							}
						}

						Repository myRepo = loader
								.RepositoryLoad(myDedal, repo);
						CompRoleImpl role = null;
						for (int j = 0; j < myRepo.getComponents().size(); j++) {
							if (myRepo.getComponents().get(j).getClass()
									.equals(CompRoleImpl.class)) {
								if (myRepo.getComponents().get(j).getName()
										.equals(newRole)) {
									role = (CompRoleImpl) myRepo
											.getComponents().get(j);
								}
							}
						}

						if (!role.equals(null)) {
							((Specification) loader
									.ArchitectureDescriptionLoad(myDedal, spec))
									.getSpecComponents().add(role);
						}

					} else {
						System.out
								.println("The size of params does not equal the size required for the command "
										+ name + ".");
					}
					break;

				/* configuration evolution rules */

				case "config_addClass":
					if (initialChange.get(i).getParams().size() == 2) {
						String config = (String) initialChange.get(i)
								.getParams().get(0);
						String newClass = (String) initialChange.get(i)
								.getParams().get(1);

						Repository myRepo = loader
								.RepositoryLoad(myDedal, repo);
						CompClassImpl role = null;
						for (int j = 0; j < myRepo.getComponents().size(); j++) {
							if (myRepo.getComponents().get(j).getClass()
									.equals(CompClassImpl.class)) {
								if (myRepo.getComponents().get(j).getId().equals(newClass.replaceAll("[\\D]", ""))) {
									role = (CompClassImpl) myRepo
											.getComponents().get(j);
								}
							}
						}

						if (!role.equals(null)) {
							((Configuration) loader
									.ArchitectureDescriptionLoad(myDedal,
											config)).getConfigComponents().add(
									role);
						}

					} else {
						System.out
								.println("The size of params does not equal the size required for the command "
										+ name + ".");
					}
					break;

				case "config_addServer":

					break;

				case "config_class_connect":
					if (initialChange.get(i).getParams().size() == 3) {
						String config = (String) initialChange.get(i)
								.getParams().get(2);
						String[] cl = ((String) initialChange.get(i)
								.getParams().get(0)).split(splitBy);
						String[] se = ((String) initialChange.get(i)
								.getParams().get(1)).split(splitBy);

						Configuration myConfig = (Configuration) loader
								.ArchitectureDescriptionLoad(myDedal, config);

						Interaction intSe = null;
						Interaction intCl = null;

						for (int j = 0; j < myConfig.getConfigComponents()
								.size(); j++) {

							CompClassImpl component = (CompClassImpl) myConfig
									.getConfigComponents().get(j);
							for (int k = 0; k < component.getCompInterfaces()
									.size(); k++) {
								if (component
										.getCompInterfaces()
										.get(k)
										.getName()
										.equals(se[1].substring(0,
												se[1].length() - 1))) {
									intSe = component.getCompInterfaces()
											.get(k);
								} else if (component
										.getCompInterfaces()
										.get(k)
										.getName()
										.equals(cl[1].substring(0,
												cl[1].length() - 1))) {
									intCl = component.getCompInterfaces()
											.get(k);
								}
							}
						}

						if (!intSe.equals(null) && !intCl.equals(null)) {
							ClassConnectionImpl connection = new ClassConnectionImpl();
							connection.setServerIntElem(intSe);
							connection.setServerClassElem((CompClass) intSe
									.eContainer());
							connection.setClientIntElem(intCl);
							connection.setClientClassElem((CompClass) intCl
									.eContainer());
							myConfig.getConfigConnections().add(connection);
						}

					} else {
						System.out
								.println("The size of params does not equal the size required for the command "
										+ name + ".");
					}
					break;

				case "config_deleteServer":
					break;

				case "config_removeClass":
					if (initialChange.get(i).getParams().size() == 2) {
						String config = (String) initialChange.get(i)
								.getParams().get(0);
						String configComponent = (String) initialChange.get(i)
								.getParams().get(1);

						Configuration myConfig = (Configuration) loader
								.ArchitectureDescriptionLoad(myDedal, config);
						for (int j = 0; j < myConfig.getConfigComponents()
								.size(); j++) {
							if (myConfig.getConfigComponents().get(j).getId().equals(configComponent.replaceAll("[\\D]", ""))) {
								EcoreUtil.delete(myConfig.getConfigComponents()
										.get(j));
								System.out.println("configClass deleted");
								break;
							}
						}

					} else {
						System.out
								.println("The size of params does not equal the size required for the command "
										+ name + ".");
					}
					break;

				case "config_class_disconnect":
					if (initialChange.get(i).getParams().size() == 3) {
						String config = (String) initialChange.get(i)
								.getParams().get(0);
						String se[] = ((String) initialChange.get(i)
								.getParams().get(1)).split(splitBy);
						String cl[] = ((String) initialChange.get(i)
								.getParams().get(2)).split(splitBy);

						Configuration myConfig = (Configuration) loader
								.ArchitectureDescriptionLoad(myDedal, config);
						int size = myConfig.getConfigConnections().size();
						for (int j = 0; j < size; j++) {
							ClassConnectionImpl connection = (ClassConnectionImpl) myConfig
									.getConfigConnections().get(j);
							if (connection
									.basicGetClientIntElem()
									.getName()
									.equals(cl[1].substring(0,
											cl[1].length() - 1))
									&& connection
											.basicGetServerIntElem()
											.getName()
											.equals(se[1].substring(0,
													se[1].length() - 1))) {
								EcoreUtil.delete(connection);
								System.out.println("deleted");
								break;

							}
						}

					} else {
						System.out
								.println("The size of params does not equal the size required for the command "
										+ name + ".");
					}
					break;

				case "config_replaceClass":
					if (initialChange.get(i).getParams().size() == 3) {
						String config = (String) initialChange.get(i)
								.getParams().get(0);
						String oldClass = (String) initialChange.get(i)
								.getParams().get(1);
						String newClass = (String) initialChange.get(i)
								.getParams().get(2);

						Configuration myConfig = (Configuration) loader
								.ArchitectureDescriptionLoad(myDedal, config);

						for (int j = 0; j < myConfig.getConfigComponents()
								.size(); j++) {
							if (myConfig.getConfigComponents().get(j).getId().equals(oldClass.replaceAll("[\\D]", ""))) {
								EcoreUtil.delete(myConfig.getConfigComponents()
										.get(j));
								System.out.println("configClass deleted");
								break;
							}
						}

						Repository myRepo = loader
								.RepositoryLoad(myDedal, repo);
						CompClassImpl role = null;
						for (int j = 0; j < myRepo.getComponents().size(); j++) {
							if (myRepo.getComponents().get(j).getClass()
									.equals(CompClassImpl.class)) {
								if (myRepo.getComponents().get(j).getId().equals(newClass.replaceAll("[\\D]", ""))) {
									role = (CompClassImpl) myRepo
											.getComponents().get(j);
								}
							}
						}

						if (!role.equals(null)) {
							((Configuration) loader
									.ArchitectureDescriptionLoad(myDedal,
											config)).getConfigComponents().add(
									role);
						}

					} else {
						System.out
								.println("The size of params does not equal the size required for the command "
										+ name + ".");
					}
					break;

				/* Assembly evolution rules */

				case "asm_deployInstance":
					if (initialChange.get(i).getParams().size() == 2) {
						String asm = (String) initialChange.get(i).getParams()
								.get(0);
						String inst = (String) initialChange.get(i).getParams()
								.get(1);

						Repository myRepo = loader
								.RepositoryLoad(myDedal, repo);
						CompInstanceImpl instance = null;
						for (int j = 0; j < myRepo.getComponents().size(); j++) {
							if (myRepo.getComponents().get(j).getClass()
									.equals(CompInstanceImpl.class)) {
								if (myRepo.getComponents().get(j).getId().equals(inst)) {
									instance = (CompInstanceImpl) myRepo
											.getComponents().get(j);
									instance.setName(inst);
								}
							}
						}

						if (!instance.equals(null)) {
							((Assembly) loader.ArchitectureDescriptionLoad(
									myDedal, asm)).getAssmComponents().add(
									instance);
						}

					} else {
						System.out
								.println("The size of params does not equal the size required for the command "
										+ name + ".");
					}
					break;
				case "asm_addServerInstance":
					break;

				case "asm_bind":
					if (initialChange.get(i).getParams().size() == 3) {
						String asm = (String) initialChange.get(i).getParams()
								.get(2);
						String cl[] = ((String) initialChange.get(i)
								.getParams().get(0)).split(splitBy);
						String se[] = ((String) initialChange.get(i)
								.getParams().get(1)).split(splitBy);

						Assembly myAsm = (Assembly) loader
								.ArchitectureDescriptionLoad(myDedal, asm);

						Interaction intSe = null;
						Interaction intCl = null;
						for (int j = 0; j < myAsm.getAssmComponents().size(); j++) {

							CompInstanceImpl component = (CompInstanceImpl) myAsm
									.getAssmComponents().get(j);
							for (int k = 0; k < component.getCompInterfaces()
									.size(); k++) {
								if (component
										.getCompInterfaces()
										.get(k)
										.getName()
										.equals(se[1].substring(0,
												se[1].length() - 1))) {
									intSe = component.getCompInterfaces()
											.get(k);
								} else if (component
										.getCompInterfaces()
										.get(k)
										.getName()
										.equals(cl[1].substring(0,
												cl[1].length() - 1))) {
									intCl = component.getCompInterfaces()
											.get(k);
								}
							}
						}

						if (!intSe.equals(null) && !intCl.equals(null)) {
							InstConnectionImpl connection = new InstConnectionImpl();
							connection.setServerIntElem(intSe);
							connection
									.setServerInstElem((CompInstanceImpl) intSe
											.eContainer());
							connection.setClientIntElem(intCl);
							connection
									.setClientInstElem((CompInstanceImpl) intCl
											.eContainer());
							myAsm.getAssemblyConnections().add(connection);
						}

					} else {
						System.out
								.println("The size of params does not equal the size required for the command "
										+ name + ".");
					}
					break;
				case "asm_removeInstance":
					if (initialChange.get(i).getParams().size() == 2) {
						String asm = (String) initialChange.get(i).getParams()
								.get(0);
						String inst = (String) initialChange.get(i).getParams()
								.get(1);

						Assembly myAsm = (Assembly) loader
								.ArchitectureDescriptionLoad(myDedal, asm);

						for (int j = 0; j < myAsm.getAssmComponents().size(); j++) {
							if (myAsm.getAssmComponents().get(j).getId().equals(inst)) {
								EcoreUtil.delete(myAsm.getAssmComponents().get(
										j));
								System.out.println("asmComp deleted");
								break;
							}
						}

					} else {
						System.out
								.println("The size of params does not equal the size required for the command "
										+ name + ".");
					}
					break;
				case "asm_unbind":
					if (initialChange.get(i).getParams().size() == 3) {
						String asm = (String) initialChange.get(i).getParams()
								.get(0);
						String se[] = ((String) initialChange.get(i)
								.getParams().get(1)).split(splitBy);
						String cl[] = ((String) initialChange.get(i)
								.getParams().get(2)).split(splitBy);

						Assembly myAsm = (Assembly) loader
								.ArchitectureDescriptionLoad(myDedal, asm);
						int size = myAsm.getAssemblyConnections().size();
						for (int j = 0; j < size; j++) {
							InstConnectionImpl connection = (InstConnectionImpl) myAsm
									.getAssemblyConnections().get(j);
							if (connection
									.basicGetClientIntElem()
									.getName()
									.equals(cl[1].substring(0,
											cl[1].length() - 1))
									&& connection
											.basicGetServerIntElem()
											.getName()
											.equals(se[1].substring(0,
													se[1].length() - 1))) {
								EcoreUtil.delete(connection);
								System.out.println("deleted");
								break;
							}
						}

					} else {
						System.out
								.println("The size of params does not equal the size required for the command "
										+ name + ".");
					}
					break;
				case "asm_deleteServerInstance":
					break;

				case "asm_replaceInstance":
					if (initialChange.get(i).getParams().size() == 3) {
						String asm = (String) initialChange.get(i).getParams()
								.get(0);
						String oldInst = (String) initialChange.get(i)
								.getParams().get(1);
						String newInst = (String) initialChange.get(i)
								.getParams().get(2);

						Assembly myAsm = (Assembly) loader
								.ArchitectureDescriptionLoad(myDedal, asm);

						for (int j = 0; j < myAsm.getAssmComponents().size(); j++) {
							if (myAsm.getAssmComponents().get(j).getId().equals(oldInst)) {
								EcoreUtil.delete(myAsm.getAssmComponents().get(
										j));
								System.out.println("asmComp deleted");
								break;
							}
						}

						Repository myRepo = loader
								.RepositoryLoad(myDedal, repo);
						CompInstanceImpl instance = null;
						for (int j = 0; j < myRepo.getComponents().size(); j++) {
							if (myRepo.getComponents().get(j).getClass()
									.equals(CompInstanceImpl.class)) {
								if (myRepo.getComponents().get(j).getName()
										.equals(newInst)) {
									instance = (CompInstanceImpl) myRepo
											.getComponents().get(j);
								}
							}
						}

						if (!instance.equals(null)) {
							((Assembly) loader.ArchitectureDescriptionLoad(
									myDedal, asm)).getAssmComponents().add(
									instance);
						}

					} else {
						System.out
								.println("The size of params does not equal the size required for the command "
										+ name + ".");
					}
					break;

				}
			}
		}

		loader.save(myDedal);
	}
}
