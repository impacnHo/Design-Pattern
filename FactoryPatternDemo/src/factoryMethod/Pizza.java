package factoryMethod;

import java.util.ArrayList;

public abstract class Pizza {
	String name;// 名称
	String dough;// 面团类型
	String sauce;// 酱料类型
	ArrayList toppings = new ArrayList();// 一套佐料

	void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings:");
		for (int i = 0; i < toppings.size(); i++) {
			System.out.println(" " + toppings.get(i));
		}
	}

	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	void box() {
		System.out.println("Place pizza in official pizzaStore box");
	}

	public String getName() {
		return name;
	}
}
