package ch16;

public class Ex04_main {

	public static void main(String[] args) {
		// 매개값 O, 반환값 O
		
		
		Ex04ParameterReturn x;
		
//		x = (a,b)->{return a+b;};
		x = (a,b)->a+b;
		x = (a,b)->{
			int result = a+b;
			return result;
			};
		
		
		
		int r = x.method(3, 5);
		System.out.println("입력받은 두 수의 합 : "+ r);
	}

}
