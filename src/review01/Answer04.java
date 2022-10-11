package review01;

public class Answer04 {

	public static void main(String[] args) {
		// 1부터 100까지 5의 배수를 출력하세요
		
		for(int i =1;i<=100;i++) {
			if(i%5==0) {
				System.out.print(i+" ");
			}
			if(i%10==0) {
				System.out.println("");
			}
		}
		
		
	}

}
