package ch10;

public interface Check03 extends Check01,Check02 {
	// 인터페이스끼리는 상속이 가능하고 다중 상속도 된다(클래스는 안 됨)
	public void method6();
}
