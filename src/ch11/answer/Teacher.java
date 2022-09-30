package ch11.answer;

public class Teacher extends Member{
	
	private String subject;
	

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	// 상속받고 난 뒤 생성자
	public Teacher(String memberId,   //매개변수
				   String memberPw,   //
				   String memberName, //
				   String subject) {  //
		super(memberId, memberPw, memberName);
		this.subject = subject;
	}

	@Override
	public void work() {
		System.out.println("강의를 합니다.");
	}

	@Override
	public void test() {
		System.out.println("채점을 합니다.");
	}
	
	
	
	// Task Member Student Teacher
	// 이걸 다 만듦으로써 DTO 객체 완성 (Data Transfer Object)
	// or VO 객체 (Value Object)
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
