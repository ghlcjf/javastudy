package ch11;

public class Re03_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			method1();
		}catch(Exception e) {
			System.out.println("예외 발생~~~~~~~");
		}finally {
			System.out.println("무조건 실행");
		}
	}

	
	
	static void method1() throws NullPointerException{
		String data = "null";
		System.out.println(data.toString());
	}
}
