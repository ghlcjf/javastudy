package ch04;

public class Answer14 {

	public static void main(String[] args) {
		// 1+(1+2)+(1+2+3)+...(1+2+3+..+9+10)의 결과를 계산하세요.
		
		int i=1;
		int sum=0;
		int total=0;
		
		while(i<=10) {
			sum+=i;
			total+=sum;
			i++;
		}
		
		System.out.println(total);
	}

}
