package ch18;

public class Ex06_main {

	public static void main(String[] args) {
		// 동기화
		
		Calc c = new Calc();
		
		User1 u1 = new User1(c);
		User2 u2 = new User2(c);
		
		
		u1.start();
		u2.start();
		
		
		
		
		
	}
	
}
