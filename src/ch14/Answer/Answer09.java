package ch14.Answer;

import java.util.ArrayList;
import java.util.Scanner;

public class Answer09 {
	
	static Scanner in = new Scanner(System.in);
	static ArrayList<Member> mList = new ArrayList<>();
	static ArrayList<Board> bList = new ArrayList<>();
	static int indexNum = -1;
	public static void main(String[] args) {


		while(true) {
			if(indexNum==-1) {
				main1();
			}else {
				main2(indexNum);
			}
		}

	}
	private static void main2(int indexNum2) {
		// 로그인 후 메인화면
		System.out.println(mList.get(indexNum2).getUserName()+"님 원하시는 메뉴를 선택해 주세요.");
		System.out.println("1. 글 목록 보기");
		System.out.println("2. 글 작성하기");
		System.out.println("3. 자기 글 보기");
		System.out.println("4. 로그아웃");
		System.out.println("5. 프로그램 종료");
		System.out.print("선택 >> ");
		int selNum = Integer.parseInt(in.nextLine());
		
		switch(selNum) {
		case 1:
			readBoard();
			break;
		case 2:
			write();
			break;
		case 3:
			myBoard();
			break;
		case 4:
			logout();
			break;
		case 5:
			programExit();
			break;
		default:
			selectError();
		}
		
	}
	
	
	private static void myBoard() {
		System.out.println("---나의 글 목록 보기---");
		boolean check = false;
		for(int i=0;i<bList.size();i++) {
			if(bList.get(i).getIndexNum()==indexNum) {
				System.out.println((i+1)+". "+bList.get(i).getTitle());
				check = true;
			}
		}
		if(check==false) {
			System.out.println("작성한 글이 없습니다.");
		}else {
			System.out.print("수정이나 삭제하실 글이 있습니까? (Y/N) >> ");
			String ans = in.nextLine();
			
			if(ans.equalsIgnoreCase("y")) {
				System.out.println("수정이나 삭제하실 글의 번호를 입력해 주십시오");
				int selNum = Integer.parseInt(in.nextLine());
				modify(selNum-1);
			}else if(ans.equalsIgnoreCase("n")) {
				System.out.println("이전 메뉴로 돌아갑니다.");
			}else {
				selectError();
			}
			
		}
		
	}
	private static void modify(int i) {
		// 수정 삭제
		
		
		System.out.println("1. 수정 | 2. 삭제 ");
		System.out.print("원하시는 작업을 입력해 주세요");
		int selNum = Integer.parseInt(in.nextLine());
		
		switch(selNum) {
		case 1:
			System.out.println(bList.get(i).getTitle()+"의 글 내용을 수정합니다.");
			System.out.print("내용 : >> ");
			String content = in.nextLine();
			bList.get(i).setContent(content);
			System.out.println("수정이 완료되었습니다.");
			break;
		case 2:
			System.out.println(bList.get(i).getTitle()+"의 글을 삭제합니다.");
			bList.remove(i);
			break;
		default:
			selectError();
		}
		
	}
	private static void write() {
		// 글 작성 제목 작성자 내용 비밀번호
		System.out.println("---글 작성하기---");
		System.out.println("제목을 입력해 주세요");
		String title = in.nextLine();
		System.out.println("작성자를 입력해 주세요");
		String writer = in.nextLine();
		System.out.println("내용을 입력해 주세요");
		String content = in.nextLine();
		System.out.println("비밀번호를 입력해 주세요");
		String password = in.nextLine();
		bList.add(new Board(title,writer,content,password,indexNum));
		System.out.println("게시글 작성이 완료됐습니다.");
	}
	
	
	
	private static void logout() {
		System.out.print("로그아웃 하시겠습니까? (Y/N) >> ");
		String ans = in.nextLine();
		
		if(ans.equalsIgnoreCase("y")) {
			System.out.println("로그아웃되었습니다.");
			indexNum = -1;
		}else if(ans.equalsIgnoreCase("n")) {
			System.out.println("이전 메뉴로 돌아갑니다.");
		}else {
			selectError();
		}
		
	}
	
	
	private static void main1() {
		// 로그인 전 메인화면
		System.out.println("-----게시판-----");
		System.out.println("원하시는 메뉴를 선택해 주세요.");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 게시글 보기");
		System.out.println("4. 프로그램 종료");
		System.out.print("선택 >> ");
		int selNum = Integer.parseInt(in.nextLine());
		
		switch(selNum) {
		case 1:
			signUp();
			break;
		case 2:
			signIn();
			break;
		case 3:
			readBoard();
			break;
		case 4:
			programExit();
			break;
		default:
			selectError();
		}
		
		
	}
	
	
	private static void signIn() {
		System.out.println("---로그인---");
		System.out.println("아이디를 입력해 주세요");
		String id = in.nextLine();
		System.out.println("비밀번호를 입력해주세요.");
		String pw = in.nextLine();
		boolean check = false;
		for(int i=0;i<mList.size();i++) {
			if(mList.get(i).getUserId().equals(id) && mList.get(i).getUserPw().equals(pw)) {
				System.out.println(mList.get(i).getUserName()+"님 환영합니다.");
				indexNum=i;
				check=true;
				break;
			}
		}
		if(check==false) {
			System.out.println("아이디와 비밀번호를 확인할 수 없습니다.");
			System.out.println("확인 후 다시 시도해주세요.");
		}
	}
	
	
	private static void signUp() {
		System.out.println("회원가입을 시작합니다.");
		System.out.print("아이디를 입력해 주세요 >> ");
		String id = in.nextLine();
		for(int i=0;i<mList.size();i++) {
			if(mList.get(i).getUserId().equals(id)) {
				System.out.println("중복된 아이디가 존재합니다\n다시 입력해 주세요");
				id = in.nextLine();
				i=-1;
			}
		}
		System.out.print("비밀번호를 입력해 주세요 >> ");
		String pw = in.nextLine();
		System.out.print("이름을 입력해 주세요 >> ");
		String name = in.nextLine();
		System.out.print("전화번호를 입력해 주세요 >> ");
		String phone = in.nextLine();
		
		mList.add(new Member(id,pw,name,phone));
		System.out.println("회원가입이 완료되었습니다.");
		
	}
	
	
	private static void readBoard() {
		if(bList.size()==0) {
			System.out.println("---작성한 게시글이 없습니다---");
		}else {
			System.out.println("---게시글 보기---");
			for(int i=0;i<bList.size();i++) {
				System.out.println((i+1)+". "+bList.get(i).getTitle());
			}
			System.out.println("열람하실 게시글 번호를 입력해 주세요.");
			int select = Integer.parseInt(in.nextLine());
			if(select-1<bList.size()) {
				bList.get(select-1).prt();
			}else {
				selectError();
			}
			
		}
		
	}
	
	
	private static void programExit() {
		System.out.println("프로그램을 종료하시겠습니까? (Y/N) >> ");
		String ans = in.nextLine();
		if(ans.equalsIgnoreCase("y")) {
			System.out.println("프로그램을 종료하겠습니다.");
			System.exit(0);
		}else if(ans.equalsIgnoreCase("n")) {
			System.out.println("이전 메뉴로 돌아갑니다.");
			return;
		}else {
			selectError();
		}
		
	}
	
	private static void selectError() {
		System.out.println("잘못 입력하셨습니다");
		System.out.println("확인 후 다시 시도해주세요");
		
	}

}
