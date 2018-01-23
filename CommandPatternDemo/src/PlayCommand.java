/*
 * æﬂÃÂ√¸¡Ó-≤•∑≈“Ù¿÷
 */
public class PlayCommand implements Command {

	MusicPlayer musicPlayer;

	public PlayCommand(MusicPlayer musicPlayer) {
		this.musicPlayer = musicPlayer;
	}

	public void excute() {
		musicPlayer.play();
	}

}
