package ch11;

public class Re02_main {
	public static void main(String[] args) {
	
		int[] num = {1,2,3};
		try {
			System.out.println(num[2]/1);	
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 범위 벗어남");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음");
		}catch(Exception e) {
			System.out.println("모든 예외 가능 가장 마지막에");
		}finally {
			System.out.println("예외가 발생하든 안 하든 무조건 실행");
		}
		
	
		
		
		
		
		
	}
}
