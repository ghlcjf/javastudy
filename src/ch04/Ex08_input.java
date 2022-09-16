package ch04;

import java.util.Scanner;

public class Ex08_input {

	public static void main(String[] args) {
		// 콘솔 입력
		/*참조 타입*/Scanner /*변수*/scan = /*데이터, 리터럴*/new Scanner(System.in);
		
		String greeting = scan.next(); // [기능] 키보드로부터 문자열을 입력받는 기능.
		//문자열을 공백까지만 입력받는 기능.
		System.out.println("입력한 글자 : "+greeting);
		
		String greeting2 = scan.nextLine(); // [기능] 키보드로부터 문자열을 입력받는 기능.
		//문자열을 엔터키까지 입력받는 기능.(띄어쓰기 포함해서 입력 받을 때)
		System.out.println("입력한 글자 : "+greeting2);
		
		
		// 윈도우에서 제공하는 엔터키의 키코드가 2개.
		// 캐리지 리턴/ 라인 피드
		int num = scan.nextInt();
		double num2 = scan.nextDouble();
		
		
		
		// 버그 : 엔터키 버그. 숫자 입력 후 문자열 입력 시 입력을 스킵하는 버그,, 키코드가 2개라서..
		// 해결방법 : 2가지
		// - scan.nextInt같이 숫자 입력 후 scan.nextLine()을 통해서 버리는 키코드 제거.
		// - 숫자 입력 시 scan.nextLine()으로 입력받아서 문자열을 숫자로 변환
		
		
		int num3 = Integer.parseInt(scan.nextLine());
		double num4 = Double.parseDouble(scan.nextLine());
		
		
	}

}
