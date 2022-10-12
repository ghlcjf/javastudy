package review05.part1;

public class Answer05 {

	public static void main(String[] args) {
		// 배열의 총합,갯수,평균
		int[][] arr = {
				{5,6,7,8,9},
				{10,12,15},
				{21,24,26,29},
				{32,37}
			};
		int sum = 0;
		double avg = 0.0;
		int count = 0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum+=arr[i][j];
				count++;
			}
		}
		avg = sum/(count*1.0);
		System.out.println("갯수 : "+count);
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		
		
		
	}

}
