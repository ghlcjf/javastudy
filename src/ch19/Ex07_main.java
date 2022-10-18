package ch19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Ex07_main {

	public static void main(String[] args) throws Exception{
		// 인스턴스를 파일로 입출력하기 => 보조 스트림이 필요하다.
		// 메서드는 제외 / 인스턴스 멤버 변수들이 대상
		
		File f = new File("C:\\testStream\\Student.yyy");
		System.out.println("인스턴스를 파일로 저장하겠습니다.");
		
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Student s = new Student();
		
		s.name = "루피";
		s.score = 55;
		s.schoolName = "밀집모자 해적단";
		s.ban.banNum = 1;
		s.ban.teacherName = "샹크스";
		s.rank = 1;
		
		
		oos.writeObject(s);
		
		oos.flush();
		oos.close();
		fos.close();
		System.out.println("인스턴스를 파일로 저장 완료~");
		System.out.println("--------------------------------------------");
		
		// 아무 인스턴스나 직렬화(?)가 되는 것이 아니고 Serializable 인터페이스를 구현한 클래스만 가능
		// Student 클래스뿐만 아니라 인스턴스 멤버로 있는 ban의 클래스 Ban도 직렬화해야 함
		
		System.out.println("인스턴스 파일로부터 읽어오기");
		Student.schoolName = "하트 해적단";
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student s2 = (Student)ois.readObject(); // 오브젝트로 읽어오기 때문에 형변환 필요
		
		
		
		System.out.println("학생 이름 : "+s2.name);
		System.out.println("학생 점수 : "+s2.score);
		System.out.println("학교 이름 : "+s2.schoolName);
		System.out.println("학생 반 : "+s2.ban.banNum);
		System.out.println("학생 선생님 : "+s2.ban.teacherName);
		System.out.println("현상금 등수 : "+s2.rank);
		
		
		
		System.out.println("읽기 완료");
		
		
	}

}
