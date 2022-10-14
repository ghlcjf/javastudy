package review;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex05_1_Review {
	static Scanner in = new Scanner(System.in);
	static List<Member> ml = new ArrayList<>();
	public static void main(String[] args) {
		// 로그인 프로그램
		
		
		while(true) {
			System.out.println("원하시는 메뉴를 선택해 주세요.");
			System.out.println("1. 회원가입 | 2. 로그인 | 3. 종료");
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
		
		
		

	}
	private static void signIn() {
		// 로그인
		System.out.println("로그인 메뉴입니다.");
		System.out.println("아이디를 입력해 주세요");
		String id = in.nextLine();
		System.out.println("비밀번호를 입력해 주세요");
		String pw = in.nextLine();
		boolean flag = true;
		for(int i=0;i<ml.size();i++) {
			if(ml.get(i).getUserId().equals(id)&&
					ml.get(i).getUserPw().equals(pw)) {
				System.out.println(ml.get(i).getName()+"님 환영합니다~~");
				flag = false;
			}
		}
		if(flag) {
			System.out.println("아이디와 비밀번호를 확인 후 다시 입력해 주세요.");
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
		System.out.println("잘못 선택하셨습니다");
		System.out.println("확인 후 다시 입력해주세요.");
	}

}
