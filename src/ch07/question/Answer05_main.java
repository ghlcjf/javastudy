package ch07.question;

import java.util.Scanner;

public class Answer05_main {

	static Scanner in = new Scanner(System.in);
	static Account[] accounts = new Account[100];
	// 100명분의 계좌 저장 정보 Account class 배열
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("은행에 오신 것을 환영합니다.");
			System.out.println("1. 계좌 생성");
			System.out.println("2. 은행 업무");
			System.out.println("3. 종료");
			System.out.println("원하시는 메뉴의 번호를 입력해 주세요");
			System.out.print(">> ");
			int selNum = Integer.parseInt(in.nextLine());
			
			
			
			switch(selNum) {
			case 1:
				accountcreate();
				break;
			case 2:
				accountCheck();
				break;
			case 3:
				programExit();
				break;
			default:
				selectError();
				break;
			}
			
			
			
			
			
			
			
			
			
		}

	}
	private static void accountCheck() {
		System.out.println("회원님의 계좌번호를 입력해 주세요.");
		System.out.print(">> ");
		String accNum = in.nextLine();
		int accIndex = -1;
		
		
		for(int i=0;i<accounts.length;i++) {
			if(accounts[i]!=null && accounts[i].getAccount().equals(accNum)) {
				accIndex = i;
			}
		}
		if(accIndex==-1) {
			System.out.println("입력한 계좌번호와 일치하는 계좌가 없습니다.");
			System.out.println("확인 후 다시 시도해주세요.");
		}else {
			bankwork(accIndex);
		}
		
	}
	private static void bankwork(int accIndex) {
		System.out.println(accounts[accIndex].getHolder()+"님 환영합니다.");
		boolean run = true;
		int money;
		while(run) {
			System.out.println("1.입금");
			System.out.println("2.출금");
			System.out.println("3.잔액 조회");
			System.out.println("4.종료");
			System.out.print("원하시는 메뉴의 번호를 입력해 주세요 >> ");
			int menuNum = Integer.parseInt(in.nextLine());
			
			switch(menuNum) {
			case 1:
				System.out.println("입금하실 금액을 입력해 주세요.");
				money = Integer.parseInt(in.nextLine());
				accounts[accIndex].deposit(money);
				break;
			case 2:
				System.out.println("출금하실 금액을 입력해 주세요.");
				money = Integer.parseInt(in.nextLine());
				accounts[accIndex].withdraw(money);
				break;
			case 3:
				accounts[accIndex].chkBalance();
				break;
			case 4:
				System.out.println("이전 메뉴로 돌아갑니다.");
				run = false;
				break;
			default:
				selectError();
			}
		}
		
		
	}
	private static void accountcreate() {
		System.out.println("신규 가입을 환영합니다.");
		System.out.print("회원님의 이름을 입력해 주세요 >> ");
		String name = in.nextLine();
		System.out.print("회원님의 계좌번호를 입력해 주세요 >> ");
		String accNum = in.nextLine();
		System.out.print("회원님의 초기 입금액을 입력해 주세요 >> ");
		int money = Integer.parseInt(in.nextLine());
		
		Account acc = new Account(name,accNum,money);
		for(int i=0;i<accounts.length;i++) {
			if(accounts[i]==null) {
				accounts[i] = acc;
				System.out.println("신규 가입이 완료되었습니다.");
				break;
			}
		}
		
	}
	private static void programExit() {
		System.out.println("프로그램을 종료하시겠습니까?");
		System.out.print("Y/N >>");
		String ans = in.nextLine();
		
		if(ans.equalsIgnoreCase("Y")){
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		}else if(ans.equals("n")||ans.equals("N")) {
			System.out.println("이전 메뉴로 돌아갑니다.");
		}else {
			System.out.println("잘못 입력하셨습니다.\n이전 메뉴로 돌아갑니다.");
		}
		
	}
	private static void selectError() {
		System.out.println("번호 좀 똑바로 입력해라");
		
	}

}
