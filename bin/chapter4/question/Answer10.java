package chapter4.question;

import java.util.Scanner;

public class Answer10 {

	public static void main(String[] args) {
		// 로그인 문제
		Scanner s = new Scanner(System.in);
		
		// 이미 저장된 아이디와 비밀번호
		String storedId = "green";
		String storedPwd = "gr1234";
		
		System.out.println("그린 아카데미에 오신것을 환영합니다.");
		System.out.println("서비스를 이용하시려면 로그인을 하세요.");
		System.out.print("아이디>");
		String inputId = s.nextLine();
		
		if(inputId.equals(storedId)) {
			System.out.print("비밀번호>");
			String inputPwd = s.nextLine();
			
			if(storedPwd.equals(inputPwd)) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}else {
			System.out.println("그런 아이디 없습니다.");
		}
		
		
		
		
		
	}

}
