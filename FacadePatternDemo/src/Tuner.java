// 无线收音机
public class Tuner {
	Amplifier amplifier;

	public void on() {
		System.out.println("Tuner on");
	}

	public void off() {
		System.out.println("Tuner off");
	}

	public void setAm() {
		System.out.println("Tuner setting Am");
	}

	public void setFm() {
		System.out.println("Tuner setting Fm");
	}

	public void setFrequency(double num) {
		System.out.println("Tuner setting frequency to" + num);
	}
}
