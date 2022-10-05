package ch14.Answer;

import java.util.ArrayList;
import java.util.Scanner;

public class Answer08 {
	static Scanner in = new Scanner(System.in);
	static ArrayList<Board> bList = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("과제 게시판~~~~~~~~~~~~~~~~~~~");
		while(true) {
			System.out.println("원하시는 메뉴를 선택해 주세요");
			System.out.println("1. 게시글보기");
			System.out.println("2. 글 작성");
			System.out.println("3. 글 삭제");
			System.out.println("4. 프로그램 종료");
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
				delete();
				break;
			case 4:
				programExit();
				break;
			default:
				selectError();
			}
			
		}
		
		
	}
	
	
	private static void delete() {
		// 글 삭제
		System.out.println("글 삭제~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		if(bList.size()==0) {
			System.out.println("작성한 게시글이 없습니다~~~~~~~~~~~~~~~~~~~~~~~");
		}else {
			System.out.println("삭제 할 게시글 보기~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			
			for(int i=0;i<bList.size();i++) {
				System.out.println((i+1)+". "+bList.get(i).getTitle());
			} // 게시글 목록 보여주기
			
			System.out.println("삭제하실 게시글 번호를 입력해 주세요.");
			int select = Integer.parseInt(in.nextLine());
			
			bList.remove(select-1);
			System.out.println("삭제가 완료되었습니다~~~~~~~~~~~~~");
			
		}
		
	}


	private static void write() {
		// 글 작성 제목 작성자 내용 비밀번호
		System.out.println("글 작성~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("제목을 입력해 주세요");
		String title = in.nextLine();
		System.out.println("작성자를 입력해 주세요");
		String writer = in.nextLine();
		System.out.println("내용을 입력해 주세요");
		String content = in.nextLine();
		System.out.println("비밀번호를 입력해 주세요");
		String password = in.nextLine();
		bList.add(new Board(title,writer,content,password));
		System.out.println("게시글 작성이 완료됐습니다.");
	}


	private static void readBoard() {
		if(bList.size()==0) {
			System.out.println("작성한 게시글이 없습니다~~~~~~~~~~~~~~~~~~~~~~~");
		}else {
			System.out.println("게시글 보기~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			for(int i=0;i<bList.size();i++) {
				System.out.println((i+1)+". "+bList.get(i).getTitle());
			}
			System.out.println("열람하실 게시글 번호를 입력해 주세요.");
			int select = Integer.parseInt(in.nextLine());
			bList.get(select-1).prt();
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
