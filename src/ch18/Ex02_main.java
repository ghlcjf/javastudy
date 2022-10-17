package ch18;

public class Ex02_main {

	public static void main(String[] args) {
		// 멀티 스레드 프로그램
		// 멀티 스레드를 만드는 방법
			// 1) Runnable 인터페이스를 구현한 클래스를 이용하는 방법 
			
		Runnable dong = new Ex02_DingDong01();
		// dong.run();
		Thread t= new Thread(dong); // 멀티 스레드를 생성하는 객체임
		t.start(); // 멀티 스레드 시작
		
		for(int i=0;i<5;i++) {
			System.out.println("딩");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("------------------------------------------");
		
		
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
