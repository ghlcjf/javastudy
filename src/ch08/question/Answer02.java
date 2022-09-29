package ch08.question;

public class Answer02 {

	public static void main(String[] args) {
		
		//singleton ss= new Singleton();
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		if(s1==s2) {
			System.out.println("s1과 s2는 같은 객체이다.");
		}
		
		
		s1.setNumber(100);
		System.out.println("숫자 : "+s2.getNumber());
		// 어차피 s1과 s2는 같은 객체이기 때문에 setNumber와 getNumber
		
		
	}

}
