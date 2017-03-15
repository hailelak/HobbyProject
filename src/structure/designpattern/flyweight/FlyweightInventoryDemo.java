package structure.designpattern.flyweight;

public class FlyweightInventoryDemo {
	
	public static void main(String[] args){
		InventorySystem isy = new InventorySystem();
		isy.takeOrder("Roomba", 221);
		isy.takeOrder("Bosa Headphones", 361);
		isy.takeOrder("Sumsung TV", 432);
		isy.takeOrder("Sumsung TV", 323);
		isy.takeOrder("Roomba", 563);
		isy.takeOrder("Bosa Headphones", 321);
		isy.takeOrder("Roomba", 234);
		isy.takeOrder("Sumsung TV", 54);		
		isy.takeOrder("Roomba", 34);
		isy.takeOrder("Bosa Headphones", 365);
		isy.takeOrder("Sumsung TV", 332);
		isy.takeOrder("Roomba", 456);
		
		isy.process();
		
		System.out.println(isy.report());
	}

}
