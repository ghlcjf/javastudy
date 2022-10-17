package review;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex05_3_Review {
	static Scanner in = new Scanner(System.in);
	static List<Member> ml = new ArrayList<>();
	static List<Board> bl = new ArrayList<>();
	static int login = -999;
	public static void main(String[] args) {
		// 로그인 프로그램과 게시판 프로그램 합치기
		// 로그인한 사람만 글 작성 가능
		// 로그인을 안 한 사람은 글 목록 보기와 게시글 상세 보기까지만
		// 로그인한 사람이 게시글 상세 보기를 했을 때 자기 글의 경우 글 수정, 삭제가 가능하다.
		// 로그인을 해도 다른 사람의 글은 상세 보기만 가능
		// 로그인한 사람 프로그램 종료 전 로그아웃을 해야한다
		
		
		while(true) {
			if(login==-999) {
				home();
			}else {
				menu();
			}
				
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	private static void menu() {
		// 로그인 O 기본 메뉴
		System.out.println("원하시는 메뉴를 선택해 주세요");
		System.out.println("1. 글 작성 | 2. 글 목록 보기 | 3. 로그아웃 | 4. 종료");
		int selNum = Integer.parseInt(in.nextLine());
		
		switch(selNum) {
		case 1:
			write();
			break;
		case 2:
			if(bl.isEmpty()) {
				System.out.println("게시글이 없습니다.");
			}else {
				readBoard();
			}
			
			break;
		case 3:
			signOut();
			break;
		case 4:
			loginExit();
			break;
		default:
			selectError();
			
		}
		
	}
	private static void write() {
		// TODO Auto-generated method stub
		System.out.println("글 작성하기");
		System.out.println("글 제목을 입력해 주세요");
		String title = in.nextLine();
		
		System.out.println("글 내용을 입력해 주세요");
		String content = in.nextLine();
		
		
		bl.add(new Board(title,ml.get(login).getName(),content,login));
		System.out.println("게시글 등록이 완료되었습니다.");
	}
	private static void signOut() {
		// TODO Auto-generated method stub
		System.out.println("로그아웃 하시겠습니까? (Y/N)");
		String ans = in.nextLine();
		if(ans.equalsIgnoreCase("Y")) {
			login=-999;
			System.out.println("로그아웃 되었습니다.");
		}else if(ans.equalsIgnoreCase("N")) {
			System.out.println("이전 메뉴로 돌아갑니다.");
		}else {
			selectError();
		}
	}
	private static void loginExit() {
		// 로그아웃 후 프로그램 종료
		System.out.println("프로그램을 종료하시겠습니까? (Y/N)");
		String ans = in.nextLine();
		
		if(ans.equalsIgnoreCase("Y")) {
			System.out.println("로그아웃 후 프로그램을 종료할 수 있습니다.");
			System.out.println("로그아웃 하시겠습니까? (Y/N)");
			ans = in.nextLine();
			if(ans.equalsIgnoreCase("Y")) {
				login=-999;
				System.out.println("로그아웃 되었습니다.");
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}else if(ans.equalsIgnoreCase("N")) {
				System.out.println("이전 메뉴로 돌아갑니다.");
			}else {
				selectError();
			}
		}else if(ans.equalsIgnoreCase("N")) {
			System.out.println("이전 메뉴로 돌아갑니다.");
		}else {
			selectError();
		}
	}
	private static void home() {
		// 로그인 X 기본 메뉴
		System.out.println("원하시는 메뉴를 선택해 주세요");
		System.out.println("1. 회원가입 | 2. 로그인 | 3. 글 목록보기 | 4. 종료");
		int selNum = Integer.parseInt(in.nextLine());
		
		switch(selNum) {
		case 1:
			signUp();
			break;
		case 2:
			signIn();
			break;
		case 3:
			if(bl.isEmpty()) {
				System.out.println("게시글이 없습니다.");
			}else {
				readBoard();
			}
			
			break;
		case 4:
			programExit();
			break;
		default:
			selectError();
		}
		
	}

	private static void readBoard() {
		// 게시글 상세보기
		if(login==-999) {
			System.out.println("-----게시글 목록-----");
			for(int i=0;i<bl.size();i++) {
				System.out.println((i+1)+". "+bl.get(i).getTitle()+"| 작성자 : "+bl.get(i).getWriter());
				
			}
			System.out.println("상세보기를 원하면 글 번호를, 아니면 0을 입력해 주세요");
			int num = Integer.parseInt(in.nextLine())-1;
			if(0<=num&&num<bl.size()) {
				bl.get(num).prt();
			}else if(num==-1) {
				System.out.println("이전 메뉴로 돌아갑니다.");
			}else {
				selectError();
			}
		}else {
			System.out.println("-----게시글 목록-----");
			for(int i=0;i<bl.size();i++) {
				System.out.println((i+1)+". "+bl.get(i).getTitle()+"| 작성자 : "+bl.get(i).getWriter());
				
			}
			System.out.println("상세보기를 원하면 글 번호를, 아니면 0을 입력해 주세요");
			int num = Integer.parseInt(in.nextLine())-1;
			if(0<=num&&num<bl.size()) {
				if(bl.get(num).getWriteNum()==login) {
					bl.get(num).prt();
					System.out.println("수정이나 삭제하시겠습니까?(Y/N)");
					//여기부터 다시
					String ans = in.nextLine();
					if(ans.equalsIgnoreCase("Y")) {
						System.out.println("1. 수정 | 2. 삭제 | 3. 이전 메뉴");
						int selNum = Integer.parseInt(in.nextLine());
						
						switch(selNum) {
						case 1:
							modify(num);
							break;
						case 2:
							delete(num);
							break;
						case 3:
							System.out.println("이전 메뉴로 돌아갑니다.");
							break;
						default:
							selectError();
						}
					}else if(ans.equalsIgnoreCase("N")) {
						System.out.println("이전 메뉴로 돌아갑니다.");
					}else {
						selectError();
					}
					
				}else {
					bl.get(num).prt();
				}
				
			}else if(num==-1) {
				System.out.println("이전 메뉴로 돌아갑니다.");
			}else {
				selectError();
			}
			
		}
		
		
		
	}
	
	private static void delete(int num) {
		// 삭제
		System.out.println("정말 삭제하시겠습니까?(Y/N)");
		String ans = in.nextLine();
		if(ans.equalsIgnoreCase("Y")) {
			bl.remove(num);
			System.out.println("삭제가 완료되었습니다.");
		}else if(ans.equalsIgnoreCase("N")) {
			System.out.println("이전 메뉴로 돌아갑니다.");
		}else {
			selectError();
		}
	}
	private static void modify(int num) {
		// 수정
		System.out.println("수정하실 글 내용을 입력해 주세요.");
		String content = in.nextLine();
		bl.get(num).setContent(content);
		System.out.println("글 수정이 완료되었습니다.");
		bl.get(num).prt();
		
	}
	private static void signIn() {
		// 로그인
		System.out.println("아이디를 입력해 주세요");
		String id = in.nextLine();
		System.out.println("비밀번호를 입력해 주세요");
		String pw = in.nextLine();
		int flag = -999;
		for(int i=0;i<ml.size();i++) {
			if(ml.get(i).getUserId().equals(id)&&
					ml.get(i).getUserPw().equals(pw)) {
				System.out.println(ml.get(i).getName()+"님 로그인 환영합니다.");
				flag = i;
				login = i;
			}
		}
		if(flag==-999) {
			System.out.println("아이디나 비밀번호가 틀렸습니다.");
		}
	}
	private static void signUp() {
		// 회원가입
		System.out.println("회원가입을 환영합니다.");
		System.out.println("이름을 입력해 주세요");
		String name = in.nextLine();
		System.out.println("아이디를 입력해 주세요");
		String id = in.nextLine();
		for(int i=0;i<ml.size();i++) {
			if(ml.get(i).getUserId().equals(id)) {
				System.out.println("입력하신 아이디는 이미 있는 아이디입니다.");
				System.out.println("아이디를 다시 입력해 주세요.");
				id = in.nextLine();
				i=-1;
			}
		}
		System.out.println("비밀번호를 입력해 주세요");
		String pw = in.nextLine();
		
		
		
		
		
		ml.add(new Member(name,id,pw));
		
		System.out.println("회원가입이 완료되었습니다.");
		
		
	}

	private static void programExit() {
		// TODO Auto-generated method stub
		System.out.println("프로그램을 종료하시겠습니까? (Y/N)");
		String ans = in.nextLine();
		
		if(ans.equalsIgnoreCase("Y")) {
			System.out.println("프로그램을 종료하겠습니다.");
			System.exit(0);
		}else if(ans.equalsIgnoreCase("N")) {
			System.out.println("이전 메뉴로 돌아갑니다.");
		}else {
			selectError();
		}
	}
	private static void selectError() {
		// TODO Auto-generated method stub
		System.out.println("잘못 입력하셨습니다");
		System.out.println("확인 후 다시 입력해주세요.");
	}

	
	
	
	
}
