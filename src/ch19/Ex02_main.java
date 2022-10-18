package ch19;

import java.io.OutputStream;
import java.util.Scanner;

public class Ex02_main {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {
		// 입출력 스트림
		
		// 2) 콘솔 출력
		
		OutputStream os = System.out;
		
//		int a = 66;
//		os.write(a); // 1바이트 출력용
		
		// 다수의 바이트짜리 글자를 출력하려면 수레가 필요
		
		String str1 = "세종대왕";
		byte[] cart = str1.getBytes();
		
		os.write(cart);
		
		
		os.close();
	
	}
}
