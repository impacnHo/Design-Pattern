public interface Subject {
	
	// 添加新用户接收邮件
	public void attach(Observer observer);

	// 删除接收推送邮件的用户
	public void detach(Observer observer);

	// 广播发送邮件
	public void notifyObserver(String str);
}
