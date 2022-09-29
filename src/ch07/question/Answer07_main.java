package ch07.question;

import java.util.Scanner;

public class Answer07_main {
	private Scanner in = new Scanner(System.in);
	static Member[] members = new Member[100];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Answer07_main();
	}

	
	
	Answer07_main(){
		
		
		init();
	}

	private void init() {
		// TODO Auto-generated method stub
		
		while(true) {
			System.out.println("원하시는 메뉴를 선택해 주세요.");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 종료");
			System.out.print("선택 >> ");
			int selNum = Integer.parseInt(in.nextLine());
			
			switch(selNum) {
			case 1:
				signUp();
				break;
			case 2:
				login();
				break;
			case 3:
				programExit();
				break;
			default:
				selectError();
			}
		}
		
	}

	private void login() {
		// 로그인
		int signIndex = -1;
		System.out.println("아이디를 입력해 주세요.");
		String id = in.nextLine();
		for(int i=0;i<members.length;i++) {
			if(id.equals(members[i].getUserId())) {
				signIndex = i;
				break;
			}
		}
		if(signIndex==-1) {
			System.out.println("입력하신 아이디와 일치하는 정보를 찾을 수 없습니다.");
			return;
		}
		System.out.println("비밀번호를 입력해 주세요.");
		String pw = in.nextLine();
		if(pw.equals(members[signIndex].getUserPw())) {
			System.out.println("로그인 성공!");
			System.out.println(members[signIndex].getName()+"님 환영합니다!");
		}else {
			System.out.println("비밀번호가 일치하지 않습니다.");
			
		}
		
	}

	private void signUp() {
		// 회원가입
		
		
		for(int i=0;i<members.length;i++) {
			String id = null;
			String pw = null;
			String name = null;
			String phone = null;
			if(members[i].getUserId().equals(null)) {
				System.out.println("회원 가입을 환영합니다.");
				System.out.print("아이디를 입력해 주세요 >> ");
				id = in.nextLine();
				if(i>=1) {
					for(int j=0;j<members.length;j++) {
						if(id.equals(members[j].getUserId())) {
							System.out.println("이미 존재하는 아이디 입니다.");
							id = null;
							return;
						}else {
							break;
						}
					}
				}
				
				System.out.print("비밀번호를 입력해 주세요 >> ");
				pw = in.nextLine();
				
				System.out.print("이름을 입력해 주세요 >> ");
				name = in.nextLine();
				
				System.out.print("전화번호를 입력해 주세요 >> ");
				phone = in.nextLine();
				
				members[i] = new Member(id,pw,name,phone);
				System.out.println("회원 가입이 완료되었습니다.");
				return;
			}
			
			
		}
		
	}

	private void programExit() {
		// 프로그램 종료
		System.out.print("프로그램을 종료하시겠습니까? (Y/N) >> ");
		
		if(in.nextLine().equalsIgnoreCase("y")) {
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		}else {
			System.out.println("이전 메뉴로 돌아갑니다.");
		}
		
	}

	private void selectError() {
		System.out.println("똑바로 입력");
		
	}
}
