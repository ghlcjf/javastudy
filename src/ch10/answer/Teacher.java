package ch10.answer;

public class Teacher extends Member{
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Teacher(String userName, String userId, String userPw, String subject) {
		super(userName, userId, userPw);
		this.subject = subject;
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("수업을 합니다.");
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("채점을 합니다.");
	}
	

}
