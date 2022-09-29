package ch07.question_02;

public class Account {
	private String holder;
	private String account;
	private int balance;
	public Account(String holder, String account, int balance) {
		this.holder = holder;
		this.account = account;
		this.balance = balance;
		
	}
	
	
	public void deposit(int money) {
		this.balance+=money;
		System.out.println("입금이 완료되었습니다.");
	}
	
	public void withdraw(int money) {
		if(balance-money<0) {
			System.out.println("잔액이 부족합니다.");
			System.out.println("확인 후 다시 시도해 주세요");
		}else {
			this.balance-=money;
			System.out.println("출금이 완료되었습니다.");
		}
	}
	
	public void chkbalance() {
		System.out.println("현재 잔액은 "+this.balance+"원입니다.");
		
	}


	public String getHolder() {
		return holder;
	}


	public void setHolder(String holder) {
		this.holder = holder;
	}


	public String getAccount() {
		return account;
	}


	public void setAccount(String account) {
		this.account = account;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
