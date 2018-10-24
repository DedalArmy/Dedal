package fr.ema.dedal.design.templates;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;

import fr.ema.dedal.dedalToB.main.GenerateAll;
import dedal.ArchitectureDescription;
import dedal.Assembly;
import dedal.CompClass;
import dedal.CompInstance;
import dedal.CompRole;
import dedal.CompositeCompClass;
import dedal.Configuration;
import dedal.DedalDiagram;
import dedal.Interface;
import dedal.Specification;
import de.prob.statespace.Transition;
import defaultpackage.ChangeParser;
import defaultpackage.DedalManager;

/*
 * The class DedalServices includes services that can be called from 
 * the GUI (generated by SIRIUS) such as :
 * generating B models, requesting change, analyzing properties, ...
 * */

public class DedalServices {

	static public DedalManager animationHandler = new DedalManager();
	static public List<String> evolutionPlan = new ArrayList<String>();
	static public DedalDiagram dedalInstance = null;
	private static Specification archSpec = null;
	private static Configuration archConfig = null;
	private static Assembly archAssm = null;

	/*
	 * This method generates B specifications from a Dedal diagram deduced from
	 * the graphical view
	 */

	public static void generateBModel(DedalDiagram dd) {
		System.out.println("generate B Models");
		// Initialize the architectural model
		dedalInstance = dd;
		for (ArchitectureDescription arch : dd.getArchitectureDescriptions()) {
			if (Specification.class.isInstance(arch)) {
				archSpec = (Specification) arch;
			} else if (Configuration.class.isInstance(arch) & archConfig == null) {
				archConfig = (Configuration) arch;
			} else if (Assembly.class.isInstance(arch)) {
				archAssm = (Assembly) arch;
			}
		}
		// Get The URI of the diagram
		URI uri = CommonPlugin.resolve(dd.eResource().getURI());
		System.out.println(uri.toFileString());
		// get the arguments for the acceleo module that will generate the B
		// models (uri, destination folder)
		String[] args = new String[2];
		args[0] = uri.toFileString();
		File destDir = new File(System.getProperty("user.home") + "/DedalStudio/Generated");
		if (!destDir.exists()) {
			try {
				destDir.mkdir();
			} catch (SecurityException se) {
				System.out.println("unable to create destination folder");
			}
		}
		System.out.println(destDir.getAbsolutePath() + " created");
		args[1] = destDir.getAbsolutePath();
		GenerateAll.main(args);
		System.out.println("B models generated");
	}

	public static void checkArchConsistency(ArchitectureDescription arch) {

		/*
		 * if (animationHandler.isInitialized()) {
		 * 
		 * boolean consistency = false; if
		 * (Specification.class.isInstance(arch)) consistency = animationHandler
		 * .checkFormula("specification_consistency"); else if
		 * (Configuration.class.isInstance(arch)) consistency = animationHandler
		 * .checkFormula("config_consistency"); else if
		 * (Assembly.class.isInstance(arch)) consistency = animationHandler
		 * .checkFormula("assembly_consistency");
		 * System.out.println(arch.getName() + " consistency == " +
		 * consistency); }
		 */
	}

	public static void requestChange(CompClass cl) {

		// List<Transition> initialChange =
		// animationHandler.findInitialChange("configLevel", "s_cl"+cl.getId(),
		// "GOAL");
		// List<Transition> bottomUpChange =
		// animationHandler.findPropagatedChange("specLevel",
		// "specification_consistency & specConfigCoherence");
		// List<Transition> topDownChange =
		// animationHandler.findPropagatedChange("asmLevel",
		// "assembly_consistency & configAssemblyCoherence");
		String specName = archSpec.getName();
		String configName = archConfig.getName();
		String asmName = archAssm.getName();
		String evolutionGoal = "config_consistency & " + "s_cl" + cl.getId() + " : config_components(" + configName
				+ ")";
		animationHandler.initializeModel(specName, configName, asmName);
		List<Transition> initialChange2 = animationHandler.findLocalChangeWithHeuristic("configLevel",
				"s_cl" + cl.getId(), evolutionGoal);
		List<Transition> bottomUpChange2 = animationHandler.findPropagatedChangeWithHeuristic("specLevel",
				"specification_consistency & specConfigCoherence");
		List<Transition> topDownChange2 = animationHandler.findPropagatedChangeWithHeuristic("asmLevel",
				"assembly_consistency & configAssemblyCoherence");
		for (Transition tr : topDownChange2) {
			evolutionPlan.add(tr.getPrettyRep());
		}
		return;
		// ChangeParser.parse(initialChange, (DedalDiagram)
		// cl.eContainer().eContainer());
	}

	public static void requestChange(CompRole cr) {

		// List<Transition> initialChange =
		// animationHandler.findInitialChange("specLevel", "s_cr"+cr.getId(),
		// "GOAL");
		// List<Transition> topDownChange1 =
		// animationHandler.findPropagatedChange("configLevel",
		// "config_consistency & specConfigCoherence");
		// List<Transition> topDownChange2 =
		// animationHandler.findPropagatedChange("asmLevel",
		// "assembly_consistency & configAssemblyCoherence");
		List<Transition> initialChange2 = animationHandler.findLocalChangeWithHeuristic("specLevel",
				"s_cr" + cr.getId(), "GOAL");
		List<Transition> topDownChange12 = animationHandler.findPropagatedChangeWithHeuristic("configLevel",
				"config_consistency & specConfigCoherence");
		List<Transition> topDownChange22 = animationHandler.findPropagatedChangeWithHeuristic("asmLevel",
				"assembly_consistency & configAssemblyCoherence");
		return;
		// ChangeParser.parse(initialChange, (DedalDiagram)
		// cl.eContainer().eContainer());
	}

	public static void requestChange(CompInstance ci) {

		List<Transition> initialChange = animationHandler.findInitialChange("asmLevel", "ci" + ci.getId(), "GOAL");
		List<Transition> bottomUpChange1 = animationHandler.findPropagatedChange("configLevel",
				"config_consistency &  configAssemblyCoherence");
		// List<Transition> bottomUpChange2 =
		// animationHandler.findPropagatedChange("specLevel",
		// "specification_consistency & specConfigCoherence");
		/*
		 * List<Transition> initialChange2 =
		 * animationHandler.findLocalChangeWithHeuristic("asmLevel",
		 * "ci"+ci.getId(), "GOAL"); List<Transition> bottomUpChange11 = null;
		 * if (initialChange2 != null) bottomUpChange11 =
		 * animationHandler.findPropagatedChangeWithHeuristic("configLevel",
		 * "config_consistency &  configAssemblyCoherence"); List<Transition>
		 * bottomUpChange21 = null; if (bottomUpChange11 != null)
		 * bottomUpChange21 =
		 * animationHandler.findPropagatedChangeWithHeuristic("specLevel",
		 * "specification_consistency & specConfigCoherence");
		 */
		return;
		// ChangeParser.parse(initialChange, (DedalDiagram)
		// cl.eContainer().eContainer());
	}
	
	public static void explore(DedalDiagram dd) {
		MessageDialog.openInformation(null, "Inspect Library", "Start the inspector");
	}
}
