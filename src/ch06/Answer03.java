package ch06;

import java.util.Scanner;

public class Answer03 {

	public static void main(String[] args) {
		// 두 개의 숫자를 입력받아서 작은 수부터 큰 수까지의 구구단을 출력하세요
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("두 개의 숫자 중 하나를 입력해 주세요");
		int min = Integer.parseInt(in.nextLine());
		System.out.println("나머지 하나의 숫자를 입력해 주세요");
		int max = Integer.parseInt(in.nextLine());
		int pocket = 0;
		if(min>max) {
			pocket = min;
			min = max;
			max = pocket;
		}else if(min==max) {
			System.out.println("숫자 똑바로 입력하세요");
			System.exit(0);
		}
		
		gugudan(min,max);

	}

	private static void gugudan(int min, int max) {
		
		for(;min<=max;min++) {
			System.out.println("---"+min+"단---");
			for(int j = 1;j<=9;j++) {
				System.out.println(min+"X"+j+"="+(min*j));
			}
		}
		
	}

}
