package review05.part3;

public class Answer04 {

	public static void main(String[] args) {
		// 주어진 2차원 배열보다 행과 열이 하나씩 더 큰 배열을 생성하고  
		// 해당 배열의 마지막 행과 열에서는 각 행과 열의 합이 저장되고 출력하는 프로그램을 완성하세요
		
		int[][] arr = {
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30},
				{40,40,40,40,40},
				{50,50,50,50,50}
				};
		
		
		
		int[][] arr1 = new int[6][6];
		
		int sum=0;
		//배열 복사
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr1[i][j] = arr[i][j];
			}
		}
		// 가로 합계
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				sum+=arr1[i][j];
			}
			arr1[i][arr.length]=sum;
			sum=0;
		}
		// 세로 합계
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				sum+=arr1[j][i];
			}
			arr1[arr.length][i]=sum;
			sum=0;
		}
		// 출력
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println("");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
