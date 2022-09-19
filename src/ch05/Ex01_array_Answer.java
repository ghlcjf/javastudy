package ch05;

import java.util.Scanner;

public class Ex01_array_Answer {

	public static void main(String[] args) {
		// 학생 수를 입력 받아서 각 학생의 자바 점수를 입력 받은 후 총점과 평균을 구하시오.
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("학생 수를 입력해 주세요>");
		int user = Integer.parseInt(in.nextLine());
		
		int[] jumsus = new int[user];
		int sum = 0;
		double avg = 0.0;
		
		for(int i=0;i<user;i++) {
			System.out.println((i+1)+"번째 학생의 자바 점수를 입력해 주세요>");
			jumsus[i] = Integer.parseInt(in.nextLine());
			sum+=jumsus[i];
		}
		
		avg = Math.round(sum/(jumsus.length*1.0)*100)/100.0;
		
		System.out.println("총점: "+sum);
		System.out.println("평균: "+avg);
		
		

	}

}
