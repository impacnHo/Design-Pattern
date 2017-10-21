public class DarkRoast extends Beverage {

	public DarkRoast() {
		description = "DarkRoast";
	}

	@Override
	public double cost() {
		if (getSize() == "tall") {
			return 1.89;
		} else if (getSize() == "grande") {
			return 1.99;
		} else {
			return 2.09;
		}
	}

}
