/*
 * Component
 */
public abstract class Menu {

	private String name;

	public Menu(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public abstract void print();

	public abstract void addMenuItem(Menu item);
	
	public abstract void removeMenuItem(Menu item);
}
