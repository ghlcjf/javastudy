package ch07.question;

public class Student {
	private String name;
	private int[] scores;
	private int totalScore;
	private double avg;
	private int rank = 1;
	
	public Student() {}
	
	public Student(String name, int[] scores) {
		this.name = name;
		this.scores = scores;
//		this.totalScore = sum2(); 선생님 코드
		sum(); // 생성자가 만들어 지는 동시에 총점과 평균을 구하는 메소드 호출
		avg();
		this.rank = 1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	
	
	
	

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	
	public void sum() { // 클래스 안에서 메소드를 만드는 경우 ()안의 값을 넣을 필요가 없음
		int sum = 0;
		for(int i=0;i<scores.length;i++) {
			sum += scores[i];
		}
		this.totalScore = sum;
		
	}
//	private int sum2() { 선생님 코드
//		int sum2 = 0;
//		for(int i = 0;i<scores.length;i++) {
//			sum2 += scores[i];
//		}
//		return sum2;
//	}
	
	public void avg() {
		
		this.avg = Math.round(this.totalScore/(scores.length*1.0)*100)/100.0;
		
		
	}
	
	
	public void info() {
		System.out.println("이름 : "+this.name);
		System.out.println("국어 점수 : "+this.scores[0]);
		System.out.println("영어 점수 : "+this.scores[1]);
		System.out.println("수학 점수 : "+this.scores[2]);
		System.out.println("총       점 : "+this.totalScore);
		System.out.println("평       균 : "+this.avg);
		System.out.println("석       차 : "+this.rank);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
