package ch10.finalcheck;

public class C1 implements A,B{

	@Override
	public void b1() {
		System.out.println("C1 클래스의 b1 메서드");
	}

	@Override
	public void a1() {
		System.out.println("C1 클래스의 a1 메서드");
	}
}
