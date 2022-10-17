package ch18;

public class Ex02_DingDong01 implements Runnable{

	@Override
	public void run() { // 메인과는 별개로 동작되는 또 하나의 스레드
		// TODO Auto-generated method stub
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
