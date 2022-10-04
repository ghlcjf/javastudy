package ch12;

public class Ex03_main {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// 클래스로부터 인스턴스를 만드는 방법.
		// 1. new 생성자();
		
		// 2. 클래스로부터 메타 정보(필드,생성자,메서드 등 클래스에 관련된 모든 정보)를 통해 인스턴스를 만드는 방법.
		
		//	- 메타 정보를 읽어들이는 방법.
		//		1) 인스턴스명.getClass();
		//		2) 클래스명.class; 
		//		3) Class.forName("패키지명.클래스명");
		//	 => Class 타입의 인스턴스를 만들게 된다.
		
		//	- 메타 정보를 저장한 인스턴스로부터 해당 인스턴스를 생성
		
		
		Student03 s1 = new Student03(); // 일반적으로 인스턴스를 만드는 방법.
		
		Class stu01 = s1.getClass();
		Class stu02 = Student03.class;
		Class clazz = Class.forName("ch12.Student03");
		
		
		Student03 s2 = (Student03)stu01.newInstance();
		
		
		
		
		
		
		
	}

}
