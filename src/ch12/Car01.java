package ch12;

public class Car01 {
	private String kind;
	private int number;
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Car01() {
		this("spade",1);
	}
	public Car01(String kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}
	
	
	
	
	
	
	
	
	
}
