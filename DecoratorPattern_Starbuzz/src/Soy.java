public class Soy extends CondimentDecorator {

	Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + "," + "Soy";
	}

	@Override
	public double cost() {
		double cost = beverage.cost();
		if (beverage.getSize() == "tall") {
			cost += 0.29;
		} else if (beverage.getSize() == "grande") {
			cost += 0.39;
		} else {
			cost += 0.49;
		}
		return cost;
	}

}
