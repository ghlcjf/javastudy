package review;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex05_2_Review {
	static Scanner in = new Scanner(System.in);
	static List<Board> bl = new ArrayList<>();
	static int num;
	public static void main(String[] args) {
		// 게시판 프로그램
		
		while(true) {
			
			System.out.println("원하시는 메뉴를 선택해 주세요");
			System.out.println("1. 글 목록보기 | 2. 글 작성| 3. 종료");
			int selNum = Integer.parseInt(in.nextLine());
			
			
			switch(selNum) {
			case 1:
				if(!bl.isEmpty()) {
					readBoard();
				}else {
					System.out.println("게시글이 없습니다.");
				}
				
				break;
			case 2:
				write();
				break;
			case 3:
				programExit();
				break;
			default:
				selectError();
			}
			
			
			
			
			
			
		}
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	private static void write() {
		// 글 작성하기
		
		System.out.println("글 작성하기");
		System.out.println("글 제목을 입력해 주세요");
		String title = in.nextLine();
		System.out.println("작성자를 입력해 주세요");
		String writer = in.nextLine();
		System.out.println("글 내용을 입력해 주세요");
		String content = in.nextLine();
		System.out.println("비밀번호를 입력해 주세요");
		String password = in.nextLine();
		
		bl.add(new Board(title,writer,content,password));
		System.out.println("게시글 등록이 완료되었습니다.");
	}











	private static void readBoard() {
		// 글 목록 보기
		System.out.println("---글 목록보기---");
		for(int i=0;i<bl.size();i++) {
			System.out.println((i+1)+". "+bl.get(i).getTitle()+"| 작성자 : "+bl.get(i).getWriter());
			
		}
		System.out.println("상세보기를 원하면 글 번호를 입력해 주세요");
		num = Integer.parseInt(in.nextLine())-1;
		Board bb =null;
		if(num>=0&&num<bl.size()) {
			bb = bl.get(num);
			bb.prt();
			modify();
		}else {
			selectError();
		}
		
		
		
		
		
	}











	private static void modify() {
		// TODO Auto-generated method stub
		boolean run = true;
		while(run) {
			
		
			System.out.println("원하시는 메뉴를 선택해 주세요");
			System.out.println("1. 수정 | 2. 삭제 | 3. 뒤로가기");
			int selNum = Integer.parseInt(in.nextLine());
			
			switch(selNum) {
			case 1:
				modify1();
				break;
			case 2:
				delete();
				break;
			case 3:
				reset();
				run = false;
				break;
			default:
				selectError();
			}
		}
	}











	private static void reset() {
		// 이전 메뉴로 돌아가기
		
		System.out.println("이전 메뉴로 돌아갑니다.");
		
		
	}











	private static void delete() {
		// 삭제하기
		System.out.println("비밀번호를 입력해 주세요");
		String password = in.nextLine();
		if(bl.get(num).getPassword().equals(password)) {
			bl.remove(num);
			System.out.println("삭제가 완료되었습니다.");
		}else {
			selectError();
		}
	}











	private static void modify1() {
		// 글 수정하기
		System.out.println("비밀번호를 입력해 주세요");
		String password = in.nextLine();
		if(bl.get(num).getPassword().equals(password)) {
			System.out.println("글 내용을 입력해 주세요");
			String content = in.nextLine();
			bl.get(num).setContent(content);
			System.out.println("수정이 완료되었습니다.");
		}else {
			selectError();
		}
		
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
