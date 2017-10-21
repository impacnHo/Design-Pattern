public class HouseBlend extends Beverage {

	public HouseBlend() {
		description = "HouseBlend";
	}

	@Override
	public double cost() {
		if (getSize() == "tall") {
			return 1.69;
		} else if (getSize() == "grande") {
			return 1.79;
		} else {
			return 1.89;
		}
	}

}
