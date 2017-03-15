package behavioral.desingpattern.templatemethod;

public class WebOrder extends OrderTemplate {

	@Override
	public void doCheckout() {
		System.out.println("Get item from cart,");
		System.out.println("Set gift preference,");
		System.out.println("Set delibery address,");
		System.out.println("Set billing adress");
	}

	@Override
	public void doPayment() {		
		System.out.println("Process payment without card present");
	}

	@Override
	public void doReceipt() {		
		System.out.println("Ship the item to address");
	}

	@Override
	public void doDelibery() {		
		System.out.println("Email Receipt");
	}

}
