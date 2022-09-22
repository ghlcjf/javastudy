package ch06;

import java.util.Scanner;

public class Answer06 {
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		// 주어진 배열을 입력받아서 평균을 구하는 메소드를 만드세요
		
		System.out.println("몇 개의 점수를 입력하시겠습니까?");
		
		int num = Integer.parseInt(in.nextLine());
		int[] arr = new int[num];
		
		double avg = avg(arr);
		
		System.out.println("평균 : "+avg);
	}

	private static double avg(int[] arr) {
		int sum = 0;
		double avg = 0.0;
		for(int i=0;i<arr.length;i++) {
			System.out.println((i+1)+"번째 점수를 입력해 주세요");
			arr[i] = Integer.parseInt(in.nextLine());
			sum+=arr[i];
		}
		avg=Math.round(sum/(arr.length*1.0)*100)/100.0;
		return avg;
	}

}
