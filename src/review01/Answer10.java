package review01;

public class Answer10 {

	public static void main(String[] args) {
		// 1부터 100까지 3의 배수이면서 동시에 5의 배수들의 합을 구해서 출력
		
		int sum = 0;
		for(int i=1;i<=100;i++) {
			if(i%3==0 && i%5==0) {
				sum+=i;
			}
		}
		System.out.println("3과 5의 공배수들의 합 : "+sum);
	}

}
