package ch07.question;

public class Account {
	
	//필드
	private String holder;
	private String account;
	private int balance;
	
	
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
	
	
	public void deposit(int money) {
		this.balance += money;
		System.out.println("입금이 완료되었습니다.");
	}
	
	public void withdraw(int money) {
		if(this.balance-money<0) {
			System.out.println("잔액이 부족합니다");
		}else {
			this.balance -= money;
			System.out.println(money+"원이 출금되었습니다.");
		}
	}
	
	public void chkBalance() {
		System.out.println("현재 잔액은 "+this.balance+"원입니다.");
	}
	
	
	Account(){}
	public Account(String holder, String account, int balance) {
		this.holder = holder;
		this.account = account;
		this.balance = balance;
	}
	
	
	
	
}
