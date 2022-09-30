package ch11;

public class Ex02_main {

	public static void main(String[] args) {
		// 예외 처리 - 직접 해결하기
		// try~catch 구문
		
		int[] nums = new int[] {1,2,3};
		try {
			System.out.println("예외 발생 전 ");
			for(int i=0;i<=nums.length;i++) {
				System.out.println(nums[i]/0);
			}
			System.out.println("예외 발생 후 ");
		}catch(ArrayIndexOutOfBoundsException | ArithmeticException e) {
			System.out.println("예외가 발생했습니다.");
			
			System.out.println(e.getMessage());
			// 에러가 난 이유
			e.printStackTrace();
		}catch(Exception e) {//뭔지 모를 예외가 발생하면 캐치해라
			// 가급적 넓은 범위의 예외처리는 밑으로 => 시스템 과부하 우려
		}finally {
			System.out.println("예외 발생과 상관없이 무조건 실행되어야 할 코드");
		}
		
		
		System.out.println("이어서 계속 실행");
		
		
		//RuntimeException > 실행됐을 때 감지할 수 있는 오류
		
		
		
		
	}

}
