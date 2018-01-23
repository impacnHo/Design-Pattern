import java.util.ArrayList;
import java.util.List;


public class ConcreteAggregate implements Aggregate{
	
	private List list;
	ConcreteIterator concreteIterator;
	
	public ConcreteAggregate(){
		list = new ArrayList();
		concreteIterator = new ConcreteIterator(list);
	}

	@Override
	public void add(Object object) {
		list.add(object);
		
	}

	@Override
	public void remove(Object object) {
		list.remove(object);
		
	}

	@Override
	public Iterator createIterator() {
		return concreteIterator;
	}

}
