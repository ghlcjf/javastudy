package ch04;

public class Answer15 {

	public static void main(String[] args) {
		// 1+(-2)+3+(-4)+...같은 식으로 더해 나갔을 때 
		//총합이 몇까지 더해야 100 이상이 되는지 구하세요.
		
		
		int num = 0;
		int s = 1;
		int sum = 0;
		int i = 1;
		
//		for(int i=1;true;i++,s=-s) {
//			num=i*s;
//			sum+=num;
//			if(sum>=100) {
//				break;
//			}
//			
//		}
//		
		while(sum<100) {
			num=i*s;
			sum+=num;
			i++;
			s=-s;
			
		}
		
		
		
		
		System.out.println("num의 값: "+num);
		System.out.println("sum의 값: "+sum);
		
		
		
		
		
		
		
		
		
		
		

	}

}
