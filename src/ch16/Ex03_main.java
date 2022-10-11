package ch16;

public class Ex03_main {

	public static void main(String[] args) {
		// 매개값 X, 반환값 O
		
		Ex03UnparameterReturn x;
//		x = ()->{return 10;};
//		x = ()->10;
		x = ()->{
			int a=11;
			return a;
			};
		
		int y = x.method();
		
		System.out.println("반환값 : "+y);
		
		
		
	}

}
