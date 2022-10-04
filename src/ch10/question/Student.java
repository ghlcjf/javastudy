package ch10.question;

public class Student extends Member{
	private String major;

	public String getSubject() {
		return major;
	}

	public void setSubject(String subject) {
		this.major = subject;
	}

	public Student(String userId, String userPw, String userName, String major) {
		super(userId, userPw, userName);
		this.major = major;
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("공부를 합니다.");
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("시험을 봅니다.");
	}
	
	
}
