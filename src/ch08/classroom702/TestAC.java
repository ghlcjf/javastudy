package ch08.classroom702;

public class TestAC {

	public String field1 = "public";
	String field2 = "default";
	private String field3 = "private";
	// 같은 클래스 내부에서만 사용 가능한 접근 제어자. private
	
	
	public void prt() {
		System.out.println("public : "+this.field1);
		System.out.println("default : "+this.field2);
		System.out.println("private : "+this.field3);
	}
}
