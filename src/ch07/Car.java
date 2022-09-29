package ch07;

public class Car { // 자동차라는 객체
	static String corperation = "현대";
	
	
	
	// 인스턴스 멤버 변수, 필드, 속성
	String color = "white";
	int speed = 0;
	
	// 특별한 기능을 하는 메서드 => '생성자' -> 마치 주문서 
	// 1) 이름은 무조건 클래스 명과 같아야 함
	// 2) 반환타입이 존재하지 않음
	// 3) 일반적으로 호출되서 사용되지 않음
	
	Car(){} // 생성자를 만들지 않으면 기본 생성자를 자동으로 호출한다.
	
	Car(String color){ // 색상을 주문받아서 해당 색상으로 만들어진 car를 생산
		this.color = color;
	}
	
	// 인스턴스 멤버 메서드
	public void forward() { // 전진
		speed++;
		System.out.println("전진");
	}
	public void backward() { // 후진
		speed--;
		System.out.println("후진");
	}
	
}
