public class Test {
	public static void main(String[] args) {
		Menu menu1 = new SubMenu("��ҳ");
		Menu menu2 = new SubMenu("ѧУ�ſ�");
		Menu menu3 = new SubMenu("רҵ����");
		Menu menu4 = new SubMenu("������");

		Menu item1 = new MenuItem("ѧУ���", "zhbit.com/introduction");
		Menu item2 = new MenuItem("��ʷ�ظ�", "zhbit.com/history");
		Menu item3 = new MenuItem("��ѧ����", "zhbit.com/concept");
		Menu item4 = new MenuItem("��������", "zhbit.com/departments");
		Menu item5 = new MenuItem("�����쵼", "zhbit.com/leaders");
		Menu item6 = new MenuItem("�����쵼", "zhbit.com/oldLeaders");

		menu2.addMenuItem(item1);
		menu2.addMenuItem(item2);
		menu2.addMenuItem(item3);
		menu2.addMenuItem(item4);
		menu2.addMenuItem(item5);
		menu2.addMenuItem(item6);

		menu1.print();
		menu2.print();
		menu3.print();
		menu4.print();
	}
}
