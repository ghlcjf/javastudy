package ch10.answer;

public class Student extends Member{
	
	private String major;

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public Student(String userName, String userId, String userPw, String major) {
		super(userName, userId, userPw);
		this.major = major;
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("공부를 합니다");
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("시험을 봅니다");
	}

	
}
