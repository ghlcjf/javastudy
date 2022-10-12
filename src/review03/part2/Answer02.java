package review03.part2;

public class Answer02 {
	public static void main(String[] args) {
		// 주어진 점수에 따라 아래와 같이 점수와 등급을 출력하세요.
		// 90 이상 a, 80 이상 b, 70 이상 c, 60 이상 d, 60 미만 f
		
		int score = 59;
		
		if(score>=90) {
			System.out.println("당신의 점수는 "+score+"점입니다.");
			System.out.println("당신의 등급은 A 등급입니다.");
		}else if(score>=80) {
			System.out.println("당신의 점수는 "+score+"점입니다.");
			System.out.println("당신의 등급은 B 등급입니다.");
		}else if(score>=70) {
			System.out.println("당신의 점수는 "+score+"점입니다.");
			System.out.println("당신의 등급은 C 등급입니다.");
		}else if(score>=60) {
			System.out.println("당신의 점수는 "+score+"점입니다.");
			System.out.println("당신의 등급은 D 등급입니다.");
		}else {
			System.out.println("당신의 점수는 "+score+"점입니다.");
			System.out.println("당신의 등급은 F 등급입니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
