package ch18;

public class Ex05_main {

	public static void main(String[] args) {
		// 스레드 상태 제어
		// join();
		
		SumThread sum = new SumThread();
		
		sum.start();
		
		try {
			sum.join(); // sum 스레드가 마무리될 때까지 main 스레드를 멈추겠다.
						// == sum 스레드 먼저 처리하겠다.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		System.out.println("1부터 100까지의 합 : "+sum.getSum());
		
		// 100번 반복돌면서 sum에 합계를 구하기도 전에 출력문이 먼저 실행되버림
		
		
		
	}
}
