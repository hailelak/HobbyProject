package behavioral.designpattern.command;

import java.util.ArrayList;
import java.util.List;

public class CommandDemo {
	
	public static void main(String[] args){
		Light light = new Light();
		Light bedroomLight = new Light();
		Light kitchenLight = new Light();
		Switch lightSwitch = new Switch();
		Command onCommand = new ToggleCommand(light);
		lightSwitch.storeAndExecute(onCommand);
		lightSwitch.storeAndExecute(onCommand);
		lightSwitch.storeAndExecute(onCommand);
		
		List<Light> lights = new ArrayList<Light>();
		lights.add(bedroomLight);
		lights.add(kitchenLight);
		
		Command allLightsCommand = new AllLightsCommand(lights);
		
		lightSwitch.storeAndExecute(allLightsCommand);
	}

}
