package ch09;

public class Bus extends Car {
				// Car 클래스를 상속 받았다.
	
//	Bus() {
//		Car();
//	}
	Bus(){
		super("green"); // => 부모라는 의미의 키워드 : super
	}
	
	public void method() {
		super.color = "blue";
		super.forward();
	}
	@Override //오버라이드를 강제하는 목적
	void forward() {
		System.out.println("가속");
		speed+=2;
	}

	@Override
	void backward() {
		// TODO Auto-generated method stub
		super.backward();
	}
}
//super.필드, super.메서드, super(생성자);