package abstractFactory;

public class Client {
	public static void main(String[] args) {
		PizzaStore nyPizzaStore = new NYPizzaStore();
		Pizza pizza = nyPizzaStore.orderPizza("cheese");
	}
}
