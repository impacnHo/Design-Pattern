/*
 * ��������-��һ������
 */
public class NextCommand implements Command {

	MusicPlayer musicPlayer;

	public NextCommand(MusicPlayer musicPlayer) {
		this.musicPlayer = musicPlayer;
	}

	public void excute() {
		musicPlayer.next();
	}

}
