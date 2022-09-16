package ch04;

public class Ex01_if {

	public static void main(String[] args) {
		// if 조건문 예제
		int jumsu = 75;
		
		
		if (jumsu>=60) { 
			// if문의 코드블록(영역) : 조건이 true인 경우에만 실행되는 블록
			System.out.println("합격입니다!");
			System.out.println("합격 통지서를 받아 주시기 바랍니다.");
		} else {
			// 조건이 false인 경우에만 실행되는 블록
			System.out.println("불합격입니다..");
		}
		
		System.out.println("프로그램을 종료합니다.");
		
		
	}

}
