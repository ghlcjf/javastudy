package ch04;

import java.util.Scanner;

public class BankAccount {

	public static void main(String[] args) {
		// [응용] 은행 예제
		
		
		Scanner in = new Scanner(System.in); // 입력 받을 수 있게
		boolean run = true;
		int balance = 500000; // 예금 잔고
		int money = 0;
		main:while (run) {
			
			System.out.println("그린 뱅크에 오신 것을 환영합니다!");
			System.out.println("메뉴를 선택해 주세요.");
			System.out.println("1. 예금");
			System.out.println("2. 출금");
			System.out.println("3. 조회");
			System.out.println("4. 종료");
			
			System.out.print(">>");
			int selectNum = Integer.parseInt(in.nextLine());
			
			switch(selectNum) {
			case 1: // 예금 기능
				System.out.println("예금 기능");
				System.out.println("입금할 금액을 입력하세요.");
				money = Integer.parseInt(in.nextLine());
				balance+=money;
				System.out.println(money+"원 입금이 완료되었습니다.");
				break;
				
			case 2: // 출금 기능
				System.out.println("출금 기능");
				System.out.println("출금할 금액을 입력하세요.");
				money = Integer.parseInt(in.nextLine());
				if (money>balance) {
					System.out.println("잔액이 부족합니다.");
				}else {
					balance-=money;
					System.out.println(money+"원 출금이 완료되었습니다.");
				}
				
				break;
				
			case 3: // 조회 기능
				System.out.println("잔액을 조회합니다.");
				System.out.println("잔고 : "+balance+"원");
				break;
				
			case 4: // 종료 기능
				System.out.println("프로그램을 종료합니다. "); // while을 끝내면 프로그램이 종료
				break main; //종료시키는 첫 번째 방법.
//				run = false; // 두 번째 방법.
//				return; // 세 번째 방법. (메인을 끝내는 것)
//				System.exit(0); // 네 번째 방법. (윈도우 창 종료버튼과 동일,종료하는 기능)
				
			default:
				System.out.println("잘못 선택했습니다.");
				System.out.println("다시 확인해 주세요.");
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
