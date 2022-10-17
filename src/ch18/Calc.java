package ch18;

public class Calc { // 두 스레드가 동시에 사용할 메서드를 가진 클래스
	private int memory;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) {
//		synchronized => 동기화 => 스레드 간 공유 불가..
		this.memory = memory;
		try {
			Thread.sleep(1000); // 지연 시간 2초
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"에 저장된 메모리의 값 : "+this.memory);
	}						// 현재 실행 중인 스레드의 이름을 불러오는 메서드
	
	
	
}
