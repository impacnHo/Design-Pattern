package abstractFactory;

public abstract class PizzaStore {

	protected abstract Pizza createPizza(String item);

	protected Pizza orderPizza(String type) {// �µ���������
		Pizza pizza = null;
		pizza = createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
