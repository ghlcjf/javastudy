package ch08.classroom702;

//import ch08.classroom702.morning.Teacher;
//import ch08.classroom702.morning.Student;
// 조금 더 자주 사용하는 것을 import하고 덜 자주 쓰는 건 그때그때 17번 줄처럼 사용
import ch08.classroom702.morning.*; // 모닝 파일 안의 모든 클래스 사용.
public class Ex01_main {

	public static void main(String[] args) {
		
		//ch08.classroom702.morning.Teacher t1 = new ch08.classroom702.morning.Teacher();
		Teacher t1 = new Teacher();
		//ch08.classroom702.morning.Student s1 = new ch08.classroom702.morning.Student();
		Student s1 = new Student();
		
		ch08.classroo702.afternoon.Lecture l1 = new ch08.classroo702.afternoon.Lecture();
		ch08.classroo702.afternoon.Student s2 = new ch08.classroo702.afternoon.Student();
		
		// 예외 : 클래스를 사용할 때 패키지 경로를 안 적어도 사용 가능한 클래스들이 있다.
		// 자바 기본 패키지에 있는 클래스는 패키지 경로를 안 적어도 사용 가능하다.
		// java.lang.**;
		System.out.println("안녕하세요");
	}

}
