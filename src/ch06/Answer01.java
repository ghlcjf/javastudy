package ch06;

public class Answer01 {

	public static void main(String[] args) {
		// 구구단을 출력하는 메소드 만들기
		
		gugudan();

	}

	private static void gugudan() {
		
		for(int i=1;i<=9;i++) {
			System.out.println("---"+i+"단---");
			for(int j=1;j<=9;j++) {
				System.out.println(i+"X"+j+"="+(i*j));
			}
		
	}

	}

}
