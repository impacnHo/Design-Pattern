public class GrassLand {
	public static void main(String[] args) {
		
		Component component = new Wolf();
		component = new GoatSkin(component);
		component = new HumanSkin(component);
		component = new RabbitSkin(component);
		System.out.println(component.getDisplay());
		
		Component component2 = new Wolf();
		component2 = new HumanSkin(component2);
		component2 = new RabbitSkin(component2);
		System.out.println(component2.getDisplay());
		
		Component component3 = new Wolf();
		component3 = new RabbitSkin(component3);
		System.out.println(component3.getDisplay());
		
		Component component4 = new Wolf();
		System.out.println(component4.getDisplay());
	}
}
