package review;

import java.util.function.Consumer;

public class Prt implements Consumer<Student>{

	@Override
	public void accept(Student t) {
		// 학생의 이름과 결과를 출력
		
		System.out.println(t.toString());
		
	}
	
	
	
	
}
