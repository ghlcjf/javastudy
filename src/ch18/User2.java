package ch18;

public class User2 extends Thread{
	
	private Calc c;
	
	public User2(Calc c) {
		this.c = c;
		this.setName("유저 2"); // 스레드를 상속받았을 때 사용할 수 있는 메서드, 스레드 이름 지정
							  // 현재 실행할 스레드의 이름
	}

	@Override
	public void run() {
		c.setMemory(50);
		
	}
}
