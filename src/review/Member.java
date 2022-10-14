package review;

public class Member {
	private String name;
	private String userId;
	private String userPw;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public Member(String name, String userId, String userPw) {
		super();
		this.name = name;
		this.userId = userId;
		this.userPw = userPw;
	}
	
}
