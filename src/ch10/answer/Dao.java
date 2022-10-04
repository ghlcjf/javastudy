package ch10.answer;

public class Dao {
	
	private Dao() {}
	
	private static Dao dao = new Dao();
	
	public static Dao getInstance() {
		return dao;
	}
	
	
	
	
	
	
	Member[] members = new Member[100];
	

	public void insertMember(Member member) {
		
		for(int i=0;i<members.length;i++) {
			if(members[i]==null) {
				members[i]= member;
				System.out.println("회원가입이 완료되었습니다.");
				break;
			}
		}
		
	}


	public Member checkMember(String[] check) {
		
		for(int i = 0;i<members.length;i++) {
			if(members[i]!=null) {
				if(members[i].getUserId().equals(check[0]) && members[i].getUserPw().equals(check[1])) {
					System.out.println("로그인 성공");
					return members[i];
				}
			}
		}
		return null;
		
	}
	
	
	
	
}
