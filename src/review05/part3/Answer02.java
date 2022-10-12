package review05.part3;

public class Answer02 {

	public static void main(String[] args) {
		// 배열의 각 숫자를 출력하고 숫자만큼 별을 찍는 프로그램을 만들어 보자.
		int[] arr= {8,4,5};
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+": ");
			for(int j=0;j<arr[i];j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
	}

}
