package ch07.question_02;

public class Student {
	private String name;
	private int[] scores = new int[3];
	private int total;
	private double avg;
	private int rank;
	public Student(String name, int[] scores) {
		this.name = name;
		this.scores = scores;
		this.total = sum();
		this.avg = avg();
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
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
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
	
	public int sum() {
		int sum = 0;
		for(int i=0;i<this.scores.length;i++) {
			
			sum += this.scores[i];
			
		}
		return sum;
	}
	
	public double avg() {
		double avg = total/(scores.length*1.0);
		return avg;
	}
	public void info() {
		System.out.println("이름 : "+this.name);
		System.out.println("국어 점수 : "+this.scores[0]);
		System.out.println("국어 점수 : "+this.scores[1]);
		System.out.println("국어 점수 : "+this.scores[2]);
		System.out.println("총       점 : "+this.total);
		System.out.println("평       균 : "+this.avg);
	}
	
	
	
}
