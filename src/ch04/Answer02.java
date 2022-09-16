package ch04;

import java.util.Scanner;

public class Answer02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 중간맛
		
		// 11. 구구단 짝수단을 출력하세요.
				
		for (int i=2;i<=9;i++) {
			if (i%2==1) {
				continue;
			}
			for (int j=1;j<=9;j++) {
				System.out.println(i+"x"+j+"="+(i*j));
			}
		}
		System.out.println("");
		// 12. 구구단을 가로로 출력하세요.
		
		
		for (int i=2;i<=9;i++) {
			for (int j=1;j<=9;j++) {
				System.out.print(i+"x"+j+"="+(i*j)+" ");
			}
			System.out.println("");
		}
		
		System.out.println("");
		// 13. 10~100까지 중 10의 자리와 1의 자리가 짝수인 수를 모두 출력하시오
		
		for (int i = 10;i < 100;i++) {
			if (i%2==1 || (i/10)%2==1) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("");
		// 14. 1+(1+2)+(1+2+3)+...(1+2+3+..+9+10)의 결과를 계산하세요.
		
		int sum_4 = 0;
		int total_4 = 0;
		for(int i=1;i<=10;i++) {
			sum_4+=i;
			total_4+=sum_4;
		}
		
		System.out.println(total_4);
		
		System.out.println("");
		// 15. 1+(-2)+3+(-4)+...같은 식으로 더해 나갔을 때 
		// 총합이 몇까지 더해야 100 이상이 되는 지 구하세요.
		int sum_5 = 0;
		int s = 1;
		int num_5 = 0;
		
		for (int i=1;true;i++,s=-s) {
			num_5=i*s;
			sum_5+=num_5;
			if (sum_5>=100) {
				break;
				
			}
		}
		
		System.out.println("num_5 : "+num_5);
		System.out.println("sum_5 : "+sum_5);
	
		
		
		
		
		// 16. 두개의 숫자를 입력받아서 두 수 사이의 합을 구하세요.
		Scanner scan = new Scanner(System.in);
		int sum_6 = 0;
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = 0;
		if (a>b) {//a=7, b=4 인 상황 c=0
			c=b; // a=7, b=4, c=4
			b=a; // a= 7, b=7, c=4
			a=c; // a=4, b=7, c=4
		}
		while (a<=b) {
			sum_6+=a;
			a++;
		}
		System.out.println(sum_6);
		
		
		
		// 17. 다음과 같은 모양을 출력하세요.
//				☆
//				☆☆
//				☆☆☆
//				☆☆☆☆
//				☆☆☆☆☆
		
		for(int i = 1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("☆");
			}
			System.out.println("");
		}
		
		// 18. 다음과 같은 모양을 출력하세요
		// ☆☆☆☆☆
		// ☆☆☆☆
		// ☆☆☆
		// ☆☆
		// ☆
	
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("☆");
			}
			System.out.println("");
		}
		



		
		
	}

}
