import java.util.ArrayList;
import java.util.List;

public class ConcreteIterator implements Iterator {

	private int index;
	private List list;

	public ConcreteIterator(List list) {
		index = 0;
		this.list = list;
	}

	@Override
	public boolean hasNext() {
		if (index < list.size()) {
			return true;
		}
		return false;
	}

	@Override
	public Object next() {
		return list.get(index++);

	}

}
