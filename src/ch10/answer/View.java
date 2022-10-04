package ch10.answer;

import java.util.Scanner;

public class View {
	private static Scanner in = new Scanner(System.in);
	
	public static int selectNum() {
		 System.out.println("원하시는 메뉴를 선택해 주세요.");
		 System.out.println("1. 회원가입");
		 System.out.println("2. 로그인");
		 System.out.println("3. 프로그램 종료");
		 System.out.print("선택 >> ");
		 int num = Integer.parseInt(in.nextLine());
		return num;
	}

	public static void selectError() {
		System.out.println("잘못 선택함");
		System.out.println("확인 후 다시 시도해 주세요");
		
	}

	public static void programExit() {
		System.out.print("프로그램을 종료하시겠습니까? (Y/N)");
		String ans = in.nextLine();
		
		if(ans.equalsIgnoreCase("y")) {
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		}else {
			System.out.println("이전 메뉴로 돌아갑니다.");
		}
	}

	public static Member signUp() {
		Member member = null;
		System.out.println("회원가입을 환영합니다.");
		System.out.println("이름을 입력해 주세요");
		String name = in.nextLine();
		System.out.println("아이디를 입력해 주세요");
		String id = in.nextLine();
		System.out.println("비밀번호 입력해 주세요");
		String pw = in.nextLine();
		
		System.out.println("직업을 선택해 주세요");
		System.out.println("1. 선생|2. 학생");
		String job = in.nextLine();
		
		if(job.equals("1")) {// 선생
			System.out.println("담당 과목을 입력해 주세요");
			String sub = in.nextLine();
			member = new Teacher(name,id,pw,sub);
			return member;
		}else if(job.equals("2")) {// 학생
			System.out.println("전공 과목을 입력해 주세요");
			String major = in.nextLine();
			member = new Student(name,id,pw,major);
			return member;
		}
		
		
		return member;
		
		
		
		
		
		
	}

	public static String[] signIn() {
		// 회원가입
		String[] check = new String[2];
		System.out.println("아이디를 입력해 주세요");
		check[0] = in.nextLine();
		System.out.println("비밀번호를 입력해 주세요");
		check[1] = in.nextLine();
		
		return check;
		
	}

}
