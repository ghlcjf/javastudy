package review01;

public class Answer05 {

	public static void main(String[] args) {
		// 1부터 100까지 3의 배수가 아닌 수를 출력하세요
		for(int i=1;i<=100;i++) {
			if(i%3!=0) {
				System.out.print(i+" ");
			}
			if(i%10==0) {
				System.out.println("");
			}
		}

	}

}
