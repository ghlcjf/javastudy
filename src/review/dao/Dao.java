package review.dao;

import java.util.ArrayList;
import java.util.List;

public class Dao {
	private Dao() {}
	
	private static Dao dao = new Dao();
	
	public static Dao getInstance() {
		return dao;
	}
	
	
	
	// 
	
	public static List<review.dto.Member> ml = new ArrayList<>();
	public static List<review.dto.Board> bl = new ArrayList<>();
	
	
	public static boolean insertMember(review.dto.Member member) {
		
		int check = -999;
		
		for(int i=0;i<ml.size();i++) {
			if(ml.get(i).getUserId().equals(member.getUserId())) {
				check = -1;
			}
		}
		if(check!=-1) {
			ml.add(member);
			return true;
		}else {
			return false;
		}
		
	}


	public static review.dto.Member checkMember(String[] memberCheck) {
		for(int i=0;i<ml.size();i++) {
			if(ml.get(i).getUserId().equals(memberCheck[0])
					&& ml.get(i).getUserPw().equals(memberCheck[1])) {
				return ml.get(i);
			}
		}
		return null;
	}
	
	
	
	
}
