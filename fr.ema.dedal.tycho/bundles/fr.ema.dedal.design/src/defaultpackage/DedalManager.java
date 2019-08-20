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

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Stack;
import java.util.function.Predicate;

import util.Set;
import de.be4.classicalb.core.parser.exceptions.BException;
import de.prob.Main;
import de.prob.model.classicalb.ClassicalBModel;
import de.prob.scripting.Api;
import de.prob.statespace.StateSpace;
import de.prob.statespace.Trace;
import de.prob.statespace.Transition;

public class DedalManager {

	private Api api;
	private ClassicalBModel bModel;
	private Trace trace;
	private boolean initialization = false;
	private String changeArtifact = "";
	private String initialChangeLevel;

	public static final String EVOLUTION_MANAGER_FILE = System
			.getProperty("user.home")
			+ "/DedalStudio/Generated/EvolutionManager.mch";

	public void initializeModel(String specName, String configName,
			String assmName) {
		api = Main.getInjector().getInstance(Api.class);
		// String file = "C:/Users/acer/Generated/EvolutionManager.mch";
		// String file =
		// "C:/Users/acer/Documents/Generated/EvolutionManagerAssm.mch";
		// String file =
		// "C:/Users/acer/Documents/Generated/EvolutionManagerSpec.mch";
		try {
			bModel = api.b_load(EVOLUTION_MANAGER_FILE);
			StateSpace sp = bModel.getStateSpace();
			trace = new Trace(sp);
			// trace = trace.add(0);
			for (int i = 0; i <= 12; i++)
				trace = trace.add(i);
			List<String> params = new ArrayList<String>();
			params.add(specName);
			params.add(configName);
			params.add(assmName);
			trace = trace.addTransitionWith("mng_setTargetArchitectures",
					params);
			initialization = true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List<Transition> findInitialChange(String changeLevel,
			String changeArtifact, String formula) {

		/* Initialize model */
		initializeModel("HASSpec", "HASConfig", "HASAssm");
		/* set initial change level */
		List<String> params = new ArrayList<String>();
		params.add(changeLevel);
		trace = trace.addTransitionWith("setChangeLevel", params);

		/* initialize stack */
		Stack<StateTransition> stack = new Stack<StateTransition>();
		Set visited = new Set();

		// Applying initiated change
		for (Transition ruleId : trace.getNextTransitions()) {
			ruleId.evaluate();
			if (ruleId.getParams().toString().contains(changeArtifact)) {
				stack.push(new StateTransition(Integer.parseInt(ruleId
						.getDestination().getId()), Integer.parseInt(ruleId
						.getId())));
				break;
			}
		}

		Predicate<Transition> filter = t -> t.getName()
				.equals("setChangeLevel");

		// Depth first search algorithm for a sequence reaching goal
		long time = System.currentTimeMillis();
		while (!stack.empty()) {
			StateTransition st = stack.peek();
			if (!visited.contains(st)) {
				trace = trace.add(st.getTransitionId());
				visited.put(st);
				boolean goal = Boolean.parseBoolean(trace.evalCurrent(formula)
						.toString());
				if (goal) {
					time = System.currentTimeMillis() - time;
					System.out.println("Goal reached in:" + time);
					return trace.getTransitionList();
				}
				if (System.currentTimeMillis() - time > 180000) {
					System.out.println("Echeeeeeeeeeeeec");
					return null;
				}
				/*
				 * filter the set of next transitions so that only evolution
				 * operations are considered (eliminate setchangelevel operation
				 * instances)
				 */
				Collection<Transition> nextTransitions = trace
						.getNextTransitions();
				nextTransitions.removeIf(filter);
				for (Transition ruleId : nextTransitions) {
					stack.push(new StateTransition(Integer.parseInt(ruleId
							.getDestination().getId()), Integer.parseInt(ruleId
							.getId())));
				}
			} else {
				st = stack.pop();
				/*
				 * if (st.getStateId() ==
				 * Integer.parseInt(trace.getCurrentState() .getId()))
				 */
				trace = trace.back();
			}
		}
		return null;
	}

	public List<Transition> findPropagatedChange(String changeLevel,
			String formula) {

		boolean goal = Boolean.parseBoolean(trace.evalCurrent(formula)
				.toString());
		if (goal)
			return trace.getTransitionList();

		/* set change level to changeLevel */
		List<String> params = new ArrayList<String>();
		params.add(changeLevel);
		trace = trace.addTransitionWith("setChangeLevel", params);
		Stack<StateTransition> stack = new Stack<StateTransition>();
		Set visited = new Set();

		Predicate<Transition> filter = t -> t.getName()
				.equals("setChangeLevel");
		// Depth first search algorithm for a sequence reaching goal

		/*
		 * filter the set of next transitions so that only evolution operations
		 * are considered
		 */
		Collection<Transition> nextTransitions = trace.getNextTransitions();
		nextTransitions.removeIf(filter);
		long time = System.currentTimeMillis();
		for (Transition ruleId : nextTransitions) {
			ruleId.evaluate();
			stack.push(new StateTransition(Integer.parseInt(ruleId
					.getDestination().getId()),
					Integer.parseInt(ruleId.getId())));
		}

		while (!stack.empty()) {
			StateTransition st = stack.peek();
			if (!visited.contains(st)) {
				trace = trace.add(st.getTransitionId());
				visited.put(st);
				goal = Boolean.parseBoolean(trace.evalCurrent(formula)
						.toString());
				if (goal) {
					time = System.currentTimeMillis() - time;
					System.out.println("Goal reached in:" + time);
					return trace.getTransitionList();
				}
				if (System.currentTimeMillis() - time > 180000) {
					System.out.println("Echeeeeeeeeeeeec");
					return null;
				}
				nextTransitions = trace.getNextTransitions();
				nextTransitions.removeIf(filter);
				for (Transition ruleId : nextTransitions) {
					// System.out.println(ruleId.getRep());
					ruleId.evaluate();
					stack.push(new StateTransition(Integer.parseInt(ruleId
							.getDestination().getId()), Integer.parseInt(ruleId
							.getId())));
				}
			} else {
				st = stack.pop();
				/*
				 * if (st.getStateId() ==
				 * Integer.parseInt(trace.getCurrentState() .getId()))
				 */
				trace = trace.back();
			}
		}
		return null;
	}

	public List<Transition> findLocalChangeWithHeuristic(String changeLevel,
			String changeArtifact, String formula) {

		/* Initialize model */
		this.changeArtifact = changeArtifact;
		// initializeModel("HASSpec", "HASConfig", "HASAssm");
		/* set initial change level */
		List<String> params = new ArrayList<String>();
		params.add(changeLevel);
		trace = trace.addTransitionWith("setChangeLevel", params);

		/* initialize stack */
		Stack<StateTransition> stack = new Stack<StateTransition>();
		Set visited = new Set();

		/* set operations filters */
		Predicate<Transition> filter = t -> t.getName()
				.equals("setChangeLevel");
		Predicate<Transition> highPriorityFilter = t -> t.getParams()
				.toString().contains(changeArtifact);
		Predicate<Transition> lowPriorityFilter = t -> t.getName().contains(
				"addClass")
				| t.getName().contains("addRole")
				| t.getName().contains("deploy");
		Collection<Transition> nextTransitions = trace.getNextTransitions();
		// nextTransitions.removeIf(filter);
		Collection<Transition> priorTransitions = trace.getNextTransitions();
		Collection<Transition> badTransitions = null;
		for (Transition ruleId : nextTransitions)
			ruleId.evaluate();
		nextTransitions.removeIf(highPriorityFilter);
		priorTransitions.removeAll(nextTransitions);
		priorTransitions.removeIf(filter);
		/* set current main artifact to initial change artifact */
		String currentMainArtifact = changeArtifact;

		// Start DFS algorithm to find goal state

		long time = System.currentTimeMillis();
		int currentStateId = Integer.parseInt(trace.getCurrentState().getId());
		for (Transition ruleId : priorTransitions) {
			stack.push(new StateTransition(currentStateId, Integer
					.parseInt(ruleId.getId())));
		}
		while (!stack.empty()) {
			StateTransition st = stack.peek();
			if (!visited.contains(st)) {
				trace = trace.add(st.getTransitionId());
				boolean goal = Boolean.parseBoolean(trace.evalCurrent(formula)
						.toString());
				if (goal) {
					time = System.currentTimeMillis() - time;
					System.out.println("Goal reached in:" + time);
					return trace.getTransitionList();
				}
				if (System.currentTimeMillis() - time > 180000) {
					System.out.println("Echeeeeeeeeeeeec");
					return null;
				}
				// add current transition to visited set
				visited.put(st);
				// update main artifact
				if (trace.getCurrentTransition().getReturnValues().size() > 0
						& (!trace.getCurrentTransition().getReturnValues()
								.toString().contains(currentMainArtifact) | currentMainArtifact == ""))
					currentMainArtifact = trace.getCurrentTransition()
							.getReturnValues().get(0);
				String mainArtifact = currentMainArtifact;

				String aux = "";
				if (mainArtifact.contains("ct"))
					aux = mainArtifact.replace("ct", "cl");
				else if (mainArtifact.contains("cl"))
					aux = mainArtifact.replace("cl", "ct");
				String mainArtifact2 = aux;
				/*
				 * Classify the set of next transitions using priority filters
				 */
				highPriorityFilter = t -> t.getParams().toString()
						.contains(mainArtifact);
				Predicate<Transition> highPriorityFilter2 = t -> t.getParams()
						.toString().contains(mainArtifact2);
				nextTransitions = trace.getNextTransitions();
				priorTransitions = trace.getNextTransitions();
				badTransitions = trace.getNextTransitions();
				for (Transition ruleId : nextTransitions)
					ruleId.evaluate();
				nextTransitions.removeIf(highPriorityFilter);
				if (mainArtifact2 != "")
					nextTransitions.removeIf(highPriorityFilter2);
				nextTransitions.removeIf(filter);
				priorTransitions.removeAll(nextTransitions);
				priorTransitions.removeIf(filter);
				nextTransitions.removeIf(lowPriorityFilter);
				badTransitions.removeAll(nextTransitions);
				badTransitions.removeAll(priorTransitions);
				badTransitions.removeIf(filter);
				/* update current state */
				currentStateId = Integer.parseInt(trace.getCurrentState()
						.getId());
				for (Transition ruleId : badTransitions) {
					stack.push(new StateTransition(currentStateId, Integer
							.parseInt(ruleId.getId())));
				}
				for (Transition ruleId : nextTransitions) {
					stack.push(new StateTransition(currentStateId, Integer
							.parseInt(ruleId.getId())));
				}
				for (Transition ruleId : priorTransitions) {
					stack.push(new StateTransition(currentStateId, Integer
							.parseInt(ruleId.getId())));
				}

			} else {
				st = stack.pop();
				trace = trace.back();
			}
		}
		return null;
	}

	public List<Transition> findPropagatedChangeWithHeuristic(
			String changeLevel, String formula) {

		boolean goal = Boolean.parseBoolean(trace.evalCurrent(formula)
				.toString());
		if (goal)
			return trace.getTransitionList();

		/* set change level to changeLevel */
		List<String> params = new ArrayList<String>();
		params.add(changeLevel);
		trace = trace.addTransitionWith("setChangeLevel", params);

		/*
		 * set current main artifact that corresponds to the initial change
		 * artifact
		 */
		String currentMainArtifact = "";
		String currentMainArtifact2 = "";
		// boolean highPriorityFilter2Mode = false;
		if (changeLevel == "specLevel") {
			// System.out.println(trace.getCurrentState().eval("realizes[{"+changeArtifact+"}]"));
			// currentMainArtifact =
			// trace.getCurrentState().eval("realizes[{"+changeArtifact+"}]").toString();
			currentMainArtifact = "s_cr39";
		} else if (changeLevel == "configLevel") {
			// currentMainArtifact = "s_cl86";
			// currentMainArtifact = "ct32";

			// highPriorityFilter2Mode = true;
			currentMainArtifact = "s_cl520";
			// currentMainArtifact = "";
			// changeArtifact = currentMainArtifact;
			// currentMainArtifact =
			// trace.getCurrentState().eval("realizes~[{"+changeArtifact+"}]").toString();
			currentMainArtifact2 = currentMainArtifact.replaceFirst("ct", "cl");
		} else if (changeLevel == "asmLevel") {
			// currentMainArtifact =
			// trace.getCurrentState().eval("comp_instantiates~("+changeArtifact+")").toString();
			currentMainArtifact = "s_ci53";
			// currentMainArtifact = "";

		}
		String initMainArtifact = currentMainArtifact;
		String initMainArtifact2 = currentMainArtifact2;
		/* set operations filters */
		Predicate<Transition> filter = t -> t.getName()
				.equals("setChangeLevel");
		Predicate<Transition> highPriorityFilter = t -> t.getParams()
				.toString().contains(initMainArtifact);
		Predicate<Transition> highPriorityFilter2 = t -> t.getParams()
				.toString().contains(initMainArtifact2);
		Predicate<Transition> lowPriorityFilter = t -> t.getName().contains(
				"addClass")
				| t.getName().contains("addRole")
				| t.getName().contains("deploy");
		Collection<Transition> nextTransitions = trace.getNextTransitions();
		// nextTransitions.removeIf(filter);
		Collection<Transition> priorTransitions = trace.getNextTransitions();
		Collection<Transition> badTransitions = null;
		for (Transition ruleId : nextTransitions)
			ruleId.evaluate();
		nextTransitions.removeIf(highPriorityFilter);
		if (initMainArtifact2 != "")
			nextTransitions.removeIf(highPriorityFilter2);
		priorTransitions.removeAll(nextTransitions);
		priorTransitions.removeIf(filter);
		// Start DFS algorithm to find goal state

		/* initialize Stack */
		Stack<StateTransition> stack = new Stack<StateTransition>();
		Set visited = new Set();

		long time = System.currentTimeMillis();
		int currentStateId = Integer.parseInt(trace.getCurrentState().getId());
		for (Transition ruleId : priorTransitions) {
			stack.push(new StateTransition(currentStateId, Integer
					.parseInt(ruleId.getId())));
		}
		while (!stack.empty()) {
			StateTransition st = stack.peek();
			if (!visited.contains(st)) {
				trace = trace.add(st.getTransitionId());
				goal = Boolean.parseBoolean(trace.evalCurrent(formula)
						.toString());
				if (goal) {
					time = System.currentTimeMillis() - time;
					System.out.println("Goal reached in:" + time);
					return trace.getTransitionList();
				}
				if (System.currentTimeMillis() - time > 180000) {
					System.out.println("Echeeeeeeeeeeeec");
					return null;
				}
				// add current transition to visited set
				visited.put(st);
				// update main artifact

				if (trace.getCurrentTransition().getReturnValues().size() > 0
						& (!trace.getCurrentTransition().getReturnValues()
								.toString().contains(currentMainArtifact) | currentMainArtifact == "")) {
					/*
					 * if (currentMainArtifact.contains("ct"))
					 * currentMainArtifact =
					 * currentMainArtifact.replaceFirst("ct", "cl"); else if
					 * (currentMainArtifact.contains("cl")){ currentMainArtifact
					 * = currentMainArtifact.replaceFirst("cl", "ct"); } else
					 */
					currentMainArtifact = trace.getCurrentTransition()
							.getReturnValues().get(0);
				}
				String mainArtifact = currentMainArtifact;
				String aux = "";
				if (mainArtifact.contains("ct"))
					aux = mainArtifact.replace("ct", "cl");
				else if (mainArtifact.contains("cl"))
					aux = mainArtifact.replace("cl", "ct");
				String mainArtifact2 = aux;
				/*
				 * if (trace.getCurrentTransition().getName().contains("delete")
				 * | trace.getCurrentTransition().getName().contains("remove"))
				 * lowPriorityFilterMode = false;
				 */
				/*
				 * Classify the set of next transitions using priority filters
				 */
				highPriorityFilter = t -> t.getParams().toString()
						.contains(mainArtifact);
				highPriorityFilter2 = t -> t.getParams().toString()
						.contains(mainArtifact2);
				nextTransitions = trace.getNextTransitions();
				priorTransitions = trace.getNextTransitions();
				badTransitions = trace.getNextTransitions();
				for (Transition ruleId : nextTransitions)
					ruleId.evaluate();
				nextTransitions.removeIf(highPriorityFilter);
				if (mainArtifact2 != "")
					nextTransitions.removeIf(highPriorityFilter2);
				nextTransitions.removeIf(filter);
				priorTransitions.removeAll(nextTransitions);
				priorTransitions.removeIf(filter);
				/*
				 * if (lowPriorityFilterMode)
				 * nextTransitions.removeIf(lowPriorityFilter); else
				 * lowPriorityFilterMode = true;
				 */
				nextTransitions.removeIf(lowPriorityFilter);
				badTransitions.removeAll(nextTransitions);
				badTransitions.removeAll(priorTransitions);
				badTransitions.removeIf(filter);
				/* update current state */
				currentStateId = Integer.parseInt(trace.getCurrentState()
						.getId());

				for (Transition ruleId : badTransitions) {
					stack.push(new StateTransition(currentStateId, Integer
							.parseInt(ruleId.getId())));
				}
				for (Transition ruleId : nextTransitions) {
					stack.push(new StateTransition(currentStateId, Integer
							.parseInt(ruleId.getId())));
				}
				for (Transition ruleId : priorTransitions) {
					stack.push(new StateTransition(currentStateId, Integer
							.parseInt(ruleId.getId())));
				}

			} else {
				st = stack.pop();
				trace = trace.back();
			}
		}
		return null;
	}
	
	private String findPropagatedMainArtifact(String changeLevel){
		String result = "";
		if (changeLevel == "specLevel") {
			// System.out.println(trace.getCurrentState().eval("realizes[{"+changeArtifact+"}]"));
			// currentMainArtifact =
			result = trace.getCurrentState().eval("realizes[{"+changeArtifact+"}]").toString();
			result = result.replaceAll("{}", "");
			result = result.split(",")[0];
			this.changeArtifact = result;
			return result;
		}
		if (changeLevel == "configLevel") {
			if (initialChangeLevel == "specLevel"){
				result = trace.getCurrentState().eval("realizes~[{"+changeArtifact+"}]").toString();
			}
			else {
				result = trace.getCurrentState().eval("comp_instantiates~[{"+changeArtifact+"}]").toString();
			}
			this.changeArtifact = result;
			return result;
			
			// currentMainArtifact = "";
			// changeArtifact = currentMainArtifact;
			// currentMainArtifact =
			// trace.getCurrentState().eval("realizes~[{"+changeArtifact+"}]").toString();
			//currentMainArtifact2 = currentMainArtifact.replaceFirst("ct", "cl");
		}
		if (changeLevel == "asmLevel") {
			// currentMainArtifact =
			result = trace.getCurrentState().eval("comp_instantiates~("+changeArtifact+")").toString();
			result = result.replaceAll("{}", "");
			result = result.split(",")[0];
			this.changeArtifact = result;
			return result;
			// currentMainArtifact = "";

		}
		return result;
	}

	public Api getApi() {
		return api;
	}

	public ClassicalBModel getbModel() {
		return bModel;
	}

	public Trace getTrace() {
		return trace;
	}

}
