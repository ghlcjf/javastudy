package ch07.question_02;



public class Controller {

	public Controller() {
		main();
	}

	private void main() {
		
		while(true) {
			int num = View.mainMenu();
			
			switch(num) {
			case 1:
				View.signUp();
				break;
			case 2:
				View.signIn();
				break;
			case 3:
				if(View.programExit()) {
					return;
				}else {
					View.selectError();
				}
				
				break;
			default:
				View.selectError();
		
				 
			}
		}
	}
}
