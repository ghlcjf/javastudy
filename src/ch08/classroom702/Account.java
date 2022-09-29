package ch08.classroom702;

public class Account {

	public String holder;
	String accountNum; // 접근제어자 기본값은 default
	private int balance = 0;
	
	Account(){}
	
	public Account(String holder, String accountNum, int balance) {
		this.holder = holder;
		this.accountNum = accountNum;
		this.balance = balance;
	}

	public void deposit(int money) { // 입금 기능
		this.balance +=money;
		System.out.println("입금이 완료되었습니다.");
	}
	
	public void withdraw(int money) { // 출금 기능
		if(this.balance-money<0) {
			System.out.println("잔액이 부족합니다.");
		}else {
			balance -= money;
			System.out.println("출금이 완료되었습니다.");
		}
	}
	
	public void chkbalance() { // 잔액 조회
		System.out.println("--------------------");
		System.out.println("잔액을 조회합니다.");
		System.out.println("잔액 : "+this.balance+"원");
		System.out.println("--------------------");
	}
	
}
