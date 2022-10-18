package ch19;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex06_main {

	public static void main(String[] args) throws Exception{
		// 기본타입 입출력
		// ( int long float double boolean char byte ...
		// => 전용 보조 스트림이 필요
		
		File f1 = new File("C:\\testStream\\bb.yy");
		
		FileOutputStream fos = new FileOutputStream(f1);
		DataOutputStream dos = new DataOutputStream(fos);
		// 보조 스트림은 메인 스트림을 매개값으로 받아서 사용해야 한다.
		
		dos.writeUTF("김길동");
		dos.writeInt(284);
		dos.writeDouble(94.67);
		
		dos.writeUTF("이길동");
		dos.writeInt(269);
		dos.writeDouble(89.67);
		
		
		dos.writeUTF("최길동");
		dos.writeInt(247);
		dos.writeDouble(82.33);
		
		dos.flush();
		dos.close();
		fos.close();
		
		System.out.println("기본타입 저장 완료");
		
		System.out.println("---------------------------------");
		System.out.println("저장된 기본 타입 읽어 오기");
		
		FileInputStream fis = new FileInputStream(f1);
		DataInputStream dis = new DataInputStream(fis);
		for(int i=0;i<3;i++) {
			String name = dis.readUTF();
			int sum = dis.readInt();
			double avg = dis.readDouble();
			
			System.out.println("이름 : "+name);
			System.out.println("총점 : "+sum);
			System.out.println("평균 : "+avg);	
		}
		
		dis.close();
		fis.close();
		System.out.println("기본 타입 입력 완료!!!!!!!!!!!!!!!!!!!!!!!!");
		
		
	}

}
