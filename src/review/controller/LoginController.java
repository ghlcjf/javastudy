package review.controller;

import review.dto.Member;

public class LoginController {

	public LoginController(Member m) {
		main(m);
	}

	private void main(Member m) {
		// TODO Auto-generated method stub
		while(true) {
			int selNum = review.view.View.loginMenu(m);
			
		}
		
	}

}
