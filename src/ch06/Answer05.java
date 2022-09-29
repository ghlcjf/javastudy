package ch06;

import java.util.Scanner;

public class Answer05 {
	static int max = 0;
	static Scanner in = new Scanner(System.in);
	static int num = 0;
	
	public static void main(String[] args) {
		// 주어진 배열을 입력받아서 가장 큰 수를 반환하는 메소드를 만들어 보세요
		System.out.println("몇 개의 점수를 넣으시겠습니까?");
		num = Integer.parseInt(in.nextLine());
		int[] arr = new int[num];
		for(int i=0;i<num;i++) {
			System.out.println((i+1)+"번째 점수를 입력해 주세요.");
			arr[i] = Integer.parseInt(in.nextLine());
		}

		
		
		
		
		maxnum(arr);
		
		
		
		System.out.println("가장 큰 수 : "+max);
	}

	private static int maxnum(int[] arr) {
		
		if(num==0 || arr==null) {
			System.out.println("-99999");
			System.exit(0);
		}
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];	
			}	
		}
		
		return max;
	}

	
}
