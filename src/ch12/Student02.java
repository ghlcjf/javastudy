package ch12;

public class Student02 {
	
	private int studentNum;
	private String studentName;
	
	public Student02 (int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) { // 비교 기준을 직접 만들겠습니다라는 뜻
//		// TODO Auto-generated method stub
//		return super.equals(obj);
		
		if(obj instanceof Student02) { // 변수 안에 있는 데이터가 Student02로 형변환이 되는가
			Student02 s2 = (Student02)obj; // obj 변수를 Student02로 형변환
			boolean check = this.studentNum == s2.getStudentNum();
			return check;
		}else {
			return false;
		}
	}
	
	// 해시코드 : 어떤 데이터의 정보를 정수화(16진수  숫자화)해서 표시하는 방법.
	//		 - 간단하게 비교할 때 사용 또는 데이터의 위/변조 체크용으로 사용
	// Object 클래스의 hashcode()는 주소값을 이용해서 표시
	// 일반적인 사용법 : 
	//	- 실무 : 비밀번호를 어떻게 저장하는가? 해시코드로 저장.
	//	- 이론(java) : 객체 비교할 때 사용
	//				: 수많은 객체를 비교해서 일치 여부를 판별할 때 1차 감별의 역할
	//				: 해시코드 값이 다르다 => 두 객체가 무조건 다르다라고 판별
	//				: 해시코드 값이 같다    => 두 객체는 같을 가능성이 매우 높다.
	//							   => .equals()를 통해서 실제 같은지를 판별
	
	

	@Override
	public int hashCode() {
		// 객체를 알 수 있는 정수값을 반환하는 것
		return super.hashCode();
	}

	@Override
	public String toString() {
		// 객체 내부의 정보를 문자열 형태로 내보내는 것
		return "번호 : "+this.studentNum+"이름 : "+this.studentName;
	}
	
	
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
	
	
}
