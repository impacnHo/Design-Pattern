public class Test {
	public static void main(String[] args) {
		Menu menu1 = new SubMenu("首页");
		Menu menu2 = new SubMenu("学校概况");
		Menu menu3 = new SubMenu("专业设置");
		Menu menu4 = new SubMenu("党务工作");

		Menu item1 = new MenuItem("学校简介", "zhbit.com/introduction");
		Menu item2 = new MenuItem("历史沿革", "zhbit.com/history");
		Menu item3 = new MenuItem("办学理念", "zhbit.com/concept");
		Menu item4 = new MenuItem("机构设置", "zhbit.com/departments");
		Menu item5 = new MenuItem("现任领导", "zhbit.com/leaders");
		Menu item6 = new MenuItem("历任领导", "zhbit.com/oldLeaders");

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
