package ch09;

public class Car {
	String color = "white";
	int speed = 0;
	public Car() {}
	public Car(String color) {
		this.color = color;
	}
	
	void forward() {
		System.out.println("전진");
		speed++;
	}
	
	void backward() {
		System.out.println("후진");
		speed--;
	}
	
}
