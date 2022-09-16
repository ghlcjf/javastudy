package ch04;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// 성적 프로그램
		Scanner in = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;
		int sum = 0;
		double avg = 0;
		main:while(true) {

			System.out.println("성적 관리 프로그램입니다.");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 조회");
			System.out.println("3. 종료");
			System.out.print("메뉴를 선택해 주세요>>");
			int selectNum = Integer.parseInt(in.nextLine());
			
			switch(selectNum) {
			case 1:
				System.out.println("국어 점수를 입력하세요");
				kor = Integer.parseInt(in.nextLine());
				System.out.println("영어 점수를 입력하세요");
				eng = Integer.parseInt(in.nextLine());
				System.out.println("수학 점수를 입력하세요");
				math = Integer.parseInt(in.nextLine());
				break;
			case 2:
				sum = kor+math+eng;
				avg = Math.round(sum/3.0*100)/100.0;
				System.out.println("당신의 총점은 "+sum+"점입니다.");
				System.out.println("당신의 평균은 "+avg+"점입니다.");
				if(avg>=60) {
					System.out.println("합격입니다.");
				}else {
					System.out.println("더 열심히 공부하세요!");
				}
				break;
			case 3:
				break main;
			default:
				System.out.println("번호를 다시 입력해 주세요!");
			}
					
		}		
				
	}

}
