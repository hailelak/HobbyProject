package behavioral.designpattern.main;

import behavioral.designpattern.chainofresponsibility.CEO;
import behavioral.designpattern.chainofresponsibility.Director;
import behavioral.designpattern.chainofresponsibility.Request;
import behavioral.designpattern.chainofresponsibility.RequestType;
import behavioral.designpattern.chainofresponsibility.VP;

public class ChainOfResponsibilitiesDemo {
	
	public static void main(String[] args){
		Director director = new Director();
		VP vp = new VP();
		CEO ceo = new CEO();
		
		director.setSuccessor(vp);
		vp.setSuccessor(ceo);
		
		Request request = new Request(RequestType.CONFERENCE,500);
		director.handleRequest(request);
		
		request = new Request(RequestType.PURCHASE,1000);
		director.handleRequest(request);
		
		request = new Request(RequestType.PURCHASE,2000);
		director.handleRequest(request);		
		
	}

}
