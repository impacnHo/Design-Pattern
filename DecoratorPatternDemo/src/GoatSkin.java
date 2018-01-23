public class GoatSkin extends Skin {

	public GoatSkin(Component component) {
		this.component = component;
	}
 
	@Override
	public String getDisplay() {
		return component.getDisplay() + ",Åû×ÅÑòÆ¤";
	}

}
