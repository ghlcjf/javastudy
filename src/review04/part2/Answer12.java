package review04.part2;

public class Answer12 {
	public static void main(String[] args) {
		// 10부터 100까지 숫자 중에서 1의 자리 숫자와 10의 자리 숫자가 짝수인 수 출력
		
		for(int i=10;i<=100;i++) {
			if(i%2==0 && (i/10)%2==0) {
				System.out.println(i);
			}
		}
		
		
		
	}
}
