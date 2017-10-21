public abstract class Beverage {

	String size = "unknown";// Customers can choose what size they want.

	String description = "unknown";

	public String getSize() {
		return size;
	}

	public void setSize(int num0fSize) {
		// Set the size by numOfSize£º1-tall,2-grande,3-venti.
		switch (num0fSize) {
		case 1:
			this.size = "tall";
			break;
		case 2:
			this.size = "grande";
			break;
		case 3:
			this.size = "venti";
			break;
		default:
			break;
		}
		description = description + ",<" + getSize() + ">";
	}

	public String getDescription() {
		return description;
	}

	public abstract double cost();

}
