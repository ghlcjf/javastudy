package ch12;

public class Ex02_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student02 s1 = new Student02(10,"고길동");
		Student02 s2 = new Student02(10,"홍길동");
		
		if(s1==s2) { // == : equals랑 상관없이 주소값 비교
			System.out.println("s1과 s2는 같은 사람입니다.");
		}else {
			System.out.println("s1과 s2는 다른 사람입니다.");
		}
		
		
		
		if(s1.equals(s2)) { // 
			System.out.println("s1과 s2는 같은 사람입니다.");
		}else {
			System.out.println("s1과 s2는 다른 사람입니다.");
		}
		
		System.out.println("-----------------------------------------");
		System.out.println(s1);
		System.out.println(s2.toString());
		// toString() 객체 내부의 정보를 문자열로 보여줄 때 사용하는 메서드
		// 오버라이드가 안 되어 있다면 => 객체의 해시코드를 출력한다.
		// 객체의 출력하고자 하는 정보가 있다면 오버라이드 하면 된다.
		
		

	}

}
