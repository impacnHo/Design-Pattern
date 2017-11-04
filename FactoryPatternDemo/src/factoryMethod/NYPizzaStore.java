package factoryMethod;

public class NYPizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
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
