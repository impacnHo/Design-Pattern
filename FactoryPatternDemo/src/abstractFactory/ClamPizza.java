package abstractFactory;

public class ClamPizza extends Pizza{
	PizzaIngredientFactory ingredientFactory;
	
	public ClamPizza(PizzaIngredientFactory ingredientFactory){
		this.ingredientFactory = ingredientFactory;
	}
	
	@Override
	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.craeteDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		clam = ingredientFactory.craeteClam();
	}

}
