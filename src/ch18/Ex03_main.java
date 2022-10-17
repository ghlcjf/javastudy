package ch18;

public class Ex03_main {

	public static void main(String[] args) {
		// 멀티 스레드 프로그램
		// 멀티 스레드 만드는 방법
			// 2) Thread를 상속받은 클래스를 이용하는 방법
		Thread t1 = new Ex03_DingDong01(); // 멀티 스레드를 생성하는 객체
		Thread t2 = new Ex03_DingDong02();
		t1.start();
		t2.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("딩");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
