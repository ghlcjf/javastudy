package ch06;

import java.util.Scanner;

public class Answer_login {
	static Scanner in = new Scanner(System.in);
	static String[] ids = new String[100];
	static String[] pws = new String[100];
	static String[] names = new String[100];
	static int count = 0;
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("그린 아카데미에 오신 것을 환영합니다.");
			System.out.println("1. 회원 가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 탈퇴");
			System.out.println("4. 종료");
			System.out.print("원하시는 메뉴의 번호를 입력해 주세요. > ");
			int selNum = Integer.parseInt(in.nextLine());
			
			switch(selNum) {
			case 1:
				register();
				break;
			case 2:
				login();
				break;
			case 3:
				quit();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("번호 좀 똑바로 입력해라");
			}
		}

	}
	private static void quit() {
		System.out.println("회원 탈퇴하시겠습니까?");
		System.out.println("1. 취소");
		System.out.println("2. 탈퇴");
		int quitNum = Integer.parseInt(in.nextLine());
		
		switch(quitNum) {
		case 1:
			System.out.println("메인화면으로 돌아갑니다.");
			return;
		case 2:
			System.out.print("아이디를 입력해 주세요\nID: ");
			String id = in.nextLine();
			int idNum = -1;
			for(int i=0;i<ids.length;i++) {
				if(id.equals(ids[i])) {
					idNum=i;
				}
			}
			if(idNum==-1) {
				System.out.println("일치하는 정보가 없습니다.\n확인 후 다시 시도해 주세요.");
				return;
			}
			System.out.print("비밀번호를 입력해 주세요\n비밀번호 : ");
			String pw = in.nextLine();
			
			if(pw.equals(pws[idNum])) {
				System.out.println(names[idNum]+"님 탈퇴가 완료되었습니다.");
				ids[idNum] = null;
				pws[idNum] = null;
				names[idNum] = null;
				return;
			}else {
				System.out.println("비밀번호를 확인 후 다시 입력해 주세요.");
			}
			
			break;
		default:
			System.out.println("번호를 잘못입력하셨습니다.\n다시 시도해주세요.");
		}
		
		
	}
	private static void login() {
		System.out.println("로그인 메뉴입니다.");
		System.out.print("아이디를 입력해 주세요\nID : ");
		String id = in.nextLine();
		int idNum = -1;
		for(int i=0;i<ids.length;i++) {
			if(id.equals(ids[i])) {
				idNum=i;
				break;
			}
		}
		if(idNum==-1) {
			System.out.println("일치하는 정보가 없습니다.\n확인 후 다시 시도해 주세요.");
			return;
		}
		System.out.print("비밀번호를 입력해 주세요.\n비밀번호 : ");
		String pw = in.nextLine();
		if(pw.equals(pws[idNum])) {
			System.out.println(names[idNum]+"님 환영합니다!");
		}else {
			System.out.println("비밀번호를 확인 후 다시 입력해 주세요.");
		}
		
	}
	private static void register() {
		System.out.println("회원가입을 시작합니다.");
		for(int i = 0;i<ids.length;i++) {
			if(ids[i]==null) {
				System.out.println("아이디를 입력해 주세요.");
				ids[i] = in.nextLine();
				if(i>=1) {
					for(int j=0;j<i;j++) {
						if(ids[i].equals(ids[j])) {
							System.out.println("이미 사용 중인 아이디입니다.");
							ids[i]=null;
							return;
						}
					}
				}
				System.out.println("비밀번호를 입력해주세요.");
				pws[i] = in.nextLine();
				System.out.println("이름을 입력해주세요");
				names[i] = in.nextLine();
				System.out.println("회원가입이 완료됐습니다.");
				return;
			}
			
			
		}
		for(int i = 0;i<ids.length;i++) {
			if(ids!=null) {
				System.out.println("더 이상 회원가입을 진행할 수 없습니다.");
				return;
			}
		}
		
		
		
		
		
		
	}

}
