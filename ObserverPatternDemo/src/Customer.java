public class Customer implements Observer {

	// 注册信息：用户名、密码、邮箱地址
	private String username;
	private FlowerShop subject;

	// 构造方法
	public Customer(String username,FlowerShop subject) {
		this.username = username;
		this.subject = subject;
		subject.attach(this); // 将自己注册
	}

	@Override
	public void update(String str) {
		System.out.println("新邮件：用户" + this.username + "，" + str);

	}

}
