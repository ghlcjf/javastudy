package review;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex06_1_Review {

	private Scanner in = new Scanner(System.in);
	private List<Member> ml = new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex06_1_Review();
	}

	Ex06_1_Review() {
		initController();
	}

	private void initController() {
		// 본격적인 로그인 기능
		
		boolean execute = true;
		
		
		while(execute) {
			// 메뉴를 보여주고 선택
			int selNum = viewMenu();
			// 선택된 기능 수행
			switch(selNum) {
			case 1:
				String[] memberInputInfo = viewSignUp();
				
				if(insertMember(memberInputInfo)) {
					viewOk();
				}else {
					viewError();
				}
				break;
			case 2:
				String[] memberLoginInfo = viewSignIn();
				int memberIdx = loginMember(memberLoginInfo);
				if(!(memberIdx==-1)) {
					// 메서드가 트루면 로그인 후 기능
					viewWelcome(memberIdx);
				}else {
					viewError();
				}
				break;
			case 3:
				viewExit();
				break;
			default:
				viewError();
			}
			
		}
		
	}

	private void viewWelcome(int memberIdx) {
		// TODO Auto-generated method stub
		System.out.println(ml.get(memberIdx).getName()+"님 환영합니다.");
	}

	private int loginMember(String[] memberLoginInfo) {
		
		for(int i=0;i<ml.size();i++) {
			if(ml.get(i).getUserId().equals(memberLoginInfo[0])&&
					ml.get(i).getUserPw().equals(memberLoginInfo[1])) {
				return i;
			}
		}
		return -1;
	}

	private String[] viewSignIn() {
		System.out.println("로그인을 시작합니다");
		System.out.println("아이디를 입력하세요.");
		String id = in.nextLine();
		System.out.println("비밀번호를 입력하세요.");
		String pw = in.nextLine();
		
		return new String[] {id,pw};
	}

	private void viewOk() {
		System.out.println("회원가입이 정상적으로 완료됐습니다.");
		
	}

	private boolean insertMember(String[] memberInputInfo) {
		// 배열로 전달받은 회원 정보를 저장하기 위한 메서드.
		Member m = new Member(memberInputInfo[0],
				memberInputInfo[1],
				memberInputInfo[2]);
		ml.add(m);
		return true;
	}

	private String[] viewSignUp() {
		// view에서 사용자의 정보를 입력받기 위한 메서드
		
		System.out.println("회원가입을 환영합니다");
		System.out.println("이름을 입력하세요.");
		String name = in.nextLine();
		System.out.println("아이디를 입력하세요.");
		String id = in.nextLine();
		System.out.println("비밀번호를 입력하세요.");
		String pw = in.nextLine();
		
		
		return new String[] {name,id,pw};
	}

	private void viewExit() {
		// TODO Auto-generated method stub
		System.out.println("프로그램을 종료하시겠습니까? (Y/N) ");
		String ans = in.nextLine();
		if(ans.equalsIgnoreCase("Y")) {
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		}else if(ans.equalsIgnoreCase("N")) {
			System.out.println("프로그램 종료를 취소합니다.");
		}else {
			viewError();
		}
	}

	private void viewError() {
		System.out.println("잘못 입력했습니다.");
		System.out.println("다시 확인해 주세요.");
		System.out.println("===============================");
		
	}

	private int viewMenu() {
		// 메뉴를 보여주고 사용자가 선택한 번호를 반환
		System.out.println("레드아카데미에 오신 것을 환영합니다.");
		System.out.println("메뉴를 골라주세요");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 종료");
		int selNum = Integer.parseInt(in.nextLine());
		return selNum;
	}
	
}
