public class Customer implements Observer {

	// 注册信息：用户名、密码、邮箱地址
	private String username;
	private String password;
	private String email;

	// 构造方法
	public Customer(String username, String password, String email) {
		this.username = username;
		this.password = password;
		this.email = email;
		System.out.println("欢迎新用户" + username + "!");
	}

	@Override
	public void update(String str) {
		System.out.println("新邮件：用户" + this.username + "，" + str);

	}

}
