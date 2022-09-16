package ch04;

import java.util.Random;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// 은행
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		
		
		int money = 10000;
		int newMoney = 0;
		int myMoney = 0;
		System.out.println("은행에 오신 것을 환영합니다.");
		
		main:while(true) {
				
			
			System.out.println("원하시는 메뉴의 번호를 입력해 주세요.");
			System.out.println("1. 예금");
			System.out.println("2. 출금");
			System.out.println("3. 잔액 조회");
			System.out.println("4. 종료");
			
			
			int user = Integer.parseInt(in.nextLine());
			
			
			
			switch(user) {
			case 1 :
				System.out.println("입금하실 금액을 입력해 주세요.");
				newMoney = Integer.parseInt(in.nextLine());
				money+=newMoney;
				System.out.println("입금이 완료되었습니다.");
				break;
			case 2 :
				System.out.println("출금하실 금액을 입력해 주세요\n현재 잔고는 "+money+"원입니다.");
				myMoney = Integer.parseInt(in.nextLine());
				if(myMoney<=money) {
					money-=myMoney;
					System.out.println(myMoney+"원이 출금됐습니다.");
				}else if(myMoney>money) {
					System.out.println("잔액이 부족합니다.\n확인 후 다시 요청바랍니다.");
				}
				break;
			case 3 :
				System.out.println("현재 잔액은 "+money+"원 입니다.");
				
				break;
			case 4 :
				System.out.println("프로그램을 종료합니다.");
				break main;
			default :
				System.out.println("잘못 입력했습니다.\n확인 후 다시 입력해 주세요.");
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		

	}

}
