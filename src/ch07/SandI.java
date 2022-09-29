package ch07;

public class SandI {

	// 정적 멤버
	static int field1;
	static void method1() {
		System.out.println("정적 메서드(클래스 메서드)");
	}
	
	//인스턴스 멤버
	int field2;
	void method2() {
		System.out.println("인스턴스 메서드");
	}
	
	// 각 멤버들이 활용 가능한 시점
	// 정적 멤버는 프로그램이 동작되자마자 실행 가능
	// 인스턴스 멤버는 프로그램 동작과 상관없이 인스턴스가 생성되고 나면 실행 가능 
	
	void method3() {
		field1 = 10;
		method1();
		
		field2 = 20;
		method2();
		
	}
	
	static void method4() {
		field1 = 10;
		method1();
		
//		field2 = 20;
//		method2(); 2는 인스턴스 멤버,메서드라서 사용 안됨
	}
	
	// final : '최종적인'
	final int NUM = 10;
	// 최종적으로 결정된 변수 => 바꿀 수 없는 변수 => 상수 : 이름은 반드시 대문자
	// 인스턴스 멤버는 인스턴스마다 다른 값을 가질 수 있다.
	
	final static int NUM2 = 20; // 프로그램 내에서의 불변의 값 -> 상수..
	
	
	
	
	
	
	
}
