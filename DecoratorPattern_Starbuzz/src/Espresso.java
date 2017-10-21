public class Espresso extends Beverage {

	public Espresso() {
		description = "Espresso";
	}

	@Override
	public double cost() {
		if (getSize() == "tall") {
			return 1.59;
		} else if (getSize() == "grande") {
			return 1.69;
		} else {
			return 1.79;
		}
	}

}
