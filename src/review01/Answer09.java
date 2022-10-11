package review01;

public class Answer09 {

	public static void main(String[] args) {
		// 1부터 100까지 7의 배수들을 풀력하고 7의 배수들의 합을 구해서 출력하세요
		
		int  sum = 0;
		for(int i=1;i<=100;i++) {
			if(i%7==0) {
				sum+=i;
				System.out.print(i+" ");
			}
		}

		
		
		System.out.println("\n7의 배수의 합 : "+sum);
	}

}
