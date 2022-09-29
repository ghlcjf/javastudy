package ch10;

public abstract class Animal {

	private String kind;
	
	public Animal(String kind) {
		this.kind = kind;
	}
	
	

	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();
}
