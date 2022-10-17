package review;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex06_2_Review {
	private Scanner in = new Scanner(System.in);
	private List<Board> bl = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex06_2_Review();
	}
	
	Ex06_2_Review(){
		initController();
	}

	private void initController() { // 본격적인 게시판 기능
		
		while(true) {
			// 메뉴 보여주고 -> 선택
			int selNum = viewBoardMenu();
			
			
			// 선택된 기능 수행
			if(selNum==1) {
				// 글 목록보기 -> 상세보기까지
				viewAllBoard();
				int boardIndex = viewSelectDetailBoard();
				if(boardIndex<-1 || boardIndex>=bl.size()) {
					viewError();
				}else if(boardIndex==-1) {
					// 돌아가기
					
				}else {
					// 상세보기
					viewDetailBoard(boardIndex);
				}
			}else if(selNum==2) {
				// 글 작성하기
				String[] boardInfo = viewInputBoard();
				if(insertBoard(boardInfo)) {
					viewOk();
				}else {
					viewError();
				}
			}else if(selNum==3) {
				// 돌아가기 (종료)
				viewReturn();
			}else {
				// 잘못 선택
				viewError();
			}
		}
		
	}
	
	
	private void viewDetailBoard(int boardIndex) {
		System.out.println("^^^^^상세 보기^^^^^");
		System.out.println("글 번호 : "+(boardIndex+1));
		System.out.println("글 제목 : "+bl.get(boardIndex).getTitle());
		System.out.println("작성자 : "+bl.get(boardIndex).getWriteNum());
		System.out.println("글 내용 : "+bl.get(boardIndex).getContent());
		
		
	}

	private int viewSelectDetailBoard() {
		System.out.println("게시글 상세보기를 원하면 게시글 번호를 입력하세요");
		System.out.println("상세보기를 원하지 않으면 0을 입력하세요");
		int selNum = Integer.parseInt(in.nextLine())-1;
		return selNum;
	}

	private void viewAllBoard() {
		int cnt = 0;
		System.out.println("==================================");
		for(Board b :bl) {
			System.out.println("글 번호 : "+(++cnt));
			System.out.println("글 제목 : "+b.getTitle());
			System.out.println("작성자  : "+b.getWriter());
			System.out.println("==================================");
		}
		
	}

	private void viewOk() {
		System.out.println("글 등록이 정상적으로 완료됐습니다.");
	}

	private boolean insertBoard(String[] boardInfo) {
		Board b = new Board(boardInfo[0],
							boardInfo[1],
							boardInfo[2],
							boardInfo[3]);
		bl.add(b);
		return true;
	}

	private String[] viewInputBoard() {
		System.out.println("글 작성 화면입니다");
		System.out.println("글 제목을 입력해 주세요");
		String title = in.nextLine();
		System.out.println("작성자를 입력해 주세요");
		String writer = in.nextLine();
		System.out.println("글 내용을 입력해 주세요");
		String content = in.nextLine();
		System.out.println("비밀번호를 입력해 주세요");
		String pw = in.nextLine();
		
		return new String[] {title,writer,content,pw};
	}

	private void viewReturn() {
		System.out.println("홈 화면으로 돌아갑니다.");
		System.exit(0);
		
	}

	private void viewError() {
		System.out.println("잘못 입력했습니다.");
		System.out.println("다시 확인해 주세요.");
		System.out.println("===============================");
		
	}

	private int viewBoardMenu() {
		// 메뉴를 보여주고 사용자가 선택한 번호를 반환
		System.out.println("자유게시팔");
		System.out.println("메뉴를 선택하세요");
		System.out.println("1. 글 목록 보기");
		System.out.println("2. 글 작성하기");
		System.out.println("3. 돌아가기");
		int selNum = Integer.parseInt(in.nextLine());
		return selNum;
	}
}
