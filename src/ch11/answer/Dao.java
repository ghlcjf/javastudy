package ch11.answer;

public class Dao { 
	// Data Access Object : 데이터를 데이터베이스에 전달할 목적으로 작동되는 클래스
	// 우리는 데이터베이스를 안 배워서 데이터 저장용 배열을 가진 클래스로 사용할 것임
	// 동시에 외부로부터 데이터를 꺼내고 받을 기능(메서드)을 만들어서 사용 

	
	// 싱글턴 패턴 
	//생성자 못만들게
	private Dao() {}
	
	// 인스턴스 만들어 주고
	private static Dao dao = new Dao();
	
	// 밖에서 호출하면 dao 리턴
	public static Dao getInstance() {
		return dao;
	}
	
	
	//-----------------------------------------
	// 배열 준비
	private Member[] members = new Member[100];

	public void insertMember(Member member) {
		// 전달받은 member 인스턴스(객체)를 저장하는 메서드
		for(int i=0;i<members.length;i++) {
			if(members[i]==null) {
				members[i] = member;
				break; // 안걸어주면 100개에 다 저장됨!!!!!!!!!!!!!!!!!!!!!!!!
			}
		}
		
	}

	public Member checkMember(String[] loginInfo) {
		// 로그인하려고 받은 loginInfo 스트링 배열을 전달받아 확인하는 메서드
		
		
		for(int i=0;i<members.length;i++) {
			if(members[i]!=null) {
				if(members[i].getMemberId().equals(loginInfo[0]) &&
				   members[i].getMemberPw().equals(loginInfo[1])) {
					return members[i];
				}
			}
		}
		
		
		
		
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
