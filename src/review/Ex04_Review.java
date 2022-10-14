package review;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex04_Review {
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		// 게시판(Board) 기능
		
		// 게시판에는 제목, 작성자, 글내용, 비밀번호
		
		// 1) 게시글 목록 보기는 글 번호와 제목과 작성자만 보이도록 전체 게시글을 출력한다.
		
		// 2) 글 작성하기 기능은 제목, 작성자, 글 내용, 비밀번호를 입력해서 리스트에 저장
		
		// 3) 글 상세 보기는 글 번호를 입력받고 제목, 작성자, 글 내용을 출력하도록 한다.
		
		// 4) 글 수정하기는 글 번호를 입력해서 상세 보기 후 1을 입력하면 비밀번호를 입력하고 
		//    글 제목, 글 내용을 수정할 수 있도록 한다.
		
		// 5) 글 삭제하기는 글 번호를 입력해서 상세 보기 후 2를 입력하면 
		//    비밀번호를 입력하고 글 삭제를 할 수 있다.

		// 6) 위 기능이 정상적으로 작동했는지 전체 글 내용을 출력한다.
		
		List<Board> lists = new ArrayList<>();
		
		lists.add(new Board("aa","aa","aa","aa"));
		lists.add(new Board("bb","bb","bb","bb"));
		lists.add(new Board("cc","cc","cc","cc"));
		lists.add(new Board("dd","dd","dd","dd"));
		lists.add(new Board("ee","ee","ee","ee"));
		
		
		System.out.println("-------------------------------------");
		System.out.println("---게시글 목록 보기---");
		for(int i=0;i<lists.size();i++) {
			System.out.println((i+1)+". "+lists.get(i).getTitle()+" | 작성자 : "+lists.get(i).getWriter());
		}
		
		System.out.println("-------------------------------------");
		System.out.println("---글 작성하기---");
		System.out.print("제목을 입력해 주세요");
		String title = in.nextLine();
		System.out.print("작성자를 입력해 주세요");
		String writer = in.nextLine();
		System.out.print("내용을 입력해 주세요");
		String content = in.nextLine();
		System.out.print("비밀번호를 입력해 주세요");
		String password = in.nextLine();
		
		lists.add(new Board(title,writer,content,password));
		
		System.out.println("글 작성이 완료되었습니다.");
		
		System.out.println("-------------------------------------");
		
		System.out.println("---글 상세 보기---");
		for(int i=0;i<lists.size();i++) {
			System.out.println((i+1)+". "+lists.get(i).getTitle()+" | 작성자 : "+lists.get(i).getWriter());
		}
		
		System.out.println("글 번호를 입력해 주세요");
		int num = Integer.parseInt(in.nextLine());
		
		lists.get(num-1).prt();
		
		System.out.println("-------------------------------------");
		System.out.println("---글 수정, 삭제하기---");
		
		for(int i=0;i<lists.size();i++) {
			System.out.println((i+1)+". "+lists.get(i).getTitle()+" | 작성자 : "+lists.get(i).getWriter());
		}
		
		System.out.println("수정 또는 삭제할 글 번호를 입력해 주세요.");
		num = Integer.parseInt(in.nextLine());
		lists.get(num-1).prt();
		System.out.println("수정을 원하면 1,삭제를 원하면 2, 돌아가기는 0번을 눌러주세요.");
		int select = Integer.parseInt(in.nextLine());
		
		if(select==1) {
			System.out.println(num+"번 글의 비밀번호를 입력해 주세요");
			password = in.nextLine();
			if(lists.get(num-1).getPassword().equals(password)) {
				System.out.println("글 제목을 입력해 주세요");
				title = in.nextLine();
				System.out.println("글 내용을 입력해 주세요");
				content = in.nextLine();
				lists.get(num-1).setTitle(title);
				lists.get(num-1).setContent(content);
				System.out.println("글 수정이 완료되었습니다.");
				
			}else {
				System.out.println("비밀번호가 일치하지 않음");
			}
		}else if(select==2) {
			System.out.println(num+"번 글의 비밀번호를 입력해 주세요");
			password = in.nextLine();
			if(lists.get(num-1).getPassword().equals(password)) {
				lists.remove(num-1);
			}else {
				System.out.println("비밀번호가 일치하지 않음");
			}
		}else if(select==0) {
			System.out.println("아무것도 실행하지 않음");
		}else {
			System.out.println("잘못 입력");
		}
		
		
		
		
//		System.out.println("1을 입력하면 수정한다.");
//		int modify = Integer.parseInt(in.nextLine());
//		if(modify==1) {
//			System.out.println("글 번호를 입력해 주세요");
//			num = Integer.parseInt(in.nextLine());
//			System.out.println(num+"번 글의 비밀번호를 입력해 주세요");
//			password = in.nextLine();
//			if(lists.get(num-1).getPassword().equals(password)) {
//				System.out.println("글 제목을 입력해 주세요");
//				title = in.nextLine();
//				System.out.println("글 내용을 입력해 주세요");
//				content = in.nextLine();
//				lists.get(num-1).setTitle(title);
//				lists.get(num-1).setContent(content);
//				System.out.println("글 수정이 완료되었습니다.");
//				
//			}else {
//				System.out.println("비밀번호가 일치하지 않음");
//			}
//			
//		}else {
//			System.out.println("글 수정 하지 않음");
//		}
		
		System.out.println("-------------------------------------");
//		System.out.println("---글 삭제하기---");
//		for(int i=0;i<lists.size();i++) {
//			System.out.println((i+1)+". "+lists.get(i).getTitle()+" | 작성자 : "+lists.get(i).getWriter());
//		}
//		
//		System.out.println("2를 입력하면 삭제한다.");
//		int delete = Integer.parseInt(in.nextLine());
//		
//		if(delete==2) {
//			System.out.println("글 번호를 입력해 주세요");
//			num = Integer.parseInt(in.nextLine());
//			System.out.println(num+"번 글의 비밀번호를 입력해 주세요");
//			password = in.nextLine();
//			if(lists.get(num-1).getPassword().equals(password)) {
//				lists.remove(num-1);
//			}else {
//				System.out.println("비밀번호가 일치하지 않음");
//			}
//		}else {
//			System.out.println("글 삭제하지 않음");
//		}
		
		
		System.out.println("-------------------------------------");
		System.out.println("정상적으로 작동하는지 테스트");
		for(Board b:lists) {
			b.prt();
		}
		
		
		
		
		
		
	}

}
