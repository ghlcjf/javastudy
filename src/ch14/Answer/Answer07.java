package ch14.Answer;

import java.util.ArrayList;
import java.util.Scanner;

public class Answer07 {
	
	static Scanner in = new Scanner(System.in);
	static ArrayList<Member> mList = new ArrayList<>(); 
	static int indexNum = -1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			if(indexNum==-1) {
				main();
			}else {
				logout();
			}
			
		}
		
		
		
		
		
	}

	private static void logout() {
		
		
		
		System.out.println("원하시는 메뉴를 선택해 주세요");
		System.out.println("1.회원가입");
		System.out.println("2.로그인");
		System.out.println("3.로그아웃");
		System.out.println("4.종료");
		System.out.print("선택 >> ");
		int selNum = Integer.parseInt(in.nextLine());
		
		switch(selNum) {
		case 1:
			signUp();
			break;
		case 2:
			alreadysingIn();
			break;
		case 3:
			signout();
			break;
		case 4:
			programExit();
			break;
		default:
			selectError();
		}
		
		
		
		
		
		
		
	
		
	}

	private static void signout() {
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

	private static void alreadysingIn() {
		System.out.println("이미 로그인 되어있습니다.");
		
	}

	private static void main() {
		System.out.println("어서 오세요");
		
		System.out.println("원하시는 메뉴를 선택해 주세요");
		System.out.println("1.회원가입");
		System.out.println("2.로그인");
		System.out.println("3.종료");
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
			programExit();
			break;
		default:
			selectError();
		}
		
	
		
	}

	private static void signIn() {
		System.out.println("로그인~~~~~~~~~~~~~~");
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
