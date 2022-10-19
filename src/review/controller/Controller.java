package review.controller;

import review.Member;

public class Controller {
	
	
	
	static review.dto.Member m = null;
	
	
	
	public Controller() {
		
		main();
	}

	
	
	private void main() {
		// TODO Auto-generated method stub
		while(true) {
			int selNum = review.view.View.menu();
			
			switch(selNum) {
			case 1://회원가입
				review.dto.Member member = null;
				member = review.view.View.signUp();
				if(member==null) {
					review.view.View.selectError();
				}else {
					if(review.dao.Dao.insertMember(member)) {
						review.view.View.hello();
					}else {
						review.view.View.overlap();
					}
					
				}
				
				break;
			case 2://로그인
				String[] memberCheck = null; 
				memberCheck = review.view.View.signIn();
				if(memberCheck==null) {
					review.view.View.selectError();
				}else {
					m = (review.dto.Member) review.dao.Dao.checkMember(memberCheck);
					if(m==null) {
						review.view.View.selectError();
					}else {
						new review.controller.LoginController(m);
					}
					
				}
				break;
			case 3://글 목록보기
				if(review.dao.Dao.bl.isEmpty()) {
					review.view.View.empty();
				}else {
					int num = review.view.View.readBoard();
					if(0<=num && num<review.dao.Dao.bl.size()) {
						// 상세보기
						review.view.View.prt(num);
					}else if(num==-1) {
						// 상세보기 원하지 않음
						review.view.View.back();
					}else {
						// 잘못누름
						review.view.View.selectError();
					}
				}
				break;
			case 4://프로그램 종료
				review.view.View.programExit();
				break;
			default:
				review.view.View.selectError();
			}
		}
		
		
	}
}

