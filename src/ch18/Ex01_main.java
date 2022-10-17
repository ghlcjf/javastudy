package ch18;

public class Ex01_main {
	
	public static void main(String[] args) {
		// 싱글 스레드 프로그램
		for(int i=0;i<5;i++) {
			System.out.println("딩");
			try {
				Thread.sleep(1000); // 스레드의 실행시간을 지연시켜라 (1000=1초)
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for(int i=0;i<5;i++) {
			System.out.println("동");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}
}
