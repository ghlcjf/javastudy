package review04.part2;

import java.util.Scanner;

public class Answer13 {
	public static void main(String[] args) {
		// 임의의 두 수를 입력받아서 두 수 사이의 합을 구하세요
		
		Scanner in = new Scanner(System.in);
		
		
		int a = Integer.parseInt(in.nextLine());
		int b = Integer.parseInt(in.nextLine());
		int c;
		if(a>b) {
			c=b;
			a=b;
			b=c;
		}
		int sum = 0;
		for(int i=a;a<=b;a++) {
			sum+=a;
		}
		System.out.println(sum);
		
	}
}
