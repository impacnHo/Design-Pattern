/*
 *�����߰�������������������   
 */
public class Test {
	public static void main(String[] args) {

		MusicPlayer musicPlayer = new MusicPlayer();
		Command command = new PlayCommand(musicPlayer);
		Button button = new Button();
		button.setCommand(command);

		button.doCommand();

		command = new PauseCommand(musicPlayer);
		button.setCommand(command);
		button.doCommand();
	}
}
