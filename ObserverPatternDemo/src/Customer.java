public class Customer implements Observer {

	// ע����Ϣ���û��������롢�����ַ
	private String username;
	private String password;
	private String email;

	// ���췽��
	public Customer(String username, String password, String email) {
		this.username = username;
		this.password = password;
		this.email = email;
		System.out.println("��ӭ���û�" + username + "!");
	}

	@Override
	public void update(String str) {
		System.out.println("���ʼ����û�" + this.username + "��" + str);

	}

}
