package ch11.answer;

import java.util.Scanner;

public class View {
	// 콘솔을 이용한 입출력을 담당하는 역할
	
	private static Scanner scan = new Scanner(System.in);

	public static int mainMenu() {
		System.out.println("*****************************************");
		System.out.println("블루 학사 정보 관리 시스템");
		System.out.println("메뉴를 선택해 주세요");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 프로그램 종료");
		System.out.print("선택 >> ");
		int selectNum = Integer.parseInt(scan.nextLine());
		
		return selectNum;
		
		
	}

	public static void selectError() {
		System.out.println("잘못 입력하셨습니다.");
		System.out.println("다시 확인해 주세요.");
		
	}

	public static boolean selectExit() {
		System.out.println("종료하시겠습니까? (Y/N) ");
		String selExit = scan.nextLine();
		if(selExit.equalsIgnoreCase("y")) {
			System.out.println("프로그램을 종료합니다.");
			return false;
		}else {
			return true;
		}
		
	}

	public static Member signUp() {
		// 회원가입
		Member member = null;
		System.out.println("회원가입을 환영합니다.");
		System.out.println("아이디를 입력해 주세요.");
		String memberId = scan.nextLine();
		System.out.println("비밀번호를 입력해 주세요.");
		String memberPw = scan.nextLine();
		System.out.println("이름을 입력해 주세요.");
		String membername = scan.nextLine();
		System.out.println("1. 선생 | 2. 학생");
		String position = scan.nextLine();
		
		if(position.equals("1")) {
			System.out.println("담당 과목을 입력하세요.");
			String subject = scan.nextLine();
			member = new Teacher(memberId,memberPw,membername,subject);
			
		}else if(position.equals("2")) {
			System.out.println("전공 과목을 입력하세요.");
			String major = scan.nextLine();
			member = new Student(memberId,memberPw,membername,major);
			
		}
		return member;
		
	}

	
	public static String[] signIn() {
		// 로그인
		String[] loginInfo = new String[2];
		System.out.println("로그인을 시작합니다.");
		
		System.out.println("아이디를 입력해 주세요.");
		loginInfo[0] = scan.nextLine();
		System.out.println("비밀번호를 입력해 주세요.");
		loginInfo[1] = scan.nextLine();
		
		return loginInfo;
		
		// 만약 아이디는 스트링 비밀번호가 인트라면
		// 두 개를 담을 수 있는 클래스를 만들어서 인스턴스
		
		
		
		
		
		
	}
	
	

	
	
	
	
	
	
	
	
}
