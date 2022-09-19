package ch05;

public class Answer05 {

	public static void main(String[] args) {
		// 최대값과 해당 인덱스를 구해서 출력해봅시다.
<<<<<<< HEAD
//		int[] arr = new int[] {78,54,89,57,84,95,74,91,84,67,52,94,82};
//		int num = 0;
//		int x = 0;
//		for(int i=0;i<arr.length;i++) {
//			if(num<arr[i]) {
//				num=arr[i];
//				x=i;
//			}
//		}
//		System.out.println("최대값 : "+num);
//		System.out.println("해당 인덱스 : "+x);

		
		int[] arr = new int[] {78,54,89,57,84,95,74,91,84,67,52,94,82};
		int num = 0;
		int x = 0;
		
		
		for(int i=0;i<arr.length;i++) {
			if(num<arr[i]) {
				num = arr[i];
				x = i;
			}
		}
		
		System.out.println("최대값 : "+num);
		System.out.println("해당 인덱스 : "+x);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
=======
		int[] arr = new int[] {78,54,89,57,84,95,74,91,84,67,52,94,82};
		int num = 0;
		int x = 0;
		for(int i=0;i<arr.length;i++) {
			if(num<arr[i]) {
				num=arr[i];
				x=i;
			}
		}
		System.out.println("최대값 : "+num);
		System.out.println("해당 인덱스 : "+x);

>>>>>>> 03e9fc6d258acb65a035a7daff6079aeb1411a0e
	}

}
