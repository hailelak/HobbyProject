package behavioral.designpattern.command;

//concrete command
public class ToggleCommand implements Command {
	
	private Light light;	
	
	public ToggleCommand(Light light){
		this.light = light;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.toggle();		
	}

}
