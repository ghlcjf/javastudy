package ch08.question;

public class MyTv {

	private boolean PowerOn;
	private int channel;
	private int volume;
	
	
	
	
	public boolean isPowerOn() { // boolean 타입일 때는 getPowerOn이 아니라 isPowerOn
		return this.PowerOn;
	}
	public void setPowerOn(boolean powerOn) {
		this.PowerOn = powerOn;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getChannel() {
		return this.channel;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getVolume() {
		return this.volume;
	}
	
}
