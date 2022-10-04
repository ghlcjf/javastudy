package ch12;

public class Ex01_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student01 s1 = new Student01(10, "홍길동");
		Student01 s2 = new Student01(10, "홍길동");
		
		
		
		if(/*s1==s2*/ s1.equals(s2)) { // == 객체의 주소값을 비교 
			// [Object로부터 상속받은 equals 메서드는 역할이 == 과 같다] 
			System.out.println("s1과 s2는 같습니다");
		}else {
			System.out.println("s1과 s2는 다릅니다");
		}
		
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		// 주소값이 다르다.
		
		
		
		s1=s2; // 대입 연산자 = >>>>> 주소값이 같아짐
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		
		if(/*s1==s2*/ s1.equals(s2)) { // == 객체의 주소값을 비교 
			// [Object로부터 상속받은 equals 메서드는 역할이 == 과 같다] 
			System.out.println("s1과 s2는 같습니다");
		}else {
			System.out.println("s1과 s2는 다릅니다");
		}
		
		
		
		
	}

}
