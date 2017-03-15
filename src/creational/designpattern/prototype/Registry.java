package creational.designpattern.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
	
	private Map<String, Item> items = new HashMap<String, Item>();
	
	public Registry(){
		loadItems();
	}
	
	public Item createItem(String type){
		Item item = null;
		try{
			
			item = (Item)(items.get(type)).clone();
			
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
			
		}
		return item;
	}
	
	private void loadItems(){
		
		Movie movie = new Movie();
		movie.setTitle("The Flower in Hell");
		movie.setPrice(89.99);
		movie.setRuntime("2:30");
		items.put("Movie", movie);
		
		Book book = new Book();
		book.setTitle("The Power");
		book.setPrice(99.99);
		book.setNumberOfPages(345);
		items.put("Book", book);
				
	}

}
