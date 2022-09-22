package ch06;

import java.util.Scanner;

public class Answer05_1 {
	static Scanner in = new Scanner(System.in);
	static int x = 0;
	static int num = 0;
	
	public static void main(String[] args) {
		// 주어진 배열을 입력받아서 총점을 구하는 메소드를 만들어 보세요
		
		System.out.println("몇 개의 점수를 입력하시겠습니까?");
		num = Integer.parseInt(in.nextLine());
		int[] arr = new int[num];
		for(int i=0;i<num;i++) {
			System.out.println((i+1)+"번째 점수를 입력해 주세요");
			arr[i] = Integer.parseInt(in.nextLine());
		}
		
		
		sum(arr);
		
		
		System.out.println("총점 : "+x);
	}


	private static int sum(int[] arr) {
		
			for(int i = 0;i<arr.length;i++) {
				x+=arr[i];
			
			
			
			}
			return x;
	}

}
