package ch10;

public class Ex03_main {

	public static void main(String[] args) {
		
		 Check01 c1 = new Check01Test();
		
		c1.method1();
		c1.method2(10);
		String result = c1.method3();
		System.out.println(result);
		// 인터페이스의 첫번째 역할 : 
		// 실제 인스턴스는 관심 없고 어떤 기능을 사용할 수 있는지 알려주는 역할.
		
		// 인터페이스로는 인스턴스를 만들 수 없다.
		
		// 인터페이스의 두번째 역할: 
		// 인터페이스 타입의 변수에 담길 인스턴스의 메서드를 강제로 만들(구현하)도록 하는 역할 
		// => Check01Test 클래스
		
		//--------------------------------------------------
		System.out.println("");
		
		Check02 c2= new Check02Test();
		
//		c2.method1(); // 타입(인터페이스)에 method1()이 있음을 안 알려줌
		c2.method4();
		c2.method5();
		
		Check01 c3 = new Check02Test();
		
		c3.method1();
		c3.method2(10);
		c3.method3();
//		c3.method4();
//		c3.method5();
		
		
		
		
	}

}
