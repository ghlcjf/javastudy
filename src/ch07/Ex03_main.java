package ch07;

public class Ex03_main {

	public static void main(String[] args) {
		// 하나의 클래스로부터 만들어진 인스턴스들은 상호 독립적이다.
		// 그런데 인스턴스들 간에 공유해야 할 정보도 있다.
		
		// 인스턴스 간 공유해야 하는 정보를 정적(static) 멤버라고 부른다.
		
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		
		
		System.out.println("car1의 회사명 : "+car1.corperation);
		System.out.println("car2의 회사명 : "+car2.corperation);
		System.out.println("car3의 회사명 : "+car3.corperation);
		
		
		// car1.corperation = "아우디"; 특정 인스턴스가 정적 멤버를 변경하는 것은 허용되지 않음
		// 정적 멤버를 변경하거나 사용할 때는 클래스 이름에서 직접 사용해야 함.
		Car.corperation = "BMW";
		System.out.println("car1의 회사명 : "+car1.corperation);
		System.out.println("car2의 회사명 : "+car2.corperation);
		System.out.println("car3의 회사명 : "+car3.corperation);
		
		// 정적 멤버는 인스턴스를 거치치 않고도 사용이 가능하다.
		
		Math.random();
	}

}
