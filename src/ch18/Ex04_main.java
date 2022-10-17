package ch18;

public class Ex04_main {

	public static void main(String[] args) {
		// 스레드의 상태 제어
		
		// 1) yield()
		
		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB();
		System.out.println("A,B 스레드 동시 작업 시작");
		a.start();
		b.start();
		
		try {
			Thread.sleep(10); // 0.1초 main 스레드 일시정지
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		a.work = false; // A 스레드 작업 종료 => B 스레드만 작업 중인 상태
		System.out.println("***** [A] 스레드 작업 종료 *****");
		
		try {
			Thread.sleep(10); // 0.1초 main 스레드 일시정지
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		a.work = true; // A 스레드 작업 시작
		System.out.println("***** [A] 다시 작업 시작 *****");
		
		try {
			Thread.sleep(10); // 0.1초 main 스레드 일시정지
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		a.stop = true; // A,B 스레드 모두 작업 종료
		b.stop = true;
		
		
		
		
	}
	
}
