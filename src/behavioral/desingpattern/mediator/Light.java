package behavioral.desingpattern.mediator;

//is receiver
public class Light {
	
	private boolean isOn = false;
	private String location = "";
	
	public Light(){
		
	}
	
    public Light(String location){
		this.location = location;
	}
	
	public boolean isOn(){
		return isOn;
	}
	
	public void toggle(){
		
		if(isOn){
			off();
			isOn = false;
		}
		else{
			on();
			isOn = true;
		}
	}
	
	public void on(){
		
		if(location.equalsIgnoreCase("bedroom")){
			System.out.println("Bedroom Light switched on.");
		}
		
		if(location.equalsIgnoreCase("kitchen")){
			System.out.println("Kichen Light switched on.");
		}
		
	}
	
	public void off(){
		
		if(location.equalsIgnoreCase("bedroom")){
			System.out.println("Bedroom Light switched off.");
		}
		
		if(location.equalsIgnoreCase("kitchen")){
			System.out.println("Kitchen Light switched off.");
		}
	}

}
