package ch14;

import java.util.Comparator;

public class CheckStudent implements Comparator<Student>{
	// 학생 점수 비교하기 위한 클래스
	
	
	@Override
	public int compare(Student o1, Student o2) {
		// 
		if(o1.getAvg()>o2.getAvg()) {
			return 999;
		}else if(o1.getAvg()<o2.getAvg()) {
			return -999;
		}
		return 0;
	}
	
	
	
}
