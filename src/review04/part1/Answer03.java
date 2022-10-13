package review04.part1;

import java.util.Scanner;

public class Answer03 {
	public static void main(String[] args) {
		// 저장된 아이디와 비밀번호를 가지고 로그인 기능을 구현해 보자
		Scanner in = new Scanner(System.in);
		
		String userId = "green";
		String userPw = "gr1234";
		
		System.out.println("아이디를 입력해 주세요");
		String id = in.nextLine();
		System.out.println("비밀번호를 입력해 주세요");
		String pw = in.nextLine();
		
		
		if(userId.equals(id)&&userPw.equals(pw)) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
		
		
	}
}
