package ch10;

public class Check02Test implements Check01, Check02 {

	@Override
	public void method4() {
		System.out.println("메서드 4");
	}

	@Override
	public void method5() {
		System.out.println("메서드 5");
	}

	@Override
	public void method1() {
		System.out.println("메서드 1");
	}

	@Override
	public void method2(int a) {
		System.out.println("메서드 2"+a);
	}

	@Override
	public String method3() {
		System.out.println("메서드 3");
		return "메서드 3 result";
	}
	// 인터페이스 2개 이상을 구현할 수 있다.
	

}
