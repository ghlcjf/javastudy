package ch04;

import java.util.Random;
import java.util.Scanner;

public class Answer03 {
	
	public static void main(String[] args) {
		// 19. 어떤 정수의 양수 중 자신을 제외한 약수를 모두 합하면 자신과 같아지는 수[완전수]가 있다.
		// 예를 들면 6의 약수는 1, 2, 3, 6이다.
		// 1+2+3=6이 된다.
		// 4~100까지 숫자 중에 이런 숫자를 찾으세요.
		int sum_9=0;
		int num_9=0;
		for(int i=4;i<=100;i++) {
			
			for(int j=1;j<i;j++) {
				
				if(i%j==0) {
					num_9+=j; 			
				}
			}
			
			if(i==num_9) {
				System.out.println(num_9);
			}
			num_9=0;
		}
		
		
		
		// 20. 어떤 정수가 있을 때 각 자리 숫자의 합을 구하는 코드를 작성하세요 . 
		// 예를 들어 12345라는 숫자가있다면 1+2+3+4+5의 결과인 15를 출력하세요.
		
		Random r = new Random();
		
		int a_0= r.nextInt(99999)+1;
		System.out.println(a_0);
		int sum_0=0;
		
		sum_0=(a_0/10000)+((a_0%10000)/1000)+((a_0%1000)/100)+((a_0%100)/10)+((a_0%10)/1);
		
		System.out.println(sum_0);
		
		
		// 21.다음과 같은 ☆모양을 출력하세요
		// ☆
		// ☆ ☆
		// ☆ ☆ ☆
		// ☆ ☆ 
		// ☆
		
		
		
		
		
		
		
		
		
		
		
		
		
		// 24. 회문수를 구하는 프로그램을 완성하세요. 
		// 회문수란 앞으로 읽으나 거꾸로 읽으나 동일한 수를 의미한다. 
		// 예를 들면 ‘123454321’ 또는 ‘147898741’ 같은 형태의 수를 의미한다.
		Scanner sc = new Scanner(System.in);
		System.out.print("체크할 숫자를 입력하세요>>");
		int num = Integer.parseInt(sc.nextLine());
		String check = "";
		int temp =  num;
		
		
		while (temp>0) {
			check+=temp%10;
			temp/=10;
		}
		
		
		if(num==Integer.parseInt(check)) {
			System.out.println(num+"은 회문수가 맞습니다. ");
		}else {
			System.out.println(num+"은 회문수가 아닙니다. ");
		}
		
		
		
		
		
		
		
		

	}

}
