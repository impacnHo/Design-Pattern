public class Mocha extends CondimentDecorator {

	Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + "," + "Mocha";
	}

	@Override
	public double cost() {
		double cost = beverage.cost();
		if (beverage.getSize() == "tall") {
			cost += 0.20;
		} else if (beverage.getSize() == "grande") {
			cost += 0.30;
		} else {
			cost += 0.40;
		}
		return cost;
	}

}
