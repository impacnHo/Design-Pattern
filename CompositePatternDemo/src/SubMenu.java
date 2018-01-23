/*
 * 容器类
 */
import java.util.ArrayList;

public class SubMenu extends Menu {

	private ArrayList<Menu> menuSet;

	// 构造方法
	public SubMenu(String name) {
		super(name);
		menuSet = new ArrayList<Menu>();
	}

	// 添加菜单项
	public void addMenuItem(Menu menu) {
		menuSet.add(menu);
	}

	// 移除菜单项
	public void removeMenuItem(Menu menu) {
		menuSet.remove(menu);
	}

	// 打印所有菜单项信息
	public void print() {
		System.out.println("·" + getName());
		for (Menu m : menuSet) {
			m.print();
		}

	}

}
