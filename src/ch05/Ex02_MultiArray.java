package ch05;

public class Ex02_MultiArray {

	public static void main(String[] args) {
		// 다차원 배열 => 배열 안에 또다른 배열이 들어간 형태
		// 5명의 학생 + 3개의 과목
		
		
		// 1차원 배열
		int[] scores1 = new int[5]; // 5칸짜리 배열 하나
		// int[] -> int 데이터를 담는 배열
		
		scores1[0] = 10;
		scores1[0] = 20;
		scores1[0] = 30;
		scores1[0] = 40;
		scores1[0] = 50;
		
		// 2차원 배열
		int[][] scores2 = new int[5][]; // 5칸짜리 배열 하나
		// int[][] -> int[] 데이터를 담는 배열

		scores2[0] = new int[3]; // int[] scores2[0];
		scores2[1] = new int[4]; // int[] scores2[1];
		scores2[2] = new int[3]; // int[] scores2[2];
		scores2[3] = new int[7]; // int[] scores2[3];
		scores2[4] = new int[2]; // int[] scores2[4];
		
		// 배열 안의 배열크기가 모두 같다면
		// int[][] scores2 = new int[5][3];
		
		//scores2.length; // => 5
		//scores2[3].length; // => 3

		
		//다차원 배열
		//int[][][][]
		//int[][][][] -> int[][][]를 담는 배열
						
		
		
		
		//-------------------------------------------------
		int[][] scores4 = new int[][] {
										{1,2,3,4}, 
										{5,6}, 
										{7,8,9}, 
		};
		for(int i=0;i<scores4.length;i++) {
			for(int j=0;j<scores4[i].length;j++) {
				System.out.println(scores4[i][j]);
			}
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
