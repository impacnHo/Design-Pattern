package simpleFactory;

public class SimplePizzaFactory {

	public  Pizza craetePizza(String type) {
		Pizza pizza = null ;

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
