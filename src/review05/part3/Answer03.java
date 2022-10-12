package review05.part3;

public class Answer03 {

	public static void main(String[] args) {
		// 주어진 2차원 배열에 담긴 모든 값들의 총합과 평균을 구하는 프로그램을 완성하세요.
		int[][] arr = {
						{5,6,7,8,9},
						{11,13,15,17,19},
						{22,24,26,28,30},
						{31,34,35,38,39}
						};
		int sum = 0;
		double avg;
		int count=0;
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum+=arr[i][j];
				count++;
			}
		}
		avg = Math.round(sum/(count*1.0)*100)/100.0;
		
		System.out.println("배열의 총합 : "+sum);
		
		System.out.println("배열의 평균 : "+avg);
		
		
		
		
	}

}
