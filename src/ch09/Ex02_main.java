package ch09;

public class Ex02_main {

	public static void main(String[] args) {
		// 일반적인 인스턴스 사용하는 형태
		Excavator car1 = new Excavator();
		car1.forward();
		car1.dig();
		System.out.println("--------------------------------");
		
//		Excavator car2 = new Car();
		// car2는 타입에 의해 dig(),forward(),backward()가 있다고 간주할 수 있다.
		
		Car car3 = new Excavator(); // 다형성, 상속 관계일 때만
		// car3는 타입에 의해서 forward(),backward()가 있다고 간주할 수 있다.
//		car3.dig();
		// car3 내부의 기능(method)을 사용할 때
		// 쓸 수 없다...car3가 가진 인스턴스가 무엇인지는 중요하지 않다.
		// car3 타입이 알고 있는지가 중요한 것이다... == 타입이 중요한 것.
		
		
		// 형변환 casting => 기본타입 
		Excavator car4 = (Excavator)car3;
		// 참조타입에서 형변환 가능 여부는 어떤 타입인지가 중요한 것이 아니고
		// 실제 데이터가 무엇인지가 중요하다.
		
		if(car3 instanceof Excavator) {
			// car3에 담긴 인스턴스 데이터가 실제 Excavator 인스턴스인지 확인.
			Excavator car5 = (Excavator)car3;
		}else {
			// car3에 담긴 인스턴스 데이터가 실제 Excavator가 아니면..
		}
		
	}

}
