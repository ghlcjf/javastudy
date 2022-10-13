package ch17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Ex08_review {
	static Scanner in = new Scanner(System.in);
	static List<Member> lists = new ArrayList<>();
	public static void main(String[] args) {
		// 멤버 객체에는 이름, 아이디, 비밀번호를 저장할 수 있다
		
		// 리스트에 임의의 5개의 멤버를 저장하고
		// 고길동		ko		1234
		// 이길동		lee		2345
		// 박길동		park	3456
		// 최길동		choi	4567
		// 홍길동		hong	5678
		
		
		lists.add(new Member("고길동","ko","1234"));
		lists.add(new Member("이길동","lee","2345"));
		lists.add(new Member("박길동","park","3456"));
		lists.add(new Member("최길동","choi","4567"));
		lists.add(new Member("홍길동","hong","5678"));
		
		// 1) 아이디 비밀번호를 입력받아서 로그인을 성공하면 "---님 환영합니다"
		// 2) 아이디 비밀번호를 입력받아서 로그인을 실패하면 "해당 계정이 없거나 비밀번호가 틀렸습니다."
		
		// 3) 이름을 입력받아서 해당 비밀번호를 변경하는 프로그램
		
		
		
		while(true) {
			System.out.println("1. 로그인|2. 비밀번호 변경|3. 종료");
			int num = Integer.parseInt(in.nextLine());
			
			switch(num) {
			case 1:
				signIn();
				break;
			case 2:
				modify();
				break;
			case 3:
				programExit();
				break;
			default:
				System.out.println("잘못입력함");
			}
			
			
			
			
		}
		

	}

	private static void modify() {
		// TODO Auto-generated method stub
		System.out.println("이름을 입력해 주세요.");
		String name = in.nextLine();
		System.out.println("현재 비밀번호를 입력해 주세요.");
		String pw = in.nextLine();
	
		for(int i=0;i<lists.size();i++) {
			if(lists.get(i).getName().equals(name)&&
					lists.get(i).getUserPw().equals(pw)) {
				System.out.println("변경하실 비밀번호를 입력해 주세요");
				String newPw = in.nextLine();
				System.out.println("비밀번호를 다시 입력해 주세요");
				String newPw2 = in.nextLine();
				
				if(newPw.equals(newPw2)) {
					lists.get(i).setUserPw(newPw);
					System.out.println("비밀번호가 변경되었습니다.");
					return;
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
					return;
				}
			}
		}
		

		
		
		
	}

	
	
	
	
	
	
	private static void signIn() {
		System.out.println("아이디를 입력해 주세요.");
		String id = in.nextLine();
		System.out.println("비밀번호를 입력해 주세요.");
		String pw = in.nextLine();
		
		for(int i=0;i<lists.size();i++) {
			if(lists.get(i).getUserId().equals(id)&&lists.get(i).getUserPw().equals(pw)) {
				System.out.println(lists.get(i).getName()+"님 환영합니다.");
				return;
			}
		}
		
		System.out.println("해당 계정이 없거나 비밀번호가 틀립니다.");
		
	}

	private static void programExit() {
		// TODO Auto-generated method stub
		System.out.println("프로그램을 종료하시겠습니까?(Y/N)");
		String answer = in.nextLine();
		
		if(answer.equalsIgnoreCase("y")) {
			System.out.println("프로그램을 종료합니다");
			System.exit(0);
		}else {
			System.out.println("이전으로 돌아갑니다.");
		}
		
	}

}
