package ch04;

public class Ex04_while {

	public static void main(String[] args) {
		// while 반복문 => 조건
		
		// "통행권 발급"을 출력하는 프로그램을 만들어 봅시다.
		// 10명만 입장 가능하도록 만들어 봅시다.
		
		String ticket = "통행권";
		int max = 10; // 최대 인원
		int countPeople = 0; // 입장 인원
		
		while (ticket.equals("통행권")) {
			System.out.println("입장하세요. ");
			countPeople++; //입장 후 입장 인원 1 증가
			if(countPeople==max) { // 입장 인원이 10명이 되면
				ticket = "발급 중지";
			}
		}
		
		System.out.println("편안한 관람 바랍니다~~~~");
		
		// do while
		ticket = "통행권";
		countPeople = 0;
		
		do {
			System.out.println("입장하세요. ");
			countPeople++; //입장 후 입장 인원 1 증가
			if(countPeople==max) { // 입장 인원이 10명이 되면
				ticket = "발급 중지";
			}
		} while (ticket.equals("통행권"));
		
		
		System.out.println("편안한 관람 바랍니다~~~~");
		
	}

}
