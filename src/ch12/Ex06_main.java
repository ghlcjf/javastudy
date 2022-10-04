package ch12;

public class Ex06_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person01 p1 = new Person01("aassdd");
		Person01 p2 = new Person01("aassdd");
		
		
		if(p1==p2) {
			System.out.println("p1과 p2는 같은 사람입니다.");
		}else {
			System.out.println("p1과 p2는 다른 사람입니다.");
		}
		
		// equals() 오버라이드 해서 비교
		if(p1.equals(p2)) {
			System.out.println("p1과 p2는 같은 사람입니다.");
		}else {
			System.out.println("p1과 p2는 다른 사람입니다.");
		}
		
		
		
	}

}
