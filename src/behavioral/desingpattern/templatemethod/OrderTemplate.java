package behavioral.desingpattern.templatemethod;

public abstract class OrderTemplate {
	
	public boolean isGift;
	public abstract void doCheckout();
	public abstract void doPayment();
	public abstract void doReceipt();
	public abstract void doDelibery();
	
	public final void wrapGift(){
		System.out.println("Gift wrapped!");
	}
	
	public final void processOrder(){
		doCheckout();
		doPayment();
		if(isGift){
			wrapGift();
		}
		else{
			doReceipt();
		}
		doDelibery();
	}
	
}
