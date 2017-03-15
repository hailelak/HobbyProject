package behavioral.designpattern.command;

//concrete command
//the problem with this is we don't preserve state...so we switched to ToggleCommand which hold the current state
public class OnCommand implements Command {
	
	private Light light;	
	
	public OnCommand(Light light){
		this.light = light;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.on();
		light.off();
	}

}
