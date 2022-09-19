package ch05;

public class Answer01 {

	public static void main(String[] args) {
		// 다음과 같은 배열이 있을 때 arr[3].length의 값은 얼마인가
		
		int[][] arr = new int[][] {
			{5, 5, 5, 5, 5}, // 0
			{10, 10, 10}, // 1
			{20, 20, 20, 20}, // 2
			{30, 30} // 3
		};
		System.out.println("arr[3].length의 값 : "+ arr[3].length);
		System.out.println(arr[3]);
	}

}
