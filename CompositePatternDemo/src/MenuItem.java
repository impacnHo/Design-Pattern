/*
 * 菜单项类
 */
public class MenuItem extends Menu {

	private String url;

	// 构造方法
	public MenuItem(String name, String url) {
		super(name);
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void print() {
		System.out.println(" ·>" + getName() + " " + getUrl());
	}

	public void addMenuItem(Menu item) {
		// TODO Auto-generated method stub
		
	}

	public void removeMenuItem(Menu item) {
		// TODO Auto-generated method stub
		
	}

}
