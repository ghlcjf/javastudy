package ch03;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 부호연산  => 단항연산
		int a = 5;
		a = -a; // -5
		// a = +a;
		
		
		// 증감연산  =>
		int num = 10;
		num = num + 1; // 1 증가, 11 
		num++; // 1 증가, 12
		System.out.println("num의 값 : "+num);
		++num; // 1 증가, 13
		System.out.println("num의 값 : "+num);
		num = num - 1; // 1 감소, 12
		System.out.println("num의 값 : "+num);
		num--; // 1 감소, 11
		System.out.println("num의 값 : "+num);
		--num; // 1 감소, 10
		System.out.println("num의 값 : "+num);
		
		
		//-----------------------------------------------
		
		int num1 = 20;
		int num2 = 30;
		
		int result1 = num1++ * ++num2;
		//과연 result1에는 어떤 값이 들어올 것인가.
		// num++ 선 처리 후 증감
		// ++num 선 증감 후 처리
		// 20 * 31 곱셈 처리 후 21이 됨.
		
		
		
		System.out.println("result의 값 : "+result1);
		System.out.println("num1의 값 : "+num1);
		System.out.println("num2의 값 : "+num2);
		
		
		// 대입연산자 : '='
		// 복합대입연산자 (산술+대입)
		int b = 10;
		b = b+1;
		b += 1; // 두 개가 같은 거임.
		
		b = b+5;
		b += 5; // 두 개가 같은 거임.
		
		
		//비교연산자 true or false
		// <, >, >=, <=, ==, !=
		 
		
		
		
		//--------------------------------------------------------
		//문자열 비교
		
		String name1 = new String("홍길동"); // String 문자열은 새롭게 데이터를 만들지 않는다.
		String name2 = new String("홍길동");
		
		System.out.println("name1 == name2 : " + (name1==name2));
		System.out.println("name1.equals(name2) : " + (name1.equals(name2)));
		
		//-----------------------------------------------------------
		// 논리연산 : && || ! true 와 false를 연산하기 위한 연산자.
		// 주로 비교연산과 같이 쓰인다.
		// 기본적으로 불필요한 연산을 제거하기 때문에 무조건 연산 시키고 싶다면 연산자를 하나씩만 쓰면 된다.
		// % | 이런 식으로..
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
