package ch05;

import java.util.Random;

public class Answer06 {

	public static void main(String[] args) {
		// 로또 게임을 5번 실행하고 출력하세요.
		// 1부터 45사이의 숫자 6개
		Random r = new Random();
		int[][] num = new int[5][6];
		
		
		
		
		int lotto = 0;
		for(int i = 0;i<num.length;i++) {
			System.out.print((i+1)+"회차 로또 번호 : ");
			for(int j = 0;j<num[i].length;j++) {
				num[i][j] = r.nextInt(45)+1;
				for(int x = 0;x<j;x++) {
					if(num[i][j]==num[i][x]) {
						j--;
						break;
					}
				
				}
				
				System.out.print(num[i][j]+" ");
			}
			System.out.println("");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
