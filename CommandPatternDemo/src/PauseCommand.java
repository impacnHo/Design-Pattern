/*
 * ¾ßÌåÃüÁî-ÔİÍ£ÒôÀÖ
 */
public class PauseCommand implements Command {

	MusicPlayer musicPlayer;

	public PauseCommand(MusicPlayer musicPlayer) {
		this.musicPlayer = musicPlayer;
	}

	public void excute() {
		musicPlayer.pause();
	}

}
