package ch11;

import java.util.Scanner;

public class Re04_main {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		
//		try {
//			method1();
//		}catch(ReException e) {
//			String msg = e.getMessage();
//			System.out.println(msg);
//		}
//		
		
		
		
		while(true) {
			
			try {
				method1();
			}catch(ReException e) {
				String msg = e.getMessage();
				System.out.println(msg);
			}
		
		}
	
			
		
		
		
		
		
		
		
	}
	
	private static void method1() throws ReException{
		
		int balance = 1000;
		int money;
		System.out.println("잔액 : "+balance);
		System.out.println("얼마 출금?");
		money = Integer.parseInt(in.nextLine());
		if(balance-money<0) {
			throw new ReException("잔액이 부족합니다.");
		}else {
			balance-=money;
			System.out.println("출금 완료 잔액 : "+balance);
		}
	}
	
	
}
