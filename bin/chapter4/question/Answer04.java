package chapter4.question;

public class Answer04 {

	public static void main(String[] args) {
		// 4. 구구단을 출력하세요.
		
		// 1단계 특정 단 하나를 출력하는 단순 출력문
		System.out.println("***** 1단계 *****");
		System.out.println("2 X 1 = 2");
		System.out.println("2 X 2 = 4");
		System.out.println("2 X 3 = 6");
		System.out.println("2 X 4 = 8");
		System.out.println("2 X 5 = 10");
		System.out.println("2 X 6 = 12");
		System.out.println("2 X 7 = 14");
		System.out.println("2 X 8 = 16");
		System.out.println("2 X 9 = 18");
		
		// 2단계 반복되는 부분을 관찰해서 반복문으로 바꿔 봅시다.
		System.out.println("\n***** 2단계 *****");
		for(int i=1;i<=9;i++) {
			System.out.println("2 X "+i+" = "+(2*i));
		}
		
		// 3단계 2단의 내용을 똑같이 9단까지 반복
		System.out.println("\n***** 3단계 *****");
		System.out.println("----- 2단 -----");
		for(int i=1;i<=9;i++) {
			System.out.println("2 X "+i+" = "+(2*i));
		}
		System.out.println("----- 3단 -----");
		for(int i=1;i<=9;i++) {
			System.out.println("3 X "+i+" = "+(3*i));
		}
		System.out.println("----- 4단 -----");
		for(int i=1;i<=9;i++) {
			System.out.println("4 X "+i+" = "+(4*i));
		}
		System.out.println("----- 5단 -----");
		for(int i=1;i<=9;i++) {
			System.out.println("5 X "+i+" = "+(5*i));
		}
		System.out.println("----- 6단 -----");
		for(int i=1;i<=9;i++) {
			System.out.println("6 X "+i+" = "+(6*i));
		}
		System.out.println("----- 7단 -----");
		for(int i=1;i<=9;i++) {
			System.out.println("7 X "+i+" = "+(7*i));
		}
		System.out.println("----- 8단 -----");
		for(int i=1;i<=9;i++) {
			System.out.println("8 X "+i+" = "+(8*i));
		}
		System.out.println("----- 9단 -----");
		for(int i=1;i<=9;i++) {
			System.out.println("9 X "+i+" = "+(9*i));
		}
		// 4단계 반복되는 부분을 관찰해서 반복문으로 바꿔 봅시다.
		System.out.println("\n***** 4단계 *****");
		for(int j=2;j<=9;j++) {
			System.out.println("----- "+j+"단 -----");
			for(int i=1;i<=9;i++) {
				System.out.println(j+" X "+i+" = "+(j*i));
			}
		}
	}

}
