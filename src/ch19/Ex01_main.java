package ch19;

import java.io.IOException;
import java.io.InputStream;

public class Ex01_main {

	public static void main(String[] args) throws Exception {
		// 입출력 스트림
		
		// 1) 콘솔 입출력
		
		InputStream is = System.in;
		// 콘솔은 윈도우의 영역 윈도우로부터 전달받은 데이터를 자바로 옮길건데
		// 공유하기 위해 사용하는 클래스 = System...
		
//		char cha = (char)is.read(); 
		// 윈도우 콘솔로부터 데이터를 받아오는 메서드.
		// 1바이트 크기의 데이터를 입력받는 메서드. (영문자 기준으로 딱 한글자만 전송받음 아무리 많이 써도..)
		
//		System.out.println("입력값 : "+cha);
		
		System.out.println("-------------------------------------");
		// 한글 등 글자 당 2바이트 이상되는 문자를 입력받기 위해서는 String 객체가 필요
		
		// read() 한 번에 1바이트인데 다수의 바이트를 담기 위한 수레
		byte[] cart = new byte[10];
		
		is.read(cart);
		String str1 = new String(cart);
		
		
		System.out.println("입력값 : "+str1);
		
	}
	
}
