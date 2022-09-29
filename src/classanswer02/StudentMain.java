package classanswer02;

public class StudentMain {

	public static void main(String[] args) {
		Studentinfo student1 = new Studentinfo();
		student1.name = "고길동";
		student1.ban = 3;
		student1.no = 17;
		student1.kor = 92;
		student1.eng = 63;
		student1.math = 74;
		
		System.out.println("이름 : "+student1.name);
		System.out.println("총점 : "+student1.getTotal());
		System.out.println("평균 : "+student1.getAverage());

		
		
		Studentinfo student2 = new Studentinfo("홍길동", 3, 17, 92, 63, 74);
		
		student2.info();
	}

}
