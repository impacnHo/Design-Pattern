package factoryMethod;

public abstract class PizzaStore {

	// ������pizza�ķ����ӹ����ƻ�pizza
	// store��������Ϊ���������������pizza����������
	// ʵ��pizza�ĵ����α��ƶ���һ�����������У���������൱��һ������
	public abstract Pizza createPizza(String type);

	protected Pizza orderPizza(String type) {// �µ���������
		Pizza pizza = null;
		pizza = createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
