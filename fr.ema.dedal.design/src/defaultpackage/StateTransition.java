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
