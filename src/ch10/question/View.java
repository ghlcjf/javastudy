package ch10.question;

import java.util.Scanner;

public class View {

	private static Scanner in = new Scanner(System.in);
	public static int mainMenu() {
		// 메인 메뉴 메서드
		System.out.println("---------------------------");
		System.out.println("원하시는 메뉴를 선택해 주세요");
		System.out.println("1. 회원 가입");
		System.out.println("2. 로그인");
		System.out.println("3. 프로그램 종료");
		System.out.print("선택 >> ");
		int select = Integer.parseInt(in.nextLine());
		
		return select;
	}
	public static void selectError() {
		// 잘못입력 메서드
		System.out.println("잘못 입력하셨습니다.");
		System.out.println("확인 후 다시 선택해 주세요.");
		
	}
	public static boolean programExit() {
		System.out.println("프로그램을 종료하시겠습니까? (Y/N)");
		String ans = in.nextLine();
		if(ans.equalsIgnoreCase("y")) {
			System.out.println("프로그램을 종료합니다.");
			return true;
		}else {
			return false;
		}
		
		
	}
	public static Member signUp() {
		// 회원가입
		Member member = null;
		System.out.println("회원가입을 환영합니다.");
		System.out.println("아이디를 입력해 주세요");
		String userId = in.nextLine();
		System.out.println("비밀번호를 입력해 주세요");
		String userPw = in.nextLine();
		System.out.println("이름을 입력해 주세요");
		String userName = in.nextLine();
		
		System.out.println("1. 선생 | 2. 학생");
		System.out.print("직업을 선택해 주세요. >> ");
		String seljob = in.nextLine();
		
		if(seljob.equals("1")||seljob.equals("선생")) {
			System.out.println("과목을 입력해 주세요");
			String subject = in.nextLine();
			member = new Teacher (userId,userPw,userName,subject);
			
			// Teacher과 Student 클래스 모두를 포함할 수 있는
			// Member 클래스 타입 변수 준비 후
			// member 변수에 Teacher 인스턴스 생성 후 저장.
		}else if(seljob.equals("2")||seljob.equals("학생")) {
			System.out.println("전공을 입력해 주세요");
			String major = in.nextLine();
			member = new Student(userId,userPw,userName,major);
			
			// Teacher과 Student 클래스 모두를 포함할 수 있는
			// Member 클래스 타입 변수 준비 후
			// member 변수에 Student 인스턴스 생성 후 저장.
		}
		return member;
	}
	public static String[] signIn() {
		// 로그인 메뉴
		String[] str = new String[2];
		System.out.println("아이디를 입력해 주세요");
		str[0] = in.nextLine();
		System.out.println("비밀번호를 입력해 주세요");
		str[1] = in.nextLine();
		
		return str;
		
	}

}
