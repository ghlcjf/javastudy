package classanswer02;

public class Studentinfo {
	String name = "";
	int ban = 0;
	int no = 0;
	int kor = 0;
	int eng = 0;
	int math = 0;
	
	Studentinfo(String name,int ban,int no, int kor,int eng,int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	
	Studentinfo() {
		// 생성자가 없을 때는 자동으로 기본타입 생성자를 만들어 준다.
		// 그러나 생성자가 있는 경우 기본타입 생성자를 안 만들어주기 때문에 따로 만들어줘야 한다.
	}

	public int getTotal() {
		int sum = kor+eng+math;
		return sum;
	}
	public float getAverage() {
		float avg = (float) (Math.round(getTotal()/3.0*10)/10.0);
		// float avg = Math.round(getTotal()/3.0f*10)/10.0f
		return avg;
	}
	public void info() {
		System.out.println("이름 : "+this.name);
		System.out.println("반 : "+this.ban);
		System.out.println("번호 : "+this.no);
		System.out.println("국어점수 : "+this.kor);
		System.out.println("영어점수 : "+this.eng);
		System.out.println("수학점수 : "+this.math);
		System.out.println("총점 : "+this.getTotal());
		System.out.println("평균 : "+this.getAverage());
	}
}
