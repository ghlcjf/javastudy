package ch04;

public class Ex03_switch {

	public static void main(String[] args) {
		// switch 예제
		String jongkyo = "기독교";
		
		switch (jongkyo) {
		case "불교" : 
			System.out.println("절로 가세요. ");
			break;
		case "기독교"	: 
			System.out.println("교회로 가세요. ");
			break;
		case "천주교" : 
			System.out.println("성당으로 가세요. ");
			break;
		default :
			System.out.println("알아서 가세요. ");
		}
		
		
		
		
		
		
		

	}

}
