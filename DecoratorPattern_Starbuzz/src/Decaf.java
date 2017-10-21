public class Decaf extends Beverage {

	public Decaf() {
		description = "Decaf";

	}

	@Override
	public double cost() {
		if (getSize() == "tall") {
			return 2.29;
		} else if (getSize() == "grande") {
			return 2.39;
		} else {
			return 2.49;
		}
	}

}
