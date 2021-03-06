package behavioral.designpattern.state;

public class FanLowState extends State {
	
private Fan fan;
	
	public FanLowState(Fan fan){
		this.fan = fan;
	}
	@Override
	public void handleRequest(){
		System.out.println("Tuning fan on to medium.");
		fan.setState(fan.getFanMediumState());
	}
	
	public String toString(){
		return "Fan is low.";
	}


}
