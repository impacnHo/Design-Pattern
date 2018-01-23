package factoryMethod;

public class NYPizzaStore extends PizzaStore{
	Pizza pizza;

	@Override
	public Pizza createPizza(String type) {
		pizza = null;
		if(type.equals("cheese")){
			pizza = new NYStyleCheesePizza();
		}else if (type.equals("clam")){
			pizza = new NYStyleClamPizza();
		}else{
			return null;
		}
		
		return pizza;
	}


}
