package factoryMethod;

public abstract class PizzaStore {

	// 把制作pizza的方法从工厂移回pizza
	// store，并设置为抽象类让子类决定pizza的制作方法
	// 实例pizza的的责任被移动到一个“方法”中，这个方法相当于一个工厂
	public abstract Pizza createPizza(String type);

	protected Pizza orderPizza(String type) {// 下单方法不变
		Pizza pizza = null;
		pizza = createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
