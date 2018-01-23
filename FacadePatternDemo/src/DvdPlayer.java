// dvd
public class DvdPlayer {
	Amplifier amplifier;

	public void on() {
		System.out.println("Dvd player on");
	}

	public void off() {
		System.out.println("Dvd player off");
	}

	public void eject() {
		System.out.println("Dvd player eject");
	}

	public void pause() {
		System.out.println("Dvd player pause");
	}

	public void play(String movie) {
		System.out.println("Dvd player play" + movie);
	}

	public void setSurroundAudio() {
		System.out.println("Dvd player setting surround audio");
	}

	public void setTwoChannelAudio() {
		System.out.println("Dvd player setting two channel audio");
	}

	public void stop() {
		System.out.println("Dvd player stop");
	}
}
