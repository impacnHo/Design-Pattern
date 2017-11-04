package factoryMethod;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {

		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new ChicagoStyleCheesePizza();
		} else if (type.equals("clam")) {
			pizza = new ChicagoStyleClamPizza();
		} else {
			return null;
		}

		return pizza;
	}

}
