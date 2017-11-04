package abstractFactory;

public interface PizzaIngredientFactory {
	public Dough craeteDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams craeteClam();
}
