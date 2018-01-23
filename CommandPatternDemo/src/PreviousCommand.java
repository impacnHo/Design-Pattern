/*
 * 具体命令-上一首音乐
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
