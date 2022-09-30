package ch11.answer;
// 추상클래스 > 인터페이스로부터 구현받아서 메서드를 오버라이드 할 필요가 없다.(해도됨.한다면 구현 받고 스튜던트에서 오버라이드하면됨)
public abstract class Member implements Task{
	
	//필드 3개
	private String memberId;
	private String memberPw;
	private String memberName;
	
	//게터 세터
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	
	//생성자
	public Member(String memberId, String memberPw, String memberName) {
		super();
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
	}
	

	
	
	
	
	
	
	
	
}
