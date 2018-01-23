public class Customer implements Observer {

	// ע����Ϣ���û��������롢�����ַ
	private String username;
	private FlowerShop subject;

	// ���췽��
	public Customer(String username,FlowerShop subject) {
		this.username = username;
		this.subject = subject;
		subject.attach(this); // ���Լ�ע��
	}

	@Override
	public void update(String str) {
		System.out.println("���ʼ����û�" + this.username + "��" + str);

	}

}
