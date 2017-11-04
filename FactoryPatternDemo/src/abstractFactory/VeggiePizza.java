package abstractFactory;

public class VeggiePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;

	public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.craeteDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		veggies = ingredientFactory.createVeggies();
	}

}
