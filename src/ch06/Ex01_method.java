package ch06;

import java.util.Random;

public class Ex01_method {

	public static void main(String[] args) { // 메인 메서드
		// 
		greeting();
		
		int a = 3;
		int b = 5;
		int result = add(a,b);
		System.out.println("합계 : "+result);
		
		
		String name = "홍길동";
		String job = "의적";
		
		introduce(name,job);
		
		int num = lotto();
		System.out.println("임의의 번호 : "+num);
	}
	
	
	private static int lotto() {
		// 입력은 없지만 반환되는 값이 있는 메서드
		Random r =new Random();
		int num = r.nextInt(45)+1;
		return num;
	}


	private static void introduce(String name, String job) { //매개값은 있는데 반환되는 데이터가 없는 메서드.
		System.out.println("이름 : "+name);
		System.out.println("직업 : "+job);
		
	}


	// 메서드 안에는 또 다른 메서드를 만들 수 없다.
	
	public static void greeting() { // 그리팅 메서드
		System.out.println("안녕하십니까?");
	}
	
	private static int add(int a,int b) {
		int c = a+b;
		return c;
	}
	
	

}
