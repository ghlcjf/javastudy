package ch08.question;

public class Singleton {
	// 싱글턴 패턴 :  인스턴스를 하나만 만들어서 사용할 수 있게 하는 디자인 패턴 중의 하나.
	
	
	private Singleton() {} 
	// 1. 생성자에 private를 붙여 인스턴스를 못 만들게 함.
	
	static Singleton s = new Singleton(); 
	//2. 인스턴스는 내부적으로 하나만
	
	public static Singleton getInstance() { 
	// 3. 정적 메서드를 통해서 이미 만들어진 인스턴스를 꺼내서 활용
		return s;
	}
	////////////////////////////////////////////////////////////////
	// 필드
	// 메서드
	
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	
	
}



