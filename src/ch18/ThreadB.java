package ch18;

public class ThreadB extends Thread{
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("[B] 스레드 작업");
			}else {
				Thread.yield(); // work가 false가 되면 다른 스레드에 순서 양보
			}
		}
		
		System.out.println("ThreadB 종료");
	}
}
