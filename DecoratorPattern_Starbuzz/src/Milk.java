public class Milk extends CondimentDecorator {

	Beverage beverage;

	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + "," + "Milk";
	}

	@Override
	public double cost() {
		double cost = this.cost();
		if (beverage.getSize() == "tall") {
			cost += 0.19;
		} else if (beverage.getSize() == "grande") {
			cost += 0.29;
		} else {
			cost += 0.39;
		}
		return cost;
	}

}
