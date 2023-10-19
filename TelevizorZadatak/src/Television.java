public class Television {

	private int volume = 0;
	private boolean turnedOn = false;

	public Television() {
	}

	public Television(int volume) {
		this.volume = volume;
	}

	public Television(boolean turnedOn) {
		this.turnedOn = turnedOn;
	}

	public Television(int volume, boolean turnedOn) {
		this.volume = volume;
		this.turnedOn = turnedOn;
	}

	public void increaseVolume() {
		if (this.volume<20) {
			this.volume++;
		}
	}

	public void decreaseVolume() {
		if (this.volume > 0) {
			this.volume--;
		}
	}

	public void turnOn() {
		this.turnedOn = true;
	}

	public void turnOff() {
		this.turnedOn = false;
	}

	public boolean isTurnedOn() {
		return this.turnedOn;
	}

	public int getVolume() {
		return this.volume;
	}

	public String getTvStatus() {

		String response = "This Tv volume is: " + this.volume + " and it is ";

		if (!this.turnedOn) {
			response += "turned off";
		} else {
			response += "turned on";
		}

		return response;
	}
}
