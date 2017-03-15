package behavioral.designpattern.interpreter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InterpreterEverydayDemo {
	
	static Expression buildInterpreterTree(){
		Expression terminal1 = new TerminalExpression("Lions");
		Expression terminal2 = new TerminalExpression("Tigers");
		Expression terminal3 = new TerminalExpression("Bears");
		//tigers and bears
		Expression alternation1 = new AndExpression(terminal2, terminal3);
		//Liones or (Tirgers and bears)
		Expression alternation2 = new OrExpression(terminal1, alternation1);
		
		return new AndExpression(terminal3, alternation2);
		
	}
	public static void main(String[] args){
		
		//String input="Lions, and tigers, and bears! Oh, my!";
		//feeding regex
		//String context = "Lions";
		//String context = "Lions and Tigers";
		//String context = "Lions and Bears";
		String context = "Tigers and Bears";
		//String context = "Tigers";
		//Pattern p = Pattern.compile("(lion|cat|dog|wolf|bear|human|tiger|liger)");
		//Matcher m = p.matcher(input);
		Expression define = buildInterpreterTree();
		System.out.println(context+ " is "+ define.interpret(context));
		
//		while(m.find()){
//			System.out.println("Found a "+ m.group()+".");
//		}
	}

}
