package ch10.answer;

public class Controller {
	
	private Dao dao = Dao.getInstance();
	
	public Controller() {
		main();
	}

	private void main() {
		while(true) {
			Member member = null;
			String[] check = null; 
		
			int num = View.selectNum();
			
			switch(num) {
			case 1:
				member = View.signUp();
				if(member==null) {
					View.selectError();
				}else {
					dao.insertMember(member);
				}
				break;
			case 2:
				check = View.signIn();
				member = dao.checkMember(check);
				if(member == null) {
					View.selectError();
				}else {
					task(member);
				}
				break;
			case 3:
				View.programExit();
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
