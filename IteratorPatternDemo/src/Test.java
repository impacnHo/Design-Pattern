
public class Test {
	public static void main(String[] args) {
		Aggregate concreteAggregate = new ConcreteAggregate();
		concreteAggregate.add("jack");
		concreteAggregate.add("mike");
		concreteAggregate.add("rose");
		
		// concreteAggregate.remove("jack");
		
		Iterator iterator = concreteAggregate.createIterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
