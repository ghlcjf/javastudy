package ch04;

import java.util.Scanner;

public class Answer01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1부터 100까지 합을 구하세요. 
		int sum_1=0;
		for(int i=0;i<=100;i++) {
			sum_1+=i;
		}
		System.out.println("1부터 100까지의 합 : "+sum_1);
		
		
		System.out.println("");
		// 1부터 100까지 7의 배수의 합계를 구해보세요.
		
		
		int sum_2=0;
		for(int i=0;i<=100;i++) {
			if(i%7!=0) {
				continue;
			}
			sum_2+=i;
		}
		System.out.println(sum_2);
		
		System.out.println("");
		// 1부터 100까지의 합을 구하되 합계가 1000을 넘으면 연산을 중단하고 그때의 합계를 출력해 보세요. 
		// [합계 : 1035]
		int num_3=0;
		int sum_3=0;
		for(num_3=0;num_3<=100;num_3++) {
			
			sum_3+=num_3;
			if(sum_3>=1000) {
				break;
			}
		}
		System.out.println("1000을 넘는 시점의 num의 값 : "+num_3);
		System.out.println("합계 : "+sum_3);
		
		System.out.println("");
		// 구구단을 출력하세요.
		
		for(int i=2;i<=9;i++) {
			System.out.println("---"+i+"단"+"---");
			for(int j=1;j<=9;j++) {
				System.out.println(i+"X"+j+"="+(i*j));
				
			}
			System.out.println("");
		}
		
		
		System.out.println("");
		// 다음과 같은 ☆모양을 출력하세요(이중 반복)
		// ☆ ☆ ☆ ☆ ☆
		// ☆ ☆ ☆ ☆ ☆
		// ☆ ☆ ☆ ☆ ☆
		// ☆ ☆ ☆ ☆ ☆
		// ☆ ☆ ☆ ☆ ☆
		System.out.println("행 개수를 입력하세요.");
		int height = Integer.parseInt(sc.nextLine());
		System.out.println("열 개수를 입력하세요.");
		int width = Integer.parseInt(sc.nextLine());
		for(int i=1;i<=height;i++) {
			for(int j=1;j<=width;j++) {
				System.out.print("💥");
			}
			System.out.println("");
		}
		
		
		
		System.out.println("");
		// 6. 1부터 100까지 7의 배수의 합과 평균을 구하세요.
		int sum_6=0;
		double avg_6=0;
		int count = 0; // if문 실행횟수를 알기 위한 변수
		
		for(int i=1;i<=100;i++) {
			if(i%7==0) {
				System.out.println(i);
				sum_6+=i;
				count++; //if문이 실행될 때마다 카운트 1씩 증가
			}
			
		}
		avg_6=sum_6/(count*1.0);
		System.out.println("합계 : "+sum_6);
		System.out.println("평균 : "+avg_6);
		
		
		
		System.out.println("");
		// 7. 100 이하의 자연수 중에서 2와 7의 공배수를모두 출력하고 그것들의 합과 평균을 구하세요.
		System.out.println("1부터 100사이의 숫자 중에서 공배수를 구해 봅시다.");
		System.out.println("첫 번째 구하고자 하는 배수의 값을 입력하세요>");
		int fNum = Integer.parseInt(sc.nextLine());
		System.out.println("두 번째 구하고자 하는 배수의 값을 입력하세요>");
		int sNum = Integer.parseInt(sc.nextLine());
		
		
		int sum_7=0;
		double avg_7=0;
		int count_7 = 0;
		
		for(int i=1;i<=100;i++) {
			if(i%fNum==0 && i%sNum==0) {
				sum_7+=i;
				count_7++;
			}
			
		}
		
		avg_7=Math.round(sum_7/(count*1.0)*100)/100.0;
		
		System.out.println("1부터 100까지 "+fNum+"와 "+sNum+"의 합계 : "+sum_7);
		System.out.println("1부터 100까지 "+fNum+"와 "+sNum+"의 평균 : "+avg_7);
		
		
		
		System.out.println("");
		// 8. 1부터 20까지의 정수 중에서 (2또는 3의 배수)가 아닌 수의 총합을 구하세요.(2와 3의 공배수가 아닌 수)
//		int sum_8=0;
//		for(int i=1;i<=20;i++) {
//			if(i%2==0 || i%3==0) {
//				continue;
//			}
//			sum_8+=i;
//		}
//		System.out.println("합계 : "+sum_8); 
		
		int num_8 = 1;
		int max_8 = 20;
		int sum_8 = 0;
		for(num_8=1;num_8<=max_8;num_8++) {
//			if (num_8%2!=0 || num_8%3!=0) {
//				sum_8+=num_8;
//			}
			if (!(num_8%2==0 && num_8%3==0)) {
				sum_8+=num_8;
			}
		}
		
		System.out.println("합계 : "+sum_8);
		
		
		
		
		System.out.println("");
		// 9. 국어,영어, 수학 점수를 입력받아서 총점과 평균을구하는 프로그램을 만들어 봅시다.
		
		
		
		System.out.println("국어 점수를 입력해주세요.>");
		int kor = Integer.parseInt(sc.nextLine());
		System.out.println("영어 점수를 입력해주세요.>");
		int eng = Integer.parseInt(sc.nextLine());
		System.out.println("수학 점수를 입력해주세요.>");
		int math = Integer.parseInt(sc.nextLine());
		
		int sum_9=kor+eng+math;
		double avg_9=Math.round(sum_9/3.0*100)/100.0;
		System.out.println("당신의 총점은 "+sum_9+"점입니다.");
		System.out.println("당신의 평균은 "+avg_9+"점입니다.");
		
		
		
		
		
		System.out.println("");
		// 10. 로그인 기능을 구현하세요.
		// 저장된 아이디 : ‘grean'
		// 저장된 비밀번호: ‘gr1234’
		
		String id="green";
		String pw="gr1234";
		
		System.out.println("아이디를 입력하세요");
		String user_Id = sc.nextLine();
		if (id.equals(user_Id)) {
			System.out.println("비밀번호를 입력하세요");
			String user_Pw=sc.nextLine();
			if(pw.equals(user_Pw)) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("패스워드를 확인해주세요");
			}
		} else {
			System.out.println("아이디를 확인해주세요");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
