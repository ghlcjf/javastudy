package ch07.question_02;

public class Dao {

	private Dao() {}
	
	private static Dao dao = new Dao();
	
	public static Dao getInstance() {
		return dao;
	}
	
	
	//배열 준비
	Member[] members = new Member[100];
}
