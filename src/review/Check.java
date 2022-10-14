package review;

import java.util.function.Function;

public class Check implements Function<Student,Student>{

	@Override
	public Student apply(Student t) {
		// 점수를 가진 학생 객체를 받아서 결과를 추가한 다음 반환하는 메서드
		
		if(t.getScore()>=60) {
			t.setResult("합격");
		}else {
			t.setResult("불합격");
		}
		return t;
	}

}
