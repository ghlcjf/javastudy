package ch14.Answer;

import java.util.ArrayList;
import java.util.Scanner;

public class Answer05 {
	static Scanner in = new Scanner(System.in);
	static ArrayList<Account> aList = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("그린 은행에 오신 것을 환영합니다.");
		
		while(true) {
			System.out.println("원하시는 메뉴를 선택해 주세요");
			System.out.println("1. 계좌 생성");
			System.out.println("2. 은행 업무");
			System.out.println("3. 종료");
			System.out.print("선택 >> ");
			int selNum = Integer.parseInt(in.nextLine());
			
			switch(selNum) {
			case 1:
				createAcc();
				
				break;
			case 2:
				checkAcc();
				break;
			case 3:
				programExit();
				break;
			default:
				selectError();
			}
			
			
		}
	}
	private static void checkAcc() {
		boolean run = false;
		System.out.println("계좌 확인이 필요합니다 \n계좌번호를 입력해 주세요");
		System.out.print("입력 >> ");
		String acc = in.nextLine();
		for(int i=0;i<aList.size();i++) {
			if(aList.get(i).getAcc().equals(acc)) {
				bankwork(aList.get(i));
				run = true;
				break;
			}
		}
		if(run==false) {
			selectError();
		}
		
	}
	private static void bankwork(Account aList) {
		int money = 0;
		System.out.println("원하시는 메뉴를 선택해 주세요.");
		System.out.println("1. 입금");
		System.out.println("2. 출금");
		System.out.println("3. 잔액 조회");
		System.out.print("선택 >> ");
		int selNum = Integer.parseInt(in.nextLine());
		
		switch(selNum) {
		case 1:
			System.out.print("입금하실 금액을 입력해 주세요 >> ");
			money = Integer.parseInt(in.nextLine());
			aList.deposit(money);
			break;
		case 2:
			System.out.print("출금하실 금액을 입력해 주세요 >> ");
			money = Integer.parseInt(in.nextLine());
			aList.withdraw(money);
			break;
		case 3:
			aList.checkBalance();
			break;
		default:
			selectError();
		}
		
		
	}
	private static void createAcc() {
		System.out.println("신규 가입을 환영합니다.");
		System.out.println("이름을 입력해 주세요");
		String name = in.nextLine();
		System.out.println("계좌번호를 입력해 주세요");
		String acc = in.nextLine();
		System.out.println("초기 입금액을 입력해 주세요");
		int money = Integer.parseInt(in.nextLine());
		
		aList.add(new Account(name,acc,money));
		System.out.println("계좌 생성이 완료되었습니다.");
		
	}
	private static void programExit() {
		System.out.print("프로그램을 종료하시겠습니까? (Y/N) >>");
		String ans = in.nextLine();
		if(ans.equalsIgnoreCase("y")) {
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		}else if(ans.equalsIgnoreCase("n")){
			System.out.println("이전 메뉴로 돌아갑니다.");
		}else {
			selectError();
		}
		
		
	}
	private static void selectError() {
		System.out.println("잘못 입력하셨습니다.");
		System.out.println("확인 후 다시 입력해 주세요.");
		
	}

}
