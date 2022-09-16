package ch04;

public class Answer19 {

	public static void main(String[] args) {
		// 어떤 정수의 양수중 자신을 제외한 약수를 모두 합하면 자신과 같아지는 수[완전수]가 있다.
		// 4~100까지 숫자중에 이런 숫자를 찾으세요.
		
		
		
		int i=0;
		int sum=0;
		int j = 0;
		
		
		for(i=4;i<100;i++) {
			
			
			for(j=1;j<i;j++) {
				
				if(i%j==0) {
					sum+=j;
				}
				
			}
			
			
			if(i==sum) {
				System.out.println(i);
			}
			
			sum=0;
		
		}
		
		
	
		
		
		
		
	}




}
		
		
		
		
		



