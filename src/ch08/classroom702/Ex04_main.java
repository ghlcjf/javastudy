package ch08.classroom702;

public class Ex04_main {

	public static void main(String[] args) {
		// 이넘(enum) 타입
		
		Weekend day = Weekend.TUS;
		// 문자도 숫자도 아닌 다른 임의의 데이터 타입 
		
		switch(day) {
		case MON:
			System.out.println("월요일이다..");
			break;
		case TUS:
			System.out.println("화요일이다..");
			break;
		case WED:
			System.out.println("수요일이다..");
			break;
		case THU:
			System.out.println("목요일이다..");
			break;
		case FRI:
			System.out.println("금요일이다.");
			break;
		case SAT:
			System.out.println("토요일이다!");
			break;
		case SUN:
			System.out.println("일요일이다?");
			break;
		}

	}

}
