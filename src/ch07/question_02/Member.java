package ch07.question_02;

public class Member {
	private String userId;
	private String userPw;
	private String username;
	private String userphone;
	
	public void userInfo() {
		System.out.println("이름 : "+this.username);
		System.out.println("전화번호 : "+this.userphone);
	}

	
	public Member(String userId, String userPw, String username, String userphone) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.username = username;
		this.userphone = userphone;
	}


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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserphone() {
		return userphone;
	}

	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}
}
