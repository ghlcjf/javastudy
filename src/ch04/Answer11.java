package ch04;

public class Answer11 {

	public static void main(String[] args) {
		// 구구단 짝수단을 출력하세요.
		
		int i = 1;
		int j = 2;
		
		while(j<=9) {
			if(j%2!=0) {
				j++;
				continue;
			}
			System.out.println("---"+j+"단"+"---");
			
			while(i<=9) {
				System.out.println(j+"X"+i+"="+(i*j));
				i++;
			}
			j++;
			i=1;
		}

	}

}
