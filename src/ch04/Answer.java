package ch04;

import java.util.Scanner;

public class Answer {

	public static void main(String[] args) {
		// 1. 1부터 100까지 합을 구하시오.
		
		int sum = 0;
		for (int i=1;i<=100;i++) {
			sum+=i;
			
		}
		System.out.println(sum);
		
		
		// 2. 1부터 100까지 7의 배수의 합계를 구해보세요.
		
		int sum_2 = 0;
		for (int j=0;j<=100;j=j+7) {
			sum_2+=j;
		}
		System.out.println(sum_2);
		
		
		// 3. 1부터 100까지의 합을 구하되 합계가 1000을 넘으면 중단
		
		int sum_3 = 0;
		for (int i=0;i<=100;i++) {
			sum_3+=i;
			if (sum_3>1000) {
				break;
			}
		}
		System.out.println(sum_3);
		
		
		// 4. 구구단을 출력하세요
		
		int a = 2;
		int b = 1;
		
		while (a<10) {
			while (b<10) {
				System.out.println(a+"x"+b+"="+(a*b));
				b++;
			}
			a++;
			b=1;
		}
		
		// 5. 다음과 같은 ☆모양을 출력하세요 (이중 반복)
		
		
		char star = '☆';
		for (int j=1;j<=5;j++) {
			for (int i=1;i<=5;i++) {
			System.out.print(star);
		}
			System.out.println("");
		}
		
		
		// 6. 1부터 100까지 7의 배수의 합과 평균을 구하세요
		
		int sum_6 = 0;
		for (int i=0;i<=100;i+=7) {
			sum_6 = sum_6+i;
			
		}
		System.out.println(sum_6);
		System.out.println(sum_6/14);
		
		
		// 7. 100 이하의 자연수 중에서 2의 배수와 7의 배수(공배수)를 모두 출력하고 그것들의 합과 평균을 구하시오.
		int sum_7 = 0;
		for (int i=1;i<=100;i++) {
			if (i%2!=0 || i%7!=0) {
				continue;
			}
			System.out.println(i);
			sum_7=sum_7+i;
		}
		System.out.println(sum_7);
		System.out.println(sum_7/2);
		
		
		
		// 8. 1부터 20까지의 정수 중에서 2또는 3의 배수가 아닌 수의 총합을 구하세요
		int sum_8 = 0;
		
		for (int i = 1;i<=20;i++) {
			if (i%2==0 || i%3==0) {
				continue;
			}
			sum_8+=i;
			
		}
		System.out.println(sum_8);
		
		
		// 9. 국어, 영어, 수학 점수를 입력받아서 총점과 평균을 구하는 프로그램을 만들어 봅시다.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하세요.");
		int kor = scan.nextInt();
		System.out.println("영어 점수를 입력하세요.");
		int eng = scan.nextInt();
		System.out.println("수학 점수를 입력하세요.");
		int math = scan.nextInt();
		int sum_9 = kor+eng+math;
		double avg_9 = Math.round(sum_9/3.0*100)/100.0;
		System.out.println("당신의 총점은 "+sum_9+"점입니다.");
		System.out.println("당신의 평균은 "+avg_9+"점입니다.");
		scan.nextLine();
		
		
		
		System.out.print("국어점수>");
		int korScore = Integer.parseInt(scan.nextLine());
		System.out.print("영어점수>");
		int engScore = Integer.parseInt(scan.nextLine());
		System.out.print("수학점수>");
		int mathScore = Integer.parseInt(scan.nextLine());
		
		int totalScore = korScore+engScore+mathScore;
		double avgScore = Math.round(totalScore/3.0*100)/100.0;
		System.out.println("당신의 총점은 "+totalScore+"점입니다.");
		System.out.println("당신의 평균은 "+avgScore+"점입니다.");
		
		
		
		
		// 10. 로그인 기능을 구현하세요.
		String id = "green";
		String pw = "gr1234";
		Scanner s = new Scanner(System.in);
		
		System.out.println("그린 아카데미에 오신 것을 환영합니다.");
		System.out.println("서비스를 이용하시려면 로그인을 하세요.");
		System.out.println("아이디를 입력하세요");
		String userId = s.nextLine();
		if (id.equals(userId)) {
			System.out.println("패스워드를 입력하세요");
			String userPw = s.nextLine();
			if (pw.equals(userPw)) {
				System.out.println("로그인 되었습니다.");
			} else {
				System.out.println("패스워드를 확인해 주세요.");
			}
		} else {
			System.out.println("아이디를 확인해 주세요.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
