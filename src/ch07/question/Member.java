package ch07.question;

public class Member {
	private String userId = null;
	private String userPw = null;
	private String name = null;
	private String phone =null;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	Member(){}
	
	
	public Member(String userId, String userPw, String name, String phone) {
		this.userId = userId;
		this.userPw = userPw;
		this.name = name;
		this.phone = phone;
	}
	public void prt() {
		System.out.println("이름 : "+this.name);
		System.out.println("전화번호 : "+this.phone);
	}
	
	
	
}
