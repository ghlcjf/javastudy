package review04.part1;

import java.util.Scanner;

public class Answer04 {
	public static void main(String[] args) {
		// 주어진 점수에 따라 아래와 같이 점수와 등급을 출력하세요.
		Scanner in = new Scanner(System.in);
		
		int score = Integer.parseInt(in.nextLine());
		
		if(score>=90) {
			System.out.println("당신의 점수는"+score+"점입니다.");
			System.out.println("당신의 등급은 A등급입니다.");
		}else if(score>=80) {
			System.out.println("당신의 점수는"+score+"점입니다.");
			System.out.println("당신의 등급은 B등급입니다.");
		}else if(score>=70) {
			System.out.println("당신의 점수는"+score+"점입니다.");
			System.out.println("당신의 등급은 C등급입니다.");
		}else if(score>=60) {
			System.out.println("당신의 점수는"+score+"점입니다.");
			System.out.println("당신의 등급은 D등급입니다.");
		}else {
			System.out.println("당신의 점수는"+score+"점입니다.");
			System.out.println("당신의 등급은 F등급입니다.");
		}
		
		
	}
}
