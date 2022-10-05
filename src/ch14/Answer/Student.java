package ch14.Answer;

public class Student {

	private String name;
	private int[] scores = new int[3];
	private int sum;
	private double avg;
	private int rank = 1;
	
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
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
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
	public Student(String name, int[] scores) {
		this.name = name;
		this.scores = scores;
		this.sum = sum();
		this.avg = this.sum/(scores.length*1.0);
		
	}
	
	private int sum() {
		
		for(int i=0;i<scores.length;i++) {
			sum+=scores[i];
		}
		
		return sum;
	}
	
	public void info() {
		System.out.println("이름 : "+this.name);
		System.out.println("국어 점수 : "+this.scores[0]);
		System.out.println("영어 점수 : "+this.scores[1]);
		System.out.println("수학 점수 : "+this.scores[2]);
		System.out.println("총점 : "+this.sum);
		System.out.println("평균 : "+this.avg);
	}
	
	
}
