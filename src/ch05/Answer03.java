package ch05;

public class Answer03 {

	public static void main(String[] args) {
		// 다음 2차원 배열에 담긴 모든 값들의 총합과 평균을 구하는 프로그램을 완성하세요.
		int[][] arr = new int[][] {
			{5,5,5,5,5},
			{10,10,10,10,10},
			{20,20,20,20,20},
			{30,30,30,30,30}
		};
		int sum = 0;
		int count = 0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum+=arr[i][j];
				count++;
			}
		}
		double avg = Math.round((sum*1.0)/count*100)/100.0;
		System.out.println("총합: "+sum);
		System.out.println("평균: "+avg);
	}

}
