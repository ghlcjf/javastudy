package ch19;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex03_main {

	public static void main(String[] args) throws Exception{
		// 파일 입출력
		
		// 1. 텍스트 (문자)
		//		1) 입력
		//		2) 출력
		
		// 2. 이미지 
		//		1) 입력
		//		2) 출력
		
		//-----------------------------------------------------------------
		
		// 1) 텍스트 파일 입력
		
		File f = new File("C:\\testStream\\Ex04_Review.java");
		
		FileReader fr = new FileReader(f); 
		
		// 수레를 이용
		char[] cart1 = new char[100];
		int amount;
		while((amount = fr.read(cart1))!=-1) { // 카트에 담긴 양이 -1이 될 때까 반복
			; // 한 글자(char) 단위로 데이터를 가져오는 메서드
			String str1 = new String(cart1);
			System.out.print(str1);	
		}
		
		fr.close();
		
		
		// 2) 텍스트파일 출력
		
		File f2 = new File("C:\\testStream\\test.txt");
		FileWriter fw = new FileWriter(f2); 
				
		fw.write("여러분 고생많으셨어요\n");
		fw.write("다음 시간에 다시 만나요\n");
		
		fw.flush(); // 출력용 빨대 비우기
		fw.close();
		
		System.out.println("파일에 저장이 되었습니다.");
		
		
	}
	
}
