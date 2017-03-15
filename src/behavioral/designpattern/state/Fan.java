package behavioral.designpattern.state;

public class Fan {
	
	State fanOffState;
	State fanLowState;
	State fanMediumState;
	State fanHighState;
	
	State state;
	
	public Fan(){
		fanOffState = new FanOffState(this);
		fanLowState = new FanLowState(this);
		fanMediumState = new FanMediumState(this);
		fanHighState = new FanHighState(this);
		
		state = fanOffState;
	}
	
	public State getFanOffState() {
		return fanOffState;
	}
	
	public State getFanLowState() {
		return fanLowState;
	}

	public State getFanMediumState() {
		return fanMediumState;
	}

	public State getFanHighState() {
		return fanHighState;
	}

	public State getState() {
		return state;
	}

	public void pullChain(){		
		state.handleRequest();
	}
	
	public String toString(){
		return state.toString();
	}	
	
	public void setState(State state){
		this.state = state;
	}
	

}
