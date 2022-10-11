package review01;

public class Answer07 {

	public static void main(String[] args) {
		// 1부터 100까지 3의 배수이면서 동시에 5의 배수인 수를 출력하세요
		
		for(int i=1;i<=100;i++) {
			if(i%3==0 && i%5==0) {
				System.out.print(i+" ");
			}
		}

	}

}
