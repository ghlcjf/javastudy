package ch15;

public class Television {
	
	private RemoteController rc;
	
	public Television(RemoteController rc) {
		this.rc = rc;
	}
	
	void tvOn() {
		this.rc.turnOn();
	}
	
	void tvOff() {
		this.rc.turnOff();
	}
	void m(RemoteController2 rc2) {
		rc2.muted();
	}
}
