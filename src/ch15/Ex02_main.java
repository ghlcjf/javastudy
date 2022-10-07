package ch15;

public class Ex02_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student(); // Student 객체를 사용하는 일반적인 방법.
		
//		{} 영역 잡을 때 사용
		Student s2 = new Student() { // 클래스의 영역..?
			int field;
			void method() {
				System.out.println("나는 Student입니다........");
			}
			@Override
			void method2() {
				System.out.println("나는 익명 자식 객체");
			}
			
			
			
			
		}; // Student 클래스가 아니다..어떤 클래스인가???!?!?!!? => 익명 객체
		 	// => Student의 자식 객체 (익명 자식 객체)
		
		s2.setName("홍길동");
		
		
		
		s2.method2();
		
		// 익명 자식 클래스 어디다 쓰냐 : 즉석에서 클래스를 만들어 쓰는 경우
		
		m1(new Student() {

			@Override
			void method2() {
				System.out.println("내가 원하는 것");
			}
			
		});
		
	}

	private static void m1(Student s) {
		// TODO Auto-generated method stub
		s.method2();
	}

}
