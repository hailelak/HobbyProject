package structural.designpattern.composite;

public class MenuItem extends MenuComponent{
	
	public MenuItem(String name, String url){
		this.name = name;
		this.url = url;
	}

	@Override
	public String toString() {
		return print(this);
	}

	    @Override
		public MenuComponent add(MenuComponent menuComponent){
			menuComponent.add(menuComponent);
			return menuComponent;
		}
		@Override
		public MenuComponent remove(MenuComponent menuComponent){
			menuComponent.remove(menuComponent);
			return menuComponent;
		}


}
