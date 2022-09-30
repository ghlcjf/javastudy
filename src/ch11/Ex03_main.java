package ch11;

public class Ex03_main {
	

	public static void main(String[] args) throws Exception{
		// 예외 처리 - 간접 처리
		
		method1();
	}

	private static void method1() throws NumberFormatException,NullPointerException{//2개 이상 떠넘기기 가능
//		try {
			method2(); //<- 이 위치로 예외를 떠넘겨라(throws)
//		}catch(NumberFormatException e) {
//			System.out.println("예외를 떠넘겨받은 method1이 처리");
//		}
//		
	}

	private static void method2() throws NumberFormatException{
		String data = "안녕";
		int dataValue = Integer.parseInt(data);
		
	}

}
