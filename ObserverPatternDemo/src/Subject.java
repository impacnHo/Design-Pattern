public interface Subject {
	
	// ������û������ʼ�
	public void attach(Observer observer);

	// ɾ�����������ʼ����û�
	public void detach(Observer observer);

	// �㲥�����ʼ�
	public void notifyObserver(String str);
}
