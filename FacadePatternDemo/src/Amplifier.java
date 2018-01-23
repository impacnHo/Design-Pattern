// À©ÒôÆ÷
public class Amplifier {
	Tuner tuner;
	DvdPlayer dvdPlayer;
	CdPlayer cdPlayer;

	public void on() {
		System.out.println("Amplifier on");
	}

	public void off() {
		System.out.println("Amplifier off");
	}

	public void setCd(CdPlayer cdPlayer) {
		this.cdPlayer = cdPlayer;
	}

	public void setDvd(DvdPlayer dvdPlayer) {
		this.dvdPlayer = dvdPlayer;
	}

	public void setStereoSound() {
		System.out.println("Amplifier stereo sound on");
	}

	public void setSurroundSound() {
		System.out.println("Amplifiet surround sound on");
	}

	public void setTuner(Tuner tuner) {
		this.tuner = tuner;
	}

	public void setVolume(int num) {
		System.out.println("Amplifier settting volume to" + num);
	}
}
