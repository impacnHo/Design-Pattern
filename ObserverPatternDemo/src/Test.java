public class Test {
	public static void main(String[] args) {
		Customer c1 = new Customer("Amy", "123456", "amy@qq.com");
		Customer c2 = new Customer("James", "abcdef", "james@163.com");
		Customer c3 = new Customer("Mei", "helloworld", "mei@gmail.com");
		
		FlowerShop flowerShop = new FlowerShop();
		flowerShop.attach(c1);
		flowerShop.attach(c2);
		flowerShop.attach(c3);
		
		flowerShop.setMessage("����õ�廨��������");
		
		flowerShop.detach(c1);
		
		flowerShop.setMessage("�����������������");
	}
	
}
