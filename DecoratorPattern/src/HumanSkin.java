public class HumanSkin extends Skin {

	Component component;

	public HumanSkin(Component component) {
		this.component = component;
	}

	@Override
	public String getDisplay() {
		return component.getDisplay() + ",Åû×ÅÈËÆ¤";
	}

}
