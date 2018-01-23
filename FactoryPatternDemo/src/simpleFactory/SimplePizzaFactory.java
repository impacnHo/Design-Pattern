package simpleFactory;

public class SimplePizzaFactory {
	Pizza pizza;

	public  Pizza craetePizza(String type) {
		pizza = null;

		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		}else{
			System.out.println("error input");
		}

		return pizza;
	}

}
