package simpleFactory;

public class PizzaStore {
	SimplePizzaFactory factory;
	
	public PizzaStore(SimplePizzaFactory factory){
		this.factory = factory;
	}
	
	public Pizza orderPizza(String type) {
		Pizza pizza = null;
		//pizza = SimplePizzaFactory.craetePizza(type);// static method
		pizza = factory.craetePizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
