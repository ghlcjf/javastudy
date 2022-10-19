package ch19;

import java.io.Serializable;

public class Student implements Serializable{

	String name;
	int score;
	static String schoolName;
	// 정적 정보는 사실 인스턴스 정보가 아니라서 저장이 안 됨
	// 인스턴스 정보로 직력화되지 않는다.
	
	Ban ban = new Ban();
	transient int rank; // 직렬화 거부 필드 (transient 키워드)
}
