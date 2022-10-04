package ch10.question;

public class Teacher extends Member{
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Teacher(String userId, String userPw, String userName, String subject) {
		super(userId, userPw, userName);
		this.subject = subject;
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("강의를 합니다.");
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("채점을 합니다.");
	}
	
	
	
	
	
	
	
	
	
	
	
}
