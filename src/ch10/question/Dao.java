package ch10.question;

public class Dao {
	
	
	// 다른 클래스에서 Dao 클래스의 생성자 못 만들게 private 생성자 
	private Dao() {}
	
	// private 인스턴스 만들어 주고
	private static Dao dao = new Dao();
	
	// public으로 인스턴스 내보낼 수 있는 메서드 생성
	public static Dao getInstance() {
		return dao; // 인스턴스 리턴
	}
	
	//------------------------------------------
	// 배열 준비 : Dao 클래스가 데이터 저장 목적이니까/원래는 데이터 베이스로 보내는 역할임
	
	private Member[] members = new Member[100];

	public  void insertMember(Member member) {
		// 전달받은 member를 저장하는 메서드
		for(int i=0;i<members.length;i++) {
			if(members[i]==null) {
				members[i] = member;
				break;
			}
		}
		
	}

	public Member checkMember(String[] loginInfo) {
		// 로그인 아이디 비밀번호 확인
		for(int i=0;i<members.length;i++) {
			if(members[i]!=null) {
				if(members[i].getUserId().equals(loginInfo[0]) && 
				   members[i].getUserPw().equals(loginInfo[1])) {
					
					return members[i];
					// 있다면 리턴
				}
				
			}
			
		}
		return null;
		// 없다면 리턴 널
		
	}
	
	
	
	
	
	
	
	
}
