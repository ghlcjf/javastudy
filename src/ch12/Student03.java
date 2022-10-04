package ch12;

public class Student03 {

	private int studentNum;
	private String studentName;

	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public Student03() {
		System.out.println("인스턴스가 만들어졌습니다.");
	}
	
	
}
