package ch06;

public class que05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {78,54,89,57,84,95,74,91,84,67,52,94,82};
		int[] arr1 = null;
		int[] arr2 = new int[] {};
		//maxToArray(정수형 배열 데이터)
		int max = maxToArray(arr2);
		
		System.out.println("max : "+max);
	}
	
	
	
	
	public static int maxToArray(int[] arr) { //maxToArray(타입 변수)
		// 배열을 입력(전달)받아서 가장 큰 수를 반환(리턴)하는 메서드
		
		//int[] arry = new int[] {78,54,89,57,84,95,74,91,84,67,52,94,82}
		
		int max = 0;
		
		if(arr.length==0||arr==null) {
			return -99999;
		}
		
		
		
		for(int i = 0;i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		
		
		
		
		return max;
	}

}
