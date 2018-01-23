// ≤‚ ‘¿‡
public class Test {
	public static void main(String[] args) {
		WildTurkey turkey = new WildTurkey();
		MallardDuck duck = new MallardDuck();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);

		System.out.println("The Turkey says...");
		turkey.gobble();
		turkey.fly();

		System.out.println("\nThe Duck says...");
		duck.quack();
		duck.fly();

		System.out.println("\nThe TurketAdapter says...");
		turkeyAdapter.quack();
		turkeyAdapter.fly();
	}
}
