package abstractFactory;

public abstract class PizzaStore {

	protected abstract Pizza createPizza(String item);

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
