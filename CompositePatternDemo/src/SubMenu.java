/*
 * ������
 */
import java.util.ArrayList;

public class SubMenu extends Menu {

	private ArrayList<Menu> menuSet;

	// ���췽��
	public SubMenu(String name) {
		super(name);
		menuSet = new ArrayList<Menu>();
	}

	// ��Ӳ˵���
	public void addMenuItem(Menu menu) {
		menuSet.add(menu);
	}

	// �Ƴ��˵���
	public void removeMenuItem(Menu menu) {
		menuSet.remove(menu);
	}

	// ��ӡ���в˵�����Ϣ
	public void print() {
		System.out.println("��" + getName());
		for (Menu m : menuSet) {
			m.print();
		}

	}

}
