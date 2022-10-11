package ch16;

public class Ex02_main {

	public static void main(String[] args) {
		// 매개값 O, 반환값 X
		
		Ex02ParameterUnreturn x;
//		x = (y) -> {System.out.println("입력받은 숫자 : "+y);}; 
		x = y -> System.out.println("입력받은 숫자 : "+y); 
		// 메서드를 실행하는 게 아닌 메서드를 만드는 중이기 때문에
		// (y)로 변수 이름을 넣어주고
		// 메서드를 실행할 때 매개값을 넣어줘야 한다.
		// 매개값, 실행문 다 하나씩이라서 (){}생략 가능
		// 실행문 여러 줄일 떄 밑의 방식으로 입력 가능.
		x = y -> {
			int r = y+5;
			System.out.println("입력받은 숫자에 5를 더한 값 : "+r);
			};
		
			
		x.method(6);
		// 메서드를 실행할 때 매개값 int 넣어주기
	}

}
