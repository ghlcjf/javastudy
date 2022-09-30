package ch11.answer;

public class Controller {
	// 메인 로직을 담당할 클래스
	
	private Dao dao = Dao.getInstance();
	// 싱글턴으로 만들어진 객체를 가져다 쓰겠다.new Dao()는 안됨 싱글턴이라 ((((회원가입 else문에 들어갈 것임))))
	public Controller() {
		main();
	}

	private void main() {
		
		while(true) {
			// View 클래스의 메인메뉴 메서드를 이용해 메인메뉴 선택 번호 반환 후 num에 저장
			int num = View.mainMenu();
			
			Member member = null;

			// 저장받은 num을 통해 switch문 동작
			switch(num) {
			case 1: // 회원가입
				member = View.signUp();
				if(member == null) {
					View.selectError();
				}else {
					dao.insertMember(member);
				}
				break;
			case 2: // 로그인
				String[] loginInfo = View.signIn();
				
				member =dao.checkMember(loginInfo);
				if(member==null) {
					View.selectError();
				}else {
					task(member);
					
				}
				break;
			case 3: // 프로그램 종료
				if(!View.selectExit()) { // ! 이거 써보려고 
					return;
				}else {
					break;
				}
				
			default: // 오입력
				View.selectError();
			}
			
			
			
			
		}
		
	}// 메인 메서드 끝

	private void task(Task task) {
		// 로그인 성공 후 학생이냐 선생이냐는 중요하지 않음
		// 둘 다 워크 테스트 메서드 가지고 있으니까
		task.work();
		task.test();
		
	}
	
	
	
	
}
