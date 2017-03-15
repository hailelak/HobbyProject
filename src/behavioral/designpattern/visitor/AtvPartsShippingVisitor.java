package behavioral.designpattern.visitor;

import java.util.List;

public class AtvPartsShippingVisitor implements AtvPartVisitor{
	
	double shippingAmount = 0;
	
	@Override
	public void visit(Wheel wheel) {
		System.out.println("Wheel are bulky and exprensive to ship");
		shippingAmount+=15;
		
	}

	@Override
	public void visit(Fender fender) {
		System.out.println("Fender arde light and cheap to ship");		
		shippingAmount+=3;
	}

	@Override
	public void visit(Oil oil) {
		System.out.println("Oil is hazardous and has a fee to ship");
		shippingAmount+=9;
	}

	@Override
	public void visit(PartsOrder order) {
		System.out.println("If you bought more than 3 things we will give them a discount on shipping");
		List<AtvPart> parts = order.getParts();
		if(parts.size()>3){
			shippingAmount-=5;
		}
		System.out.println("Shipping amount is: "+shippingAmount);
	}

	

}
