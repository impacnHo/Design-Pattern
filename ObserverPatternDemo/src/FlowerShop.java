import java.util.ArrayList;

public class FlowerShop implements Subject {

	private ArrayList<Observer> customers = new ArrayList<Observer>();// 接收邮件的数组
	private String message;// 邮件信息内容

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
		// 每次更新信息时广播发送邮件
		notifyObserver(message);
	}

	@Override
	public void attach(Observer observer) {
		customers.add(observer);

	}

	@Override
	public void detach(Observer observer) {
		customers.remove(observer);
		observer.update("您将不再接收商品上新通知邮件。");

	}

	@Override
	public void notifyObserver(String str) {
		for (Observer c : customers) {
			c.update(str);
		}

	}

}
