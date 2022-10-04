package ch07.question_02;

import java.util.Scanner;

public class View {
	private static Scanner in = new Scanner(System.in);
	
	public static int mainMenu() {
		// TODO Auto-generated method stub
		System.out.println("원하시는 메뉴를 선택해 주세요.");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 종료");
		System.out.print("선택 >> ");
		int select = Integer.parseInt(in.nextLine());
		
		return select;
	}

	public static void selectError() {
		System.out.println("잘못 입력하셨습니다.");
		System.out.println("다시 입력해주세요");
	}

	public static boolean programExit() {
		System.out.println("프로그램을 종료하시겠습니까? (Y/N)");
		String answer = in.nextLine(); 
		if(answer.equalsIgnoreCase("y")) {
			return true;
		}else {
			return false;
		}
		
	}

}
