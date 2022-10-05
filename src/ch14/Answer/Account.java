package ch14.Answer;

public class Account {
	
	private String name;
	private String acc;
	private int balance;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAcc() {
		return acc;
	}
	public void setAcc(String acc) {
		this.acc = acc;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Account(String name, String acc, int balance) {
		super();
		this.name = name;
		this.acc = acc;
		this.balance = balance;
	}
	
	public void deposit(int money) {
		this.balance+=money;
		System.out.println(money+"원 입금이 완료되었습니다");
	}
	
	
	public void withdraw(int money) {
		if(this.balance-money<0) {
			System.out.println("잔액이 부족합니다.");
		}else {
			this.balance-=money;
			System.out.println(money+"원 출금이 완료되었습니다.");
		}
	}
	
	public void checkBalance() {
		System.out.println(this.name+"님의 현재 잔액은 "+this.balance+"원입니다.");
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+this.acc+this.balance;
	}
	
	
	
	
	
}
