package review05.part1;

public class Answer04 {

	public static void main(String[] args) {
		// arr[3]의 모든 숫자의 합계와 평균을 구해라
		int[][] arr = {
				{5,6,7,8,9},
				{10,12,15},
				{21,24,26,29},
				{32,37}
			};
		int sum = 0;
		double avg = 0.0;
		
		for(int i=0;i<arr[3].length;i++) {
			sum+=arr[3][i];
		}
		
		avg = sum/(arr[3].length*1.0);
		System.out.println("arr[3] 모든 숫자의 합 : "+sum);
		System.out.println("arr[3] 모든 숫자의 평균 : "+avg);
		
		
		
		
		
		
	}

}
