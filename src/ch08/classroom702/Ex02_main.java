package ch08.classroom702;

public class Ex02_main {

	public static void main(String[] args) {
		Account acc = new Account();
		
		acc.deposit(10000);
		acc.chkbalance();
//		acc.balance = 100000; // 객체가 독립적이어야 한다를 위반 -> Account 클래스의 balance에 접근제어자 private
		acc.withdraw(20000);
		acc.chkbalance();
	}

}
