package chapter4.question;

import java.util.Scanner;

public class Answer09 {

	public static void main(String[] args) {
		// 국어, 영어, 수학 점수를 받아서 총점 평균을 구해봅시다.
		Scanner s = new Scanner(System.in);
		
		System.out.println("그린 아카데미에 오신것을 환영합니다.");
		System.out.println("점수를 입력하면 총점과 평균이 출력됩니다.");
		System.out.print("국어점수>");
		int korScore = Integer.parseInt(s.nextLine());
		System.out.print("영어점수>");
		int engScore = Integer.parseInt(s.nextLine());
		System.out.print("수학점수>");
		int mathScore = Integer.parseInt(s.nextLine());
		
		int totalScore = korScore+engScore+mathScore;
		double avgScore = Math.round(totalScore/3.0*100)/100.0;
		
		System.out.println("당신의 총점은 : "+totalScore);
		System.out.println("당신의 평균은 : "+avgScore);
		
		
		
		
		
	}

}
