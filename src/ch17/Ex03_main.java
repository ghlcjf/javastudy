package ch17;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Ex03_main {

	public static void main(String[] args) {
		// 스트림
		// 2. 중간연산
		
		List<Student> list = new ArrayList<>();
		list.add(new Student("둘리",1,10,74));
		list.add(new Student("희동",2,10,65));
		list.add(new Student("또치",3,10,57));
		list.add(new Student("도우너",1,20,48));
		list.add(new Student("길동",2,20,59));
		list.add(new Student("마이클",3,20,68));
		
		Stream<Student> stuList = list.stream();
		
		
		
		//	1) filter() => 매개값은 predicate 인터페이스를 구현한 객체 => 람다식
		//		예시. 3반 학생들만 필터링
		Stream<Student> stuStream = stuList.filter(
									(student)->{return student.getBan()==3;}
									);
		
		
		
		//	2) map()	=> 매개값은 Function 인터페이스를 구현한 객체 => 람다식
		//	[기본타입 스트림의 경우 객체 반환하는 메서드 mapToObj()]
		
		//		예시. 총점이 60점을 넘으면 합격,안되면 불합격
		//			 Student 클래스가 들어가서 String이 반환
		Stream<String> stuResult = 
				stuList.map(
						(student)->{return student.getTotalScore()>60?"합격":"불합격";}
						);
		
		
		
		//------------------------------------------------------------
		
		// 중간 연산의 결과는 여전히 Stream => 중간 연산을 메서드 체이닝으로 연달아 사용 가능하다.
		
		// 2반 학생 중에 점수가 60 이상인 학생은 결과를 "합격"으로, 60 미만인 학생을 결과를 "불합격"으로
		// 저장해서 학생 객체를 반환하도록 구성
		
		Stream<Student> stuResult2 = stuList.filter(student->student.getBan()==2)
				.map(student->{
					if(student.getTotalScore()>=60) {
						student.setResult("합격");
					}else {
						student.setResult("불합격");
					}
					return student;
				});
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

	static class Student{
		private String name;
		private int ban;
		private int stuNum;
		private int totalScore;
		private String result;
		
		public String getResult() {
			return result;
		}
		public void setResult(String result) {
			this.result = result;
		}
		public Student(String name, int ban, int stuNum, int totalScore) {
			this.name = name;
			this.ban = ban;
			this.stuNum = stuNum;
			this.totalScore = totalScore;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getBan() {
			return ban;
		}
		public void setBan(int ban) {
			this.ban = ban;
		}
		public int getStuNum() {
			return stuNum;
		}
		public void setStuNum(int stuNum) {
			this.stuNum = stuNum;
		}
		public int getTotalScore() {
			return totalScore;
		}
		public void setTotalScore(int totalScore) {
			this.totalScore = totalScore;
		}
		
	}
	
	
}
