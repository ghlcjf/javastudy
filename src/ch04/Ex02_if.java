package ch04;

public class Ex02_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if문 예제 - 성적 등급
		// 90점 이상이면 A, 80점 이상이면 B, 70점 이상이면 C, 60점 이상이면 D, 59점 이하면 F.
		int jumsu = 40;
		
		if (jumsu >= 90) { // 점수가 90 이상 A
			System.out.println("당신은 A등급입니다.");
		} else { // 점수가 90 미만. B, C, D, F
			if (jumsu>=80 ) { // 점수가 80 이상 B
				System.out.println("당신은 B등급입니다");
			} else {// 점수가 80 미만. C, D, F
				if (jumsu>=70) {// 점수가 70 이상 C
					System.out.println("당신은 C등급입니다");
				} else {// 점수가 70 미만. D, F
					if (jumsu>=60) {// 점수가 60 이상 D
						System.out.println("당신은 D등급입니다");
					} else {//점수가 59 이하. F
						System.out.println("당신은 F등급입니다");
					}
				}		
			}
		}
		//---------------------------------------------------------
		//else 안에 또 다른 if 조건이 포함된 경우
		
		if (jumsu>=90 ) {
			System.out.println("당신은 A등급입니다.");
		} else if (jumsu>=80) {
			System.out.println("당신은 B등급입니다.");
		} else if (jumsu>=70) {
			System.out.println("당신은 C등급입니다");
		} else if (jumsu>=60) {
			System.out.println("당신은 D등급입니다");
		} else {
			System.out.println("당신은 F등급입니다");
		}
		
		
		
		
		
		
		
		
	}
}
