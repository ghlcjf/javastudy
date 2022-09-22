package ch06;

import java.util.Scanner;

public class Answer08 {
	static Scanner in = new Scanner(System.in);
	static int money = 100;
	
	public static void main(String[] args) {
		// 은행 예금 예제 메소드
		
		main:while(true) {
			System.out.println("그린은행에 오신 것을 환영합니다.");
			System.out.println("1. 예금");
			System.out.println("2. 출금");
			System.out.println("3. 조회");
			System.out.println("4. 종료");
			System.out.print("원하시는 메뉴 번호를 입력해주세요 >");
			int selcetNum = Integer.parseInt(in.nextLine());
			
			switch(selcetNum) {
			case 1:
				deposit();
				break;
			case 2:
				withdraw();
				break;
			case 3:
				checkBalance();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				break main;
			default:
				System.out.println("잘못 입력하셨습니다 \n정신 차리세요");
			}
		}
	}

	private static void checkBalance() {
		System.out.println("잔액을 조회합니다.");
		System.out.println("현재 잔액은 "+money+"원입니다.");
		
	}

	private static void withdraw() {
		System.out.println("출금하실 금액을 입력해 주세요.");
		int withdraw = Integer.parseInt(in.nextLine());
		if(withdraw>money) {
			System.out.println("잔액이 부족합니다.\n잔액을 확인해 주세요.");
		}else {
			money-=withdraw;
			System.out.println(withdraw+"원이 출금되었습니다.");
		}
		
	}

	private static void deposit() {
		
		System.out.println("예금하실 금액을 입력해 주세요.");
		int deposit = Integer.parseInt(in.nextLine());
		
		money += deposit;
		if(money>1000000) {
			System.out.println("잔액이 초과되었습니다");
			money-=deposit;
			System.out.println("현재 잔액은 "+money+"원입니다.");
			System.out.println("잔액의 총액은 1,000,000원을 초과할 수 없습니다.\n확인 후 다시 입금해 주세요.");
			
		}else {
			System.out.println(deposit+"원이 입금되었습니다.");
		}
		
	}

}
