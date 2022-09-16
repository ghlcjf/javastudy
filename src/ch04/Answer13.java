package ch04;

public class Answer13 {

	public static void main(String[] args) {
		// 10~100까지 중 10의 자리와 1의 자리가 짝수인 수를 모두 출력하시오.
		
		int sum = 0;
		int i = 10;
		
		while(i<=100) {
			if(i%2!=0 || (i/10)%2!=0) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}

	}

}
