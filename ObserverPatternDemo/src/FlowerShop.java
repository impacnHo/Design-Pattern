import java.util.ArrayList;

public class FlowerShop implements Subject {

	private ArrayList<Observer> customers = new ArrayList<Observer>();// �����ʼ�������
	private String message;// �ʼ���Ϣ����

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
		// ÿ�θ�����Ϣʱ�㲥�����ʼ�
		notifyObserver(message);
	}

	@Override
	public void attach(Observer observer) {
		customers.add(observer);

	}

	@Override
	public void detach(Observer observer) {
		customers.remove(observer);
		observer.update("�������ٽ�����Ʒ����֪ͨ�ʼ���");

	}

	@Override
	public void notifyObserver(String str) {
		for (Observer c : customers) {
			c.update(str);
		}

	}

}
