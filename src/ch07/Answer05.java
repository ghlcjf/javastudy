package ch07;

import java.util.Scanner;

public class Answer05 {
	
	static Scanner in = new Scanner(System.in);
	static Account[] accounts = new Account[100]; 
	// Account 인스턴스 100개를 저장할 수 있는 배열 (이름 계좌번호 등등 다양한 타입을 담을 수 있게)
	
	public static void main(String[] args) {
		// 메인
		
		
		for(;;) {
			System.out.println("그린뱅크에 오신 것을 환영합니다.");
			System.out.println("메뉴를 선택해 주세요.");
			System.out.println("1. 계좌 생성");
			System.out.println("2. 은행 업무");
			System.out.println("3. 종료");
			System.out.print(">> ");
			
			int selectMenu = Integer.parseInt(in.nextLine());
			
			
			if(selectMenu==1) {// 계좌 생성
				createAccount();
			}else if(selectMenu==2) {// 은행 업무를 위한 예금 조회
				accountCheck();
			}else if(selectMenu==3) {// 프로그램 종료
				programExit();
			}else {// 잘못 입력한 경우
				selectError();
			}
			
			
		}
		
	}

	private static void accountCheck() {
		// 은행 업무를 위한 메서드
		
			System.out.println("--------------------");
			System.out.println("계좌 번호를 입력하세요.");
			System.out.print(">> ");
			String accNum = in.nextLine();
			int accIndex = -1;
			for(int i=0;i<accounts.length;i++) {
				if(accounts[i] != null && accounts[i].accountNum.equals(accNum)) {
					accIndex = i;
				}
			}
			if(accIndex==-1) {
				System.out.println("계좌번호를 잘못 입력했거나 해당 계좌가 존재하지 않습니다.");
			}else {
				bankWork(accIndex);
			}
		
	}

	private static void bankWork(int accIndex) {
		boolean run = true;
		int money;
		while(run) {
			System.out.println("--------------------");
			System.out.println(accounts[accIndex].holder+"님 환영합니다.");
			System.out.println("메뉴를 선택해 주세요");
			System.out.println("1. 잔액조회");
			System.out.println("2. 입금");
			System.out.println("3. 출금");
			System.out.println("4. 이전 메뉴");
			System.out.print("선택 >> ");
			int selectNum = Integer.parseInt(in.nextLine());
			
			switch(selectNum) {
			case 1:// 잔액 조회 기능
				accounts[accIndex].chkbalance();
				break;
			case 2:// 입금
				System.out.println("--------------------");
				System.out.println("입금할 금액을 입력하세요.");
				System.out.print("입금액 >> ");
				money = Integer.parseInt(in.nextLine());
				accounts[accIndex].deposit(money);
				break;
			case 3:// 출금
				System.out.println("--------------------");
				System.out.println("출금할 금액을 입력하세요.");
				System.out.print("출금액 >> ");
				money = Integer.parseInt(in.nextLine());
				accounts[accIndex].withdraw(money);
				break;
			case 4:// 이전 메뉴 돌아가기
				System.out.println("--------------------");
				System.out.println("이전 메뉴로 돌아갑니다.");
				run = false;
				break;
			default:
				selectError();
			}
		}
		
	}

	private static void createAccount() {
		// 계좌 생성
		System.out.println("--------------------");
		System.out.println("계좌를 생성합니다.");
		System.out.println("필요한 항목을 입력해 주세요.");
		System.out.print("예금주 이름 : ");
		String name = in.nextLine();
		System.out.print("계좌 번호 : ");
		String accNum = in.nextLine();
		System.out.print("초기 입금액 : ");
		int money = Integer.parseInt(in.nextLine());
		
		Account acc = new Account(name,accNum,money);
		for(int i=0;i<accounts.length;i++) {
			if(accounts[i]==null) {
				accounts[i] = acc;
				System.out.println("계좌 생성 완료");
				System.out.println("--------------------");
				System.out.println();
				break;
			}
		}
	}

	private static void programExit() {
		System.out.println("--------------------");
		System.out.println("프로그램을 종료하시겠습니까?(Y/N)");
		String answer = in.nextLine();
		if(answer.equalsIgnoreCase("Y")) { // (answer.equals("y") || answer.equals("Y"))
			System.out.println("프로그램을 종료합니다.");
			System.out.println("--------------------");
			System.exit(0);
		}else {
			System.out.println("이전 메뉴로 돌아갑니다.");
			System.out.println("--------------------");
		}
		
		
	}

	private static void selectError() {
		System.out.println("--------------------");
		System.out.println("잘못 입력하셨습니다.\n다시 입력해 주세요.");
		System.out.println("--------------------");
		
	}
	
	
}
