public class HumanSkin extends Skin {

	public HumanSkin(Component component) {
		this.component = component;
	}

	@Override
	public String getDisplay() {
		return component.getDisplay() + ",Åû×ÅÈËÆ¤";
	}

}
