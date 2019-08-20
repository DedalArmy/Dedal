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


public class StateTransition {
	private int stateId;
	private int transitionId;
	//private int cost = 0;
	

	StateTransition(int id, int transitionId){
		this.stateId = id;
		this.transitionId = transitionId;
	}
	
	/*StateTransition(int id, int transitionId, int cost){
		this.stateId = id;
		this.transitionId = transitionId;
		this.cost = cost;
	}*/
	
	public int getStateId() {
		return stateId;
	}

	public int getTransitionId() {
		return transitionId;
	}
	
	/*public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}*/
}
