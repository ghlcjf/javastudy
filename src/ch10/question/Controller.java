package ch10.question;



public class Controller {
	
	private Dao dao = Dao.getInstance();
	
	public Controller() {
		main();
	}

	private void main() {
		// 코드 작성할 메인 메서드
		
		while(true) {
			int num = View.mainMenu();
			Member member = null;
			// 메인메뉴 메서드에서 선택한 번호를 num 변수에 저장
			
			switch(num) {
			case 1:
				member = View.signUp();
				if(member==null) {
					View.selectError();
				}else {
					dao.insertMember(member);
					System.out.println("회원가입이 완료됐습니다.");
					// private Dao타입 dao변수에 dao인스턴스를 저장한 후?
				}
				break;
			case 2:
				String[] loginInfo = View.signIn();
				member = dao.checkMember(loginInfo);
				if(member==null) {
					View.selectError();
				}else {
					task(member);
				}
				
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

	private void task(Task task) {
		// TODO Auto-generated method stub
		task.work();
		task.test();
		
	}
	
	
	
	
	
}
