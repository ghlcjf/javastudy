package ch07.question;

import java.util.Scanner;

public class Answer08 {
	static Scanner in = new Scanner(System.in);
	static Board[] boards = new Board[100]; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Answer08();
	}
	
	Answer08(){
		init();
	}
	
	private void init() {
		// TODO Auto-generated method stub
		while(true) {
			
			System.out.println("===================================");
			System.out.println("원하시는 메뉴를 선택해 주세요.");
			System.out.println("1. 게시글 보기");
			System.out.println("2. 글 작성");
			System.out.println("3. 글 삭제");
			System.out.println("4. 종료");
			System.out.print("선택 >> ");
			int select = Integer.parseInt(in.nextLine());
			
			switch(select) {
			case 1:
				read();
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

	private void delete() {
		// TODO Auto-generated method stub
		int select = -1;
		System.out.println("게시글을 삭제합니다.");
		for(int i=0;i<boards.length;i++) {//삭제를 위한 게시글 출력
			if(boards[i]!=null) {
				System.out.println((i+1)+". "+boards[i].getTitle());
				
			}
		}
		for(int i=0;i<boards.length;i++) {
			if(boards[i]!=null) {
				System.out.println("원하시는 게시글 번호를 입력해 주세요");
				select = Integer.parseInt(in.nextLine()); //select-1 >> 글 인덱스
				System.out.println("작성자 이름을 입력해 주세요.");
				String writer = in.nextLine();
				System.out.println("비밀번호를 입력해 주세요.");
				String password = in.nextLine();
				if(boards[select-1].getWriter().equals(writer) && boards[select-1].getPassword().equals(password)) {
					boards[select-1] = null;
					System.out.println("삭제가 완료되었습니다.");
					return;
				}else if(!boards[select-1].getWriter().equals(writer) || !boards[select-1].getPassword().equals(password)) {
					System.out.println("입력하신 정보가 일치하지 않습니다.");
					System.out.println("다시 확인해 주세요.");
				}
				break;
			}
		}
		
	}

	private void write() {
		System.out.println("게시글을 작성합니다.");
		System.out.print("글 제목을 입력해 주세요 >> ");
		String title = in.nextLine();
		System.out.print("작성자를 입력해 주세요 >> ");
		String writer = in.nextLine();
		System.out.print("글 내용을 입력해 주세요 >> ");
		String content = in.nextLine();
		System.out.print("비밀번호를 입력해 주세요 >> ");
		String password = in.nextLine();
		
		Board b = new Board(title,writer,content,password);
		for(int i=0;i<boards.length;i++) {
			if(boards[i]==null) {
				boards[i] = b;
				System.out.println("게시글 작성이 완료되었습니다.");
				break;
			}
		}
	}

	private void read() {
		int select = -1;
		for(int i=0;i<boards.length;i++) {
			if(boards[i]!=null) {
				System.out.println((i+1)+". "+boards[i].getTitle());
				
			}
		}
		for(int i=0;i<boards.length;i++) {
			if(boards[i]!=null) {
				System.out.println("원하시는 게시글 번호를 입력해 주세요");
				select = Integer.parseInt(in.nextLine());
				boards[select-1].prt();
				break;
			}
		}
		if(select==-1) {
			System.out.println("게시물이 없습니다.");
			return;
		}
		
	}

	private void programExit() {
		
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
