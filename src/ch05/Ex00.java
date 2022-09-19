package ch05;

import java.util.Scanner;

public class Ex00 {

	public static void main(String[] args) {
		// 다음 데이터를 배열에 담아서 평균을 구해보자
		
//		int[] arr = new int[] {78,85,72,95,86,90};
//		int sum = 0;
//		double avg = 0.0;
//		
//		for(int i=0;i<arr.length;i++) {
//			sum+=arr[i];
//		}
//		avg = Math.round((sum*1.0)/arr.length*100)/100.0;
//		
//		System.out.println("총점 : "+sum);
//		System.out.println("평균 : "+avg);
		
		
		// 학생 수를 입력받고 각 학생의 java 점수를 입력받아서 총점과 평균을 구하는 프로그램을 구해봅시다.
		Scanner in = new Scanner(System.in);
//		
//		System.out.println("java 점수 관리 프로그램입니다.");
//		System.out.println("학생 수를 입력해 주세요.");
//		System.out.print(">>");
//		int student = Integer.parseInt(in.nextLine());
//		
//		int[] scores = new int[student];
//		int sum = 0;
//		double avg = 0.0;
//		
//		for(int i = 0;i<scores.length;i++) {
//			System.out.println((i+1)+"번째 학생의 점수를 입력해 주세요");
//			System.out.print(">>");
//			scores[i] = Integer.parseInt(in.nextLine());
//			sum+=scores[i];
//		}
//		avg = Math.round((sum*1.0)/scores.length*100)/100.0;
//		System.out.println("총점 : "+sum);
//		System.out.println("평균 : "+avg);
//		
//		
		
		// 5명의 학생이 있고 그 학생의 성적을 담기 위한 배열
		// 과목은 3개. 이 배열을 만들어보자
		
//		int[][] grade = new int[5][3];
//		for(int i=0;i<grade.length;i++) {
//			System.out.println((i+1)+"번째 학생의 점수를 입력해 주세요");
//			
//			for(int j = 0;j<grade[i].length;j++) {
//				System.out.println("국어, 영어, 수학 점수를 순서대로 하나씩 입력해 주세요");
//				grade[i][j] = Integer.parseInt(in.nextLine());
//				
//			}
//		}
		
		
		
		
		// 4명의 학생에게 3개의 점수를 받아서 모든 점수의 총점과 평균을 구합니다.
		int[][] num = {
				{67,78,96},
				{77,88,86},
				{69,89,78},
				{98,79,65}
		};
		
		
//		int sum = 0;
//		double avg = 0.0;
		
//		for(int i=0;i<num.length;i++) {
//			for(int j=0;j<num[i].length;j++) {
//				sum+=num[i][j];
//				
//			}
//		}
//		for(int i=0;i<num.length;i++) {
//			for(int n:num[i]) {
//				sum+=n;
//			}
//		}
//		avg = Math.round((sum*1.0)/num.length*100)/100.0;
//		
//		System.out.println("모든 학생들의 점수 총합 : "+sum);
//		System.out.println("모든 학생들의 점수 평균 : "+avg);
//		
		
		
		
		
		// 배열을 옮기기 위한 더 큰 배열 준비.
		int[] oldNum = {1,2,3};
		int[] newNum = new int[5];
		
		//배열 복사
//		for(int i=0;i<oldNum.length;i++) {
//			newNum[i] = oldNum[i];
//		}
		//새로운 배열의 데이터 출력
//		for(int j=0;j<newNum.length;j++) {
//			System.out.println(newNum[j]);
//		}
//		
		
		System.arraycopy(oldNum, 0, newNum,1,oldNum.length);
		//			(원본 배열, 원본 시작 인덱스, 대상 배열, 대상 시작 인덱스, 복사 길이)
		for(int i=0;i<newNum.length;i++) {
			System.out.println(newNum[i]);
		}
		
		
		

	}

}
