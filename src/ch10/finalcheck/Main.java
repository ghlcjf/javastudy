package ch10.finalcheck;

public class Main {

	public static void main(String[] args) {
		// 상속과 구현
		
		A a11 = new A1(); // 참조 타입은 인터페이스로 선언 가능
						 // 인스턴스는 인터페이스로 구현한 클래스만 가능
		a11.a1(); // 인터페이스 타입이 a1()메서드를 알고 있기 때문에 사용 가능
		System.out.println("");
		
		
		C1 c11 = new C1(); // C1 = 다중 구현 클래스
		c11.a1(); // 다중 구현 클래스는 구현된 모든 인터페이스 안의 메서드 존재를 알고 있다.
		c11.b1(); // => 실행 가능
		System.out.println("");
		
		
		A ca = new C1(); // 참조 타입은 인터페이스, 인스턴스는 다중 구현 클래스
		ca.a1();
		// ca.b1(); 타입인 인터페이스가 알고 있는 메서드만 실행 가능.
		// 실제 인스턴스 데이터에 메서드가 있냐 없냐는 중요하지 않음.
		System.out.println("");
		
		
		B cb = new C1();
		// cb.a1();
		cb.b1(); // 위와 같은 원리
		System.out.println("");
		
		
		A da = new D1(); // A : 상속한 부모 인터페이스를 참조 타입으로
						 // D1 : 상속 받은 자식 인터페이스를 구현한 인스턴스
		da.a1(); // 타입이 알고있는 메서드 실행 가능
//		da.b1(); 얘네는 타입이 몰라서 안됨
//		da.d1();
		
		System.out.println("");
		
		
		B db = new D1();
//		db.a1();
		db.b1(); // 타입이 알고 있는 애만 사용 가능
//		db.d1();
		
		System.out.println("");
		
		D dd = new D1();
		
		dd.a1();
		dd.b1();
		dd.d1();
		
		
		System.out.println("");
		
		D d11 = new D1();
		d11.a1();
		d11.b1();
		d11.d1();
		
		
		System.out.println("");
		
		
		// 다른 타입인 변수의 데이터를 꺼내서 옮겨 담는 법
		
		A a22 = d11; // 인스턴스 d11이 중요한 것이 아니고 타입 A가 중요
		// d11은 D 타입, a22는 A 타입
		// 자식 인터페이스 타입을 가지는 변수의 데이터는
		// 부모 인터페이스 타입을 가지는 변수에 옮겨 담을 수 있다.
		
		a22.a1();
//		a22.b1();  기존의 데이터 d22가 어떤 인스턴스든,어떤 타입이든 간에 
//		a22.d1();  현재 변수의 타입에 의해서 메서드 실행 여부를 판단
		
		
		System.out.println("");
		
//		B b22 = a22(); // A 인터페이스와 B 인터페이스는 아무 관계가 아님
					   // 그래서 변수의 데이터를 옮겨 담을 수 없다.
					   // a22 변수에는 실제 d11 인스턴스가 담겨 있음을 알고 있기 때문에
					   // 강제 형변환이 가능하다.
		
		
		B b22 = (B)a22;
		
		b22.b1(); // 형변환해서 사용 가능해짐
		System.out.println("");
		
		
		//----------------------------------------
		// 만약 확실하게 판단할 수 없다면
		
		B b3 = null;
		// null로 준비
		
		if(a22 instanceof B) { // a22 내부의 데이터(인스턴스)가 B로 형변환이 가능한가
			b3 = (B)a22; // a22 내부의 인스턴스는 B 타입의 변수에 할당 가능
		}
		// 이렇게 형변환
		
		
		if(b3==null) {
			System.out.println("형변환 실패");
		}else {
			System.out.println("형변환 성공");
			b3.b1();
		}
		
		D1 d1 = new D1();
		
		methodA(d1);
		methodB(d1); 
		// 자식 인터페이스로 구현한 인스턴스를 부모 인터페이스 타입의 매개 변수에 전달 가능
		methodD(d1); 
		// 인터페이스로 구현한 인스턴스를 매개값(인자)로 전달 가능
		
		
		
		
		
		
		
		
		
	}

	private static void methodA(A a) { // 인스턴스의 타입이 A
		a.a1();
//		a.b1();
//		a.d1();
	}

	private static void methodB(B b) { // 인스턴스의 타입이 B
		b.b1();
//		b.a1();
//		b.d1();
	}

	private static void methodD(D d) {
		d.a1(); d.b1(); d.d1(); // 인스턴스의 타입이 D
	}

}
