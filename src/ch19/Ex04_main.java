package ch19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex04_main {

	public static void main(String[] args) throws Exception{
		// 바이트 데이터 입력 / 출력
		
		File f1 = new File("C:\\testStream\\a\\fox.jpg"); // 읽어 올 파일
		File f2 = new File("C:\\testStream\\b\\whitefox.jpg"); // 출력 할 파일
		
		FileInputStream fis = new FileInputStream(f1);
		FileOutputStream fos = new FileOutputStream(f2);
		
		// 수레 준비
		
		byte[] cart1 = new byte[50];
		
		int amount;
		
		while((amount=fis.read(cart1))!=-1) {
			//System.out.println(new String(cart1));
			fos.write(cart1,0,amount);
		}
		fos.flush();
		fos.close();
		fis.close();
		System.out.println("잘 복사되었습니다!");
	}
	
}
