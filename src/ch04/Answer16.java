package ch04;

import java.util.Scanner;

public class Answer16 {

	public static void main(String[] args) {
		// 두개의 숫자를 입력받아서 두 수 사이의 합을 구하세요.
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자를 입력해 주세요.");
		int i = Integer.parseInt(in.nextLine());
		System.out.println("두 번째 숫자를 입력해 주세요.");
		int j = Integer.parseInt(in.nextLine());
		
		int c = 0;
		if(i>j) {
			c=i;
			i=j;
			j=c;
		}
		int sum = 0;
		while(i<=j) {
			sum+=i;
			i++;
		}
		
		System.out.println("두 수 사이의 합은 "+sum+"입니다.");
		
		
	}

}
