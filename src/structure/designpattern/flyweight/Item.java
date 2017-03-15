package structure.designpattern.flyweight;

public class Item {
	
	//Instance of Item will be flyweights
	private final String name;
	
	public Item(String name){
		this.name = name;
	}
	
	public String toString(){
		return name;
	}

}
