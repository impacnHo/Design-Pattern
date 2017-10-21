public class RabbitSkin extends Skin {

	Component component;

	public RabbitSkin(Component component) {
		this.component = component;
	}

	@Override
	public String getDisplay() {
		return component.getDisplay() + ",Åû×ÅÍÃÆ¤";
	}

}
