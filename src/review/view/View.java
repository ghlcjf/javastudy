package review.view;

import java.util.Scanner;

import review.dto.Member;

public class View {
	static Scanner in = new Scanner(System.in);
	
	public static int menu() {
		// 비회원 메인 메뉴
		System.out.println("홈페이지 방문을 환영합니다.");
		System.out.println("원하시는 메뉴를 선택해 주세요.");
		System.out.println("1. 회원가입 | 2. 로그인 | 3. 글 목록 보기 | 4. 프로그램 종료");
		
		int selNum = Integer.parseInt(in.nextLine());
		
		return selNum;
	}

	public static void selectError() {
		System.out.println("잘못 입력하셨습니다.");
		System.out.println("확인 후 다시 시도해 주세요.");
		
	}

	public static void programExit() {
		System.out.println("프로그램을 종료하시겠습니까?(Y/N)");
		String ans = in.nextLine();
		if(ans.equalsIgnoreCase("Y")) {
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		}else if(ans.equalsIgnoreCase("N")) {
			back();
		}else {
			selectError();
		}
		
	}

	public static void empty() {

		System.out.println("게시글이 없습니다.");
		System.out.println("게시글 작성을 한 뒤에 시도해 주세요.");
	}

	public static Member signUp() {
		System.out.println("이름을 입력해 주세요");
		String name = in.nextLine();
		System.out.println("아이디를 입력해 주세요");
		String id = in.nextLine();
		System.out.println("비밀번호를 입력해 주세요");
		String pw = in.nextLine();
		
		return new review.dto.Member(name, id, pw);
	}

	public static void hello() {
		// TODO Auto-generated method stub
		System.out.println("회원가입을 환영합니다^^");
	}

	public static int readBoard() {
		for(int i=0;i<review.dao.Dao.bl.size();i++) {
			System.out.println("-----------------");
			System.out.println("제목 : "+review.dao.Dao.bl.get(i).getTitle());
			System.out.println("작성자 : "+review.dao.Dao.bl.get(i).getWriter());
			System.out.println("-----------------");
		}
		System.out.println("상세 보기를 원하면 글 번호를 원하지 않으면 0을 입력해 주세요.");
		int num = Integer.parseInt(in.nextLine())-1;
		return num;
	}

	public static void back() {
		// TODO Auto-generated method stub
		System.out.println("이전 화면으로 돌아갑니다.");
	}

	public static void prt(int num) {
		review.dao.Dao.bl.get(num).prt();
		
	}

	public static String[] signIn() {
		
		System.out.println("아이디를 입력해 주세요");
		String id = in.nextLine();
		System.out.println("비밀번호를 입력해 주세요");
		String pw = in.nextLine();
		return new String[] {id,pw};
		
	}

	public static void overlap() {
		// TODO Auto-generated method stub
		System.out.println("중복된 아이디가 있거나 잘못 입력하셨습니다.");
		System.out.println("다시 시도해 주세요.");
	}
//-[로그인]----------------------------------------------------------
	public static int loginMenu(Member m) {
		System.out.println(m.getName()+"님 환영합니다.");
		System.out.println("1. 글 목록 보기 | 2. 글 작성하기 | 3. 로그아웃");
		System.out.println("원하시는 메뉴를 선택해 주세요.");
		int selNum = Integer.parseInt(in.nextLine());
		return selNum;
	}

}
