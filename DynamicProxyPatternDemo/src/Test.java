public class Test {
	public static void main(String[] args) {
		ProxyHandler proxy = new ProxyHandler();
		Subject subject = (Subject) proxy.bind(new RealSubject());
		subject.request();
	}
}
