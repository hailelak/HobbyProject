package behavioral.desingpattern.mediator;


public class MediatorDemo {

	public static void main(String[] args) {

		Mediator mediator = new Mediator();
		
		Light bedroomLight = new Light("bedroom");
		Light kichtenLight = new Light("kitchen");
		
		mediator.registerLight(bedroomLight);
		mediator.registerLight(kichtenLight);
		
		Command turnOnAllLightsCommand = new TurnOnAllLightsCommand(mediator);		
		
		turnOnAllLightsCommand.execute();
		
		Command turnOffAllLightsCommand = new TurnOffAllLightsCommand(mediator);
		
		turnOffAllLightsCommand.execute();
		
	}

}
