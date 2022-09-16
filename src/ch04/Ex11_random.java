package ch04;

public class Ex11_random {

	public static void main(String[] args) {
		// 임의의 숫자를 만드는 방법.=> 로또번호 1~45 사이의 임의의 수
		// 1) Math.random()을 이용한 방법
		Math.random(); // 0.0 <= x < 1.0 사이의 실수형 숫자
		
		
		// 임의의 수 범위 지정 방법.
		// 0.0 <= Math.random < 1.0 사이의 실수형 숫자
		// => 45까지 
		
		//   0.0*45 <= Math.random*45 < 1.0*45
		//   0.0 <= Math.random*45 < 45.0
		// => 추출되는 값을 정수로
		
		//   (int)0.0 <= (int)Math.random*45 < (int)45.0
		// => 0 <= (int)Math.random*45 < 45
		
		//   0+1 <= (int)Math.random*45+1 < 45+1
		//   1 <= (int)(Math.random*45)+1 < 46 (1~45)
		
		// 1~45의 임의의 수
		int lotto = (int)(Math.random()*45)+1;
		System.out.println("로또 번호 : "+lotto);

	}

}
