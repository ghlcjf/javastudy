package ch05;

public class Answer09 {

	public static void main(String[] args) {
		// 주어진 2차원 배열보다 행과 열을 하나씩 더 큰 배열을 생성하고
		// 해당 배열의 마지막 행과 열에는 각 행과 열의 합을 저장하고 출력하는 프로그램을 완성하세요.
		
		int[][] oldarr = {
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30},
				{40,40,40,40,40},
				{50,50,50,50,50}
		};
		int sum = 0;
		int sum_2 = 0;
		int[][] newarr = new int[6][6];
		
		for(int i=0;i<newarr.length;i++) {
			sum_2 = 0;
			for(int j=0;j<newarr[i].length;j++) {
				if(j<oldarr.length) {
					newarr[i][j]=oldarr[i][j];
					sum_2+=newarr[i][j];
				}else {
					newarr[i][j]=sum_2;
					break;
				}
				
			}
//			for(int j=0;j<newarr[i].length;j++) {
//				if(i<newarr.length) {
//					sum+=newarr[j][i];
//				}else {
//					newarr[j][i]=sum;
//					break;
//				}
//			}
			
			
			
		}
		
//		for(int i=0;i<newarr.length;i++) {
//			
//			
//			
//		}
		
		System.out.println(newarr[0][5]);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
