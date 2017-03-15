package behavioral.designpattern.state;

public class FanMediumState extends State {
	
	
private Fan fan;
	
	public FanMediumState(Fan fan){
		this.fan = fan;
		
	}
	
	@Override
	public void handleRequest(){
		System.out.println("Tuning fan on to high.");
		fan.setState(fan.getFanHighState());
	}
	
	public String toString(){
		return "Fan is medium.";
	}

}
