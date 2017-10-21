public class GoatSkin extends Skin {

	Component component;

	public GoatSkin(Component component) {
		this.component = component;
	}

	@Override
	public String getDisplay() {
		return component.getDisplay() + ",Åû×ÅÑòÆ¤";
	}

}
