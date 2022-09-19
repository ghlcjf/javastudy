package ch05;

import java.util.Random;

public class Answer06_1 {

	public static void main(String[] args) {
		// 로또 한 게임을 실행할 때 중복되지 않도록 출력하세요
		Random r = new Random();
		
		
		int[] arr = new int[6];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = r.nextInt(45)+1;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					i--;
					break;
				}
			}
			
		}
		System.out.print("로또 번호 : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		

	}

}
