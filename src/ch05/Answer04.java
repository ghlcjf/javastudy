package ch05;

import java.util.Random;

public class Answer04 {

	public static void main(String[] args) {
		// 1과 9사이의 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램을 완성하세요.
		// 단 숫자의 중복이 있어서는 안 됩니다.
		
		
		Random r = new Random();
		
<<<<<<< HEAD
//		int[] arr = new int[3];
//		
//		for(int i = 0;i<arr.length;i++) {
//			arr[i] = r.nextInt(9)+1;
//			for(int j = 0;j<i;j++) {
//				if(arr[i]==arr[j]) {
//					i--;
//					break;
//				}
//			}
//		}
//		System.out.println(""+arr[0]+arr[1]+arr[2]);
//		
//		
//		for(int i = 0;i<arr.length;i++) {
//			System.out.print(arr[i]);
//		}
		
		
		
		int[] arr = new int[3];
		for(int i=0;i<arr.length;i++) {
			arr[i] = r.nextInt(9)+1;
			for(int j=0;j<i;j++) {
=======
		int[] arr = new int[3];
		
		for(int i = 0;i<arr.length;i++) {
			arr[i] = r.nextInt(9)+1;
			for(int j = 0;j<i;j++) {
>>>>>>> 03e9fc6d258acb65a035a7daff6079aeb1411a0e
				if(arr[i]==arr[j]) {
					i--;
					break;
				}
			}
		}
<<<<<<< HEAD
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(""+arr[i]);
=======
		System.out.println(""+arr[0]+arr[1]+arr[2]);
		
		
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]);
>>>>>>> 03e9fc6d258acb65a035a7daff6079aeb1411a0e
		}
		
		
		
		
		
		
		
		
		
<<<<<<< HEAD
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
=======
>>>>>>> 03e9fc6d258acb65a035a7daff6079aeb1411a0e

	}

}
