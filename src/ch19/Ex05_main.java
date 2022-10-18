package ch19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex05_main {

	public static void main(String[] args) throws Exception{
		// buffered 성능 체크
		
		long start = 0, end = 0;
		
		File f1 = new File("C:\\testStream\\a\\fox.jpg"); // 읽어 올 파일
		File f2 = new File("C:\\testStream\\b\\whitefox.jpg"); // 출력 할 파일
		
		FileInputStream fis = new FileInputStream(f1);
		FileOutputStream fos = new FileOutputStream(f2);
		
		// 수레 준비
		
		byte[] cart1 = new byte[50];
		
		int amount;
		System.out.println("버퍼를 사용하지 않은 경우");
		start =System.nanoTime();
		while((amount=fis.read(cart1))!=-1) {
			//System.out.println(new String(cart1));
			fos.write(cart1,0,amount);
		}
		fos.flush();
		end = System.nanoTime();
		System.out.println("측정시간 : "+(end-start)+"ms");
		
		
		System.out.println("========================================");
		System.out.println("버퍼를 사용한 경우");
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		// 인풋스트림 fis -> 버퍼드인풋스트림
		// 아웃풋스트림 fos -> 버퍼드아웃풋스트림
		
		
		start = System.nanoTime();
		while((amount=bis.read(cart1))!=-1) {
			//System.out.println(new String(cart1));
			bos.write(cart1,0,amount);
		}
		bos.flush();
		end = System.nanoTime();
		System.out.println("측정시간 : "+(end-start)+"ns");
		
		
		
		bis.close();
		bos.close();
		// 메인스트림 닫기 전 보조스트림 먼저 닫아야 함
		fos.close();
		fis.close();
		System.out.println("잘 복사되었습니다!");
		
		
	}
	
	
	
}
	

