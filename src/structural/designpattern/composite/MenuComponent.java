package structural.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {
	
	String name;
	String url;
	List<MenuComponent> menuComponents = new ArrayList<>();
	
	public abstract String toString();
	
	public MenuComponent add(MenuComponent menuComponent){
		throw new UnsupportedOperationException("Feature is not implemented at this level");
		
	}
	public MenuComponent remove(MenuComponent menuComponent){
		throw new UnsupportedOperationException("Feature is not implemented at this level");
	}
	
	
	
	public String print(MenuComponent menuComponent){
		StringBuilder builder = new StringBuilder(name);
		builder.append(": ");
		builder.append(url);
		builder.append("\n");
		
		return builder.toString();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	

}
