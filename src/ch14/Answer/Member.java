package ch14.Answer;

public class Member {
	private String userId;
	private String userPw;
	private String userName;
	private String userPhone;
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	
	
	public Member(String userId, String userPw, String userName, String userPhone) {
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		this.userPhone = userPhone;
	}
	
	
	public void info() {
		System.out.println("이름 : "+this.userName);
		System.out.println("전화번호 : "+this.userPhone);
	}
	
	
	
	
	
}
