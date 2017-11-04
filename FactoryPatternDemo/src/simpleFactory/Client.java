package simpleFactory;

public class Client {
	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore pizzaStore = new PizzaStore(factory);
		Pizza pizza = pizzaStore.orderPizza("cheese");
		pizza.getDescription();
	}
}
