package behavioral.designpattern.command;

//invonker
public class Switch {
public void storeAndExecute(Command command){	
	command.execute();	
}
}
