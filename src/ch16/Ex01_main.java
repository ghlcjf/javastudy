package ch16;

public class Ex01_main {

	public static void main(String[] args) {
		// 함수적 인터페이스의 람다식 표현
		
		// 매개값 X, 반환값 X 
		
		Ex01UnparameterUnreturn x;
//		x = ()->{System.out.println("헬로 람다식~!");};
//		x = ()->System.out.println("한 줄이라면 중괄호 생각 가능");
		x = ()->{
			System.out.println("헬로 람다식~!");
			System.out.println("여러 줄이라면 이런 식으로 작성 가능");
			};
		x.method();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
