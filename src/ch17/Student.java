package ch17;

public class Student {
	private String name; // 학생 이름
	private int score; // 점수
	private String result; // 결과
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
	
	
	@Override
	public String toString() {
		return this.name+"님의 시험 결과는 "+result+"입니다..";
	}
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	
	
	
}
