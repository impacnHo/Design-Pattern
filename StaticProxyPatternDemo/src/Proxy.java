public class Proxy implements Subject {

	RealSubject subject;

	public Proxy() {
		subject = new RealSubject();
	}

	@Override
	public void request() {
		subject.request();
	}

}
