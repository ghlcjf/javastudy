package ch11.answer;

public class Student extends Member{
	// 일반 클래스인 Student 클래스는 구현 받아야 한다.
	@Override
	public void work() {
		System.out.println("공부를 합니다.");
		
	}

	@Override
	public void test() {
		System.out.println("시험을 봅니다.");
	}
	
	// 전공 추가
	private String major;

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	//부모 생성자에게 보낼 것과 본인 필드 거 까지
	public Student(String memberId, String memberPw, String memberName, String major) {
		super(memberId, memberPw, memberName);
		this.major = major;
	}

	
	
	
}
