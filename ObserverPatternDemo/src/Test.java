public class Test {
	public static void main(String[] args) {

		FlowerShop flowerShop = new FlowerShop();
		Customer c1 = new Customer("amy", flowerShop);
		Customer c2 = new Customer("eric", flowerShop);

		flowerShop.setMessage("welcome");
		flowerShop.setMessage("welcome again");

		System.out.println("===ɾ��amy===");

		flowerShop.detach(c1);
		flowerShop.setMessage("hello");
	}

}
