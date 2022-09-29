package ch07.question_02;

import java.util.Scanner;

public class Answer05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Answer05();
	}
	private Scanner in;
	static Account[] accounts = new Account[100];
	Answer05(){
		in = new Scanner(System.in);
		init();
	}

	private void init() {
		// TODO Auto-generated method stub
		
		while(true) {
			System.out.println("원하시는 메뉴를 선택해 주세요.");
			System.out.println("1. 계좌 생성");
			System.out.println("2. 은행 업무");
			System.out.println("3. 종료");
			System.out.print("선택 >> ");
			int select = Integer.parseInt(in.nextLine());
			
			switch(select) {
			case 1:// 계좌 생성
				createAccount();
				break;
			case 2:// 은행 업무
				chkacc();
				break;
			case 3:// 종료
				programExit();
				break;
			default:// 잘못 입력
				selectError();
			}
			
			
		}
		
	}

	private void chkacc() {
		// TODO Auto-generated method stub
		int accIndex = -1;
		System.out.println("계좌 번호를 입력해 주세요");
		String account = in.nextLine();
		
		for(int i=0;i<accounts.length;i++) {//null 비교 조건 넣기
			if(accounts[i]!=null && account.equals(accounts[i].getAccount())) {
				accIndex=i;
				break;// 반복이 끝나기 전에 찾으면 break;
			}
		}
		
		if(accIndex==-1) {
			System.out.println("입력하신 계좌를 찾을 수 없습니다.");
			return;
		}else {
			bankWork(accIndex);//매개변수?넣어주기
		}
	}

	private void bankWork(int accIndex) { // 받는 메서드에도 기입하기
		// TODO Auto-generated method stub
		bank:while(true) {
			int money;
			System.out.println("원하시는 메뉴를 선택해 주세요.");
			System.out.println("1. 입금");
			System.out.println("2. 출금");
			System.out.println("3. 잔액조회");
			System.out.println("4. 종료");
			int select = Integer.parseInt(in.nextLine());
			
			switch(select) {
			case 1:
				System.out.println("입금하실 금액을 입력해 주세요");
				System.out.print(">> ");
				money = Integer.parseInt(in.nextLine());
				accounts[accIndex].deposit(money);// 그래야 사용 가능
				// 다른 클래스의 메서드 호출은 클래스.메서드
				break;
			case 2:
				System.out.println("출금하실 금액을 입력해 주세요");
				System.out.print(">> ");
				money = Integer.parseInt(in.nextLine());
				accounts[accIndex].withdraw(money);
				break;
			case 3:
				accounts[accIndex].chkbalance();
				break;
			case 4:
				System.out.println("이전 메뉴로 돌아갑니다.");
				break bank;
			default:
			}
		}
	}

	private void createAccount() {
		// TODO Auto-generated method stub
		System.out.println("신규 가입을 환영합니다.");
		System.out.println("고객님의 이름을 입력해 주세요");
		String name = in.nextLine();
		System.out.println("고객님의 계좌 번호를 입력해 주세요");
		String account = in.nextLine();
		System.out.println("고객님의 초기 입금액을 입력해 주세요");
		int money = Integer.parseInt(in.nextLine());
		
		Account acc = new Account(name,account,money);
		
		for(int i=0;i<accounts.length;i++) {
			if(accounts[i]==null) {
				accounts[i]=acc;
				System.out.println("가입이 완료되었습니다.");
				break;
			}
		}
		
	}

	private void programExit() {
		// TODO Auto-generated method stub
		System.out.print("프로그램을 종료하시겠습니까? (Y/N) >> ");
		if(in.nextLine().equalsIgnoreCase("y")) {
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		}else {
			System.out.println("이전 메뉴로 돌아갑니다.");
		}
	}

	private void selectError() {
		// TODO Auto-generated method stub
		System.out.println("번호 확인 후 다시 입력");
		
	}
}
