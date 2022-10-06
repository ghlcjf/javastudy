package ch14;

import java.util.Iterator;
import java.util.TreeSet;

public class Ex06_main {

	public static void main(String[] args) {
		
//		TreeSet<Student>
//		TreeSet에 객체를 저장하면 자동으로 정렬이 된다.
//		
//		직접 만든 객체를 저장하면 어떤 객체가 더 큰지에 대한 기준이 없기 때문에 에러 발생!
//		
//		객체의 비교 기준을 만들어 주는 방법 
//		
//		1) 비교를 직접할 클래스에게 비교 기준을 만드는 방법. 
//			-> 사용할 클래스에게 Comparable 인터페이스를 구현한 후 compareTo()메서드를 오버라이드하면 된다.
//				자기자신.compareTo(비교대상)
//				자기자신이 더 크다면 "양수" '오름차순'
//				비교대상이 더 크다면 "음수"
//		 		같다면 "0"
//		
//		 2) 제 3의 클래스에게 비교 기준을 만드는 방법. 
//			-> 제 3의 클래스에게 Comparator 인터페이스를 구현한 후 compare() 메서드를 오버라이드하면 된다.
//				compare(A,B)
//				A가 더 크다면 "양수" '오름차순'
//				B가 더 크다면 "음수" '내림차순'으로 바꾸려면 양수 음수를 바꿔주면 됨.
//		 		같다면 "0"
//		
		
		TreeSet<Student> students = new TreeSet<>(new CheckStudent());
		
		students.add(new Student("고길동",new int[] {78,64,82}));
		students.add(new Student("김길동",new int[] {85,71,64}));
		students.add(new Student("이길동",new int[] {74,69,57}));
		students.add(new Student("박길동",new int[] {74,77,95}));
		students.add(new Student("홍길동",new int[] {68,95,84}));
		
		System.out.println("전체 학생 수 : "+students.size());
		
		System.out.println("5등 : "+students.first().getName());
		System.out.println("1등 : "+students.last().getName());
		
		
		for(Student s:students) {
			System.out.println("학생 이름 : "+s.getName());
		}
		
		
		
		
		
		
		
		
	}

}
