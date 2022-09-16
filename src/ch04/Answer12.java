package ch04;

public class Answer12 {

	public static void main(String[] args) {
		// 구구단을 가로로 출력하세요
		
		
		int i = 1;
		int j = 2;
		
		while(j<=9) {
			
			System.out.print("---"+j+"단"+"---");
			
			while(i<=9) {
				System.out.print(j+"X"+i+"="+(i*j)+" ");
				i++;
			}
			j++;
			i=1;
			System.out.println("");
		}

	}

}
