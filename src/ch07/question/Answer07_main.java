package ch07.question;

import java.util.Scanner;

public class Answer07_main {
	private Scanner in = new Scanner(System.in);
	static Member[] members = new Member[100];
	static int signIndex = -1;
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
			
				if(signIndex==-1) {
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
				}else if(signIndex!=-1) {
					System.out.println("원하시는 메뉴를 선택해 주세요.");
					System.out.println("1. 회원가입");
					System.out.println("2. 로그아웃");
					System.out.println("3. 종료");
					System.out.print("선택 >> ");
					int selNum = Integer.parseInt(in.nextLine());
					
					switch(selNum) {
					case 1:
						signUp();
						break;
					case 2:
						logout();
						break;
					case 3:
						programExit();
						break;
					default:
						selectError();
					}
				}
			
			
		}
		
	}

	private void logout() {
		System.out.print("로그아웃하시겠습니까? (Y/N) >> ");
		String ans = in.nextLine();
		if(ans.equalsIgnoreCase("y")) {
			
			members[signIndex].setLogin(0);
			signIndex=-1;
		}else {
			System.out.println("이전 메뉴로 돌아갑니다.");
		}
		
	}



	private void login() {
		// 로그인
		
		System.out.println("아이디를 입력해 주세요.");
		String id = in.nextLine();
		for(int i=0;i<members.length;i++) {
			if(members[i]!=null &&id.equals(members[i].getUserId())) {
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
			members[signIndex].prt();
			members[signIndex].setLogin(0);
			
		}else {
			System.out.println("비밀번호가 일치하지 않습니다.");
			
		}
		
	}

	private void signUp() {
		// 회원가입
		String id;
		String pw;
		String name;
		String phone;
		
		System.out.println("회원가입을 환영합니다.");
		System.out.print("아이디를 입력해 주세요 >> ");
		id = in.nextLine();
		for(int i=0;i<members.length;i++) {
			if(members[i]!=null && members[i].getUserId().equals(id)) {
				System.out.println("이미 존재하는 아이디 입니다.");
				return;
			}
		}
		System.out.print("비밀번호를 입력해 주세요 >> ");
		pw = in.nextLine();
		
		System.out.print("이름을 입력해 주세요 >> ");
		name = in.nextLine();
		
		System.out.print("전화번호를 입력해 주세요 >> ");
		phone = in.nextLine();
		
		Member s = new Member(id,pw,name,phone);
		for(int i=0;i<members.length;i++) {
			if(members[i]==null) {
				members[i]=s;
				System.out.println("회원가입이 완료되었습니다.");
				break; // 이거 안해주면 모든 members에 첫번째 s가 다 들어감!!!
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
