package ch15;

public class OutterClass {

	public OutterClass() {
		System.out.println("외부 클래스 인스턴스 생성");
	}

	// 인스턴스 멤버 클래스 = 외부 클래스의 인스턴스가 만들어지면 그때 사용 가능
	class InnerClassA{
		public InnerClassA() {
			System.out.println("InnerClassA 클래스 인스턴스 생성");
		}
		int fieldA; 
		void methodA() {};
//		static int fieldB; // 정적 멤버는 쓸 수 없다.
//		static void methodB() {}
		// InnerClass의 멤버들 외부 클래스와는 아무 상관 없다
	}
	
	//------------------------------------------------------------
	// 정적 멤버 클래스
	static class InnerClassB{ // 외부 클래스의 인스턴스가 없어도 사용 가능
		public InnerClassB() {
			System.out.println("InnerClassB 클래스 인스턴스 생성");
		}
		int fieldA; 
		void methodA() {};
		static int fieldB; // 정적 멤버 쓸 수 있다.
		static void methodB() {}
		// InnerClass의 멤버들 외부 클래스와는 아무 상관 없다
	}
	
	//-------------------------------------------------------------
	// 로컬 클래스
	void method() {
		class LocalClassC{ // 외부 클래스의 인스턴스 멤버 메서드가 호출될 때만 사용 가능
			public LocalClassC() {
				System.out.println("LocalClassC 클래스 인스턴스 생성");
			}
			int fieldA; 
			void methodA() {};
//			static int fieldB; // 정적 멤버는 쓸 수 없다.
//			static void methodB() {}
			// LocalClass의 멤버들 외부 클래스와는 아무 상관 없다
		}
		
		LocalClassC c = new LocalClassC();
		
		c.fieldA=10;
		c.methodA();
	}
	
	
	//--------------------------------------------------------------
	// 외부 클래스도 멤버를 가진다 (필드,메서드...) => 내부 클래스를 외부 클래스의 멤버로 활용이 가능?
	//									 
	// 외부 클래스의 멤버 필드
	InnerClassA fieldA = new InnerClassA(); // 인스턴스 멤버 클래스 
	InnerClassB fieldB = new InnerClassB(); // 정적 멤버 클래스
	
	
	// 외부 클래스의 멤버 메서드
	void methodA() {
		InnerClassA varA = new InnerClassA(); 
		InnerClassB varB = new InnerClassB();
		varA.methodA();
		varB.methodA();
	}
	
	// 외부 클래스의 정적 멤버 필드
//	static InnerClassA fieldC = new InnerClassA(); 정적 멤버라서 인스턴스 멤버 사용 X 
	static InnerClassB fieldD = new InnerClassB(); // 정적 멤버 클래스
	
	
	
	
	// 외부 클래스의 정적 멤버 메서드
	static void methodB() {
//		InnerClassA varA = new InnerClassA(); 정적 메서드라서 인스턴스 멤버 사용 X 
		InnerClassB varB = new InnerClassB();
//		varA.methodA();
		varB.methodA();
	}
	
	//---------------------------------------------------------------
	// 외부 클래스의 멤버를 내부 클래스가 사용할 수 있는가.....?
	
	int field1;
	void method1() {}
	static int field2;
	static void method2() {} 
	
	// 인스턴스 멤버 클래스가 외부 클래스 필드 호출
	
	class B{
		void method() {
			field1 = 10;
			method1();
			field2 = 10;
			method2();
		}
	}
	
	
	// 정적 멤버 클래스가 외부 클래스 필드 호출
	
	static class C{
		void method() {
//			field1 = 10; 외부 클래스의 인스턴스가 있어야만 사용 가능한 외부 클래스 필드들은
//			method1(); 정적 멤버 클래스 내부에서 사용할 수 없다.
			field2 = 10;
			method2();
		}
	}
	
	// 로컬 클래스가 외부 클래스 필드 호출
	void localMethod1() {
		class D{
			void method() {
				field1 = 10;
				method1();
				field2 = 10;
				method2();
			}
		}
		
		D d = new D();
		d.method();
	}
	
	
	// 로컬 클래스는 로컬 변수를 사용할 수 있는가...?
	
	void localMethod2(int args) {
		// 이 변수는 메서드가 끝나면서 사라짐
		int localField = 10; // final을 적용해 두어야 로컬 클래스에서 사용 가능.
							 // java1.8부터는 final이 없어도 있는 것으로 간주
//		localField = 100;		이렇게 변경하면 final이 아니기 때문에 내부 클래스에서 로컬 변수를 
//								사용할 수 없어진다, 매개변수 args도 마찬가지
		class Inner{
			void method() {
//				localField = 100; 로컬 변수를 로컬 클래스에서 사용할 때는 
//								  final을 적용해서 [복사해두고 사용] 변경 불가하니 에러~
				int result = localField+args;
				
			}
		}
		Inner inner = new Inner(); // 로컬 클래스의 인스턴스가 사라지는 시점? 몰랑
		inner.method();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
