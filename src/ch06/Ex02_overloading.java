package ch06;

public class Ex02_overloading {

	public static void main(String[] args) {
		
		info("둘리");
		info("또치",5);
		info("아이디","비밀번호는 비밀이야");
		info(5,"안알려조");

	}
	
	
	private static void info(String name) {
		System.out.println("이름 : "+name);
	}
	private static void info(String name,int age) {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
	}
	private static void info(String id,String pw) {
		System.out.println("아이디: "+id);
		System.out.println("비밀번호 : "+pw);
	}
	public static void info(int page, String title) {
		System.out.println("페이지 : "+page);
		System.out.println("제목 : "+title);
	}
	
}
