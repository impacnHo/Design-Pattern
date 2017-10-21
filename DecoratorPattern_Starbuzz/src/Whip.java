public class Whip extends CondimentDecorator {

	Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;

	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + "," + "Whip";
	}

	@Override
	public double cost() {
		double cost = beverage.cost();
		if (beverage.getSize() == "tall") {
			cost += 0.39;
		} else if (beverage.getSize() == "grande") {
			cost += 0.39;
		} else {
			cost += 0.39;
		}
		return cost;
	}

}
