/*
 * ��������-��һ������
 */
public class PreviousCommand implements Command {

	MusicPlayer musicPlayer;

	public PreviousCommand(MusicPlayer musicPlayer) {
		this.musicPlayer = musicPlayer;
	}

	public void excute() {
		musicPlayer.previous();
	}

}
