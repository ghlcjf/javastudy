package ch06;

import java.util.Scanner;

public class Answer02 {

	public static void main(String[] args) {
		// 숫자를 입력받으면 해당 숫자의 구구단을 출력하세요
		
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("출력하고 싶은 단 수를 입력해 주세요");
		int i= Integer.parseInt(in.nextLine());
		gugudan(i);

	}

	private static void gugudan(int i) {
		
		for(int j=1;j<=9;j++) {
			System.out.println(i+"X"+j+"="+(i*j));
		}
		
	}

}
