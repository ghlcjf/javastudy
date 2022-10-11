package ch16;

public class Calc {
	public int instanceMethod(int a, int b) {
		return a+b;
	}
	public static int staticMethod(int a,int b) {
		return a*b;
	}
	
	private int a;
	private int b;
	
	public Calc() {}
	
	public Calc(int a, int b) {
		System.out.println("생성자가 호출되었습니다.");
		this.a = a;
		this.b = b;
		System.out.println("a는 "+a+", b는 "+b+"가 입력되었습니다.");
	}
	
	
	
	
}
