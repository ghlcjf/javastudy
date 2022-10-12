package review05.part1;

public class Answer03 {

	public static void main(String[] args) {
		// arr[2]의 모든 숫자의 합
		int[][] arr = {
				{5,6,7,8,9},
				{10,12,15},
				{21,24,26,29},
				{32,37}
			};
		
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i==2) {
					sum+=arr[i][j];
				}
			}
		}
		System.out.println("arr[2] 모든 숫자의 합 : "+sum);
		
	}

}
