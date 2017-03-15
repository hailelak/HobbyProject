package behavioral.designpattern.iterator;

import java.util.Iterator;

public class IteratorDemo {
	
	public static void main(String[] args){
		
		BikeRepository repo = new BikeRepository();
		
		repo.addBike("Cervelo");
		repo.addBike("Scott");
		repo.addBike("Fuji");
		
		Iterator<String> bickIterator = repo.iterator();
		
//		while(bickIterator.hasNext()){
//			System.out.println(bickIterator.next());
//		}
		
		for (String bike : repo) {
			System.out.println(bike);
		}
		
	}

}
