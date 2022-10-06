package ch14;

public class Student /*implements Comparable<Student>*/{
	private String name;
	private int[] scores;
	private int sum;
	private double avg;
	
	
	
//	@Override
//	public int compareTo(Student o) {
//		if(this.avg > o.getAvg()) {
//			return 999;
//		}else if(this.avg < o.getAvg()) {
//			return -999;
//		}else {
//			return 0;
//		}
//		
//	}
//	
	
	
	
	
	
	
	
	@Override
	public int hashCode() {
		// 1차 비교 기준
		return this.name.hashCode();
	}








	@Override
	public boolean equals(Object obj) {
		// 2차 비교 기준
		if(obj instanceof Student) {
			Student s = (Student)obj;
			return this.name.equals(s.getName());
		}
		return false;
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
	public Student(String name, int[] scores) {
		this.name = name;
		this.scores = scores;
		this.sum =sum();
		this.avg = average();
	}
	
	private int sum() {
		return this.scores[0]+this.scores[1]+this.scores[2];
	}
	
	
	private double average() {
		return Math.round((sum/3.0)*100)/100.0;
	}
	
	
	
	
	
	
}
