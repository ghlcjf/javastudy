package review;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Ex01_Review {

	public static void main(String[] args) {
		// 10명의 학생 성적을 입력받아 합격,불합격을 통보해 봅시다.
		
		
		// 1) 학생 객체(클래스) : 이름 점수 결과를 저장하는 클래스
		// 2) 리스트에 10명의 학생 이름과 점수를 저장
		// 3) 학생 점수를 통해 결과를 입력하도록 한다.
		// 4) 학생 성적 결과를 발표
		
		
		List<Student> lists = new ArrayList<>();
		
		
		
		Student s1 = new Student("루피",37);
		Student s2 = new Student("조로",69);
		Student s3 = new Student("나미",46);
		Student s4 = new Student("상디",79);
		Student s5 = new Student("쵸파",34);
		Student s6 = new Student("로빈",98);
		Student s7 = new Student("프랑키",62);
		Student s8 = new Student("징베",77);
		Student s9 = new Student("브룩",52);
		Student s10 = new Student("비비",99);
		
		lists.add(s1);
		lists.add(s2);
		lists.add(s3);
		lists.add(s4);
		lists.add(s5);
		lists.add(s6);
		lists.add(s7);
		lists.add(s8);
		lists.add(s9);
		lists.add(s10);
		
		System.out.println("--------------------------------------");
		// 스트림 없이 원하는 결과를 만든느 방법
		// 일반적인 for문 이용 방법
		for(int i=0;i<lists.size();i++) {
			if(lists.get(i).getScore()>=60) {
				lists.get(i).setResult("합격!");
			}else {
				lists.get(i).setResult("불합격!");
			}
			System.out.println(lists.get(i).toString());
		}
//		
//		forEach문 사용 방법
		for(Student s:lists) {
			if(s.getScore()>=60) {
				s.setResult("합격!");
			}else {
				s.setResult("불합격!");
			}
			System.out.println(s.toString());
		}
		
		
		
		
		System.out.println("--------------------------------------");
		
		// 표준 함수적 인터페이스를 구현한 클래스의 인스턴스를 사용한 방법
		Check c = new Check();
//		c.apply(t);가 있는 클래스
		Prt p = new Prt();
//		p.accept(t);가 있는 클래스
		
		lists.stream() // 1. 스트림 만들기
				.map(c) // 2. 중간 연산 , 매개로 받아온 인스턴스 안에서 어플라이 메서드 호출해서 작동하는 메서드
				.forEach(p); // 3. 최종 연산
				
		System.out.println("--------------------------------------");
		
		// 표준 함수적 인터페이스를 구현한 익명 구현 객체를 사용한 방법.
		
		lists.stream() 
			.map(new Function<Student,Student>(){

				@Override
				public Student apply(Student t) {
					
						if(t.getScore()>=60) {
							t.setResult("합격");
						}else {
							t.setResult("불합격");
						}
						return t;
					}
				
			}) 
			.forEach(new Consumer<Student>() {

				@Override
				public void accept(Student t) {
					System.out.println(t.toString());
				}
				
			});
		
		
		
		
		System.out.println("--------------------------------------");
		// 함수적 인터페이스를 구현한 람다식
		
		

		lists.stream() 
			.map((t)->{
					if(t.getScore()>=60) {
						t.setResult("합격");
					}else {
						t.setResult("불합격");
					}
					return t;
			}) 
			.forEach((t)-> System.out.println(t.toString()));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
