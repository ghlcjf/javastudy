package ch11;

public class MyException extends Exception {
	// 사용자 정의 예외 => 반드시 이름 끝에 Exception를 붙여야 한다.(약속)
	public MyException(String str) {
		super(str);
	}
	
}
