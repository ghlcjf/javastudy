package ch05;

import java.util.Random;

public class Answer04 {

	public static void main(String[] args) {
		// 1과 9사이의 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램을 완성하세요.
		// 단 숫자의 중복이 있어서는 안 됩니다.
		
		// 1단계: 숫자 3개를 뽑는 행위
		int[] nums = new int[3];
		Random r = new Random();
		
//		for(int i=0;i<nums.length;i++) {
//			//nums[i] = r.nextInt(9)+1;
//			int num = r.nextInt(9)+1;
//			nums[i] = num;
//			
//			// 2단계 중복 제거
//			for(int j=0;j<i;j++) { // 중복을 확인하기 위한 반복
//				if(nums[j]==num) { // 중복이면
//					num = r.nextInt(9)+1;
//					i--; // 현재 위치 다시 뽑기
//					break;
//				}else {//중복이 아니면
//					nums[i]=num;
//				}
//			}	
//		}
		
		for(int i=0;i<nums.length;i++) {
			nums[i] = r.nextInt(9)+1;
			for(int j=0;j<i;j++) {
				if(nums[i]==nums[j]) {
					i--;
					break;
				}
			}
		}
		
		//배열의 숫자를 출력
		for(int num:nums) {
			System.out.print(num+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
