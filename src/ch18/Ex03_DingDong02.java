package ch18;

public class Ex03_DingDong02 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("댕");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
