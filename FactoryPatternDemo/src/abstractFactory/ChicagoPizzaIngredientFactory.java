package abstractFactory;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough craeteDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumPTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new Mozzarella();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies[] veggies = { new BlackOlives(), new EggPlant(), new Spinach() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams craeteClam() {
		return new FrozenClams();
	}

}
