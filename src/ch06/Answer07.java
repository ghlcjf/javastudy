package ch06;

import java.util.Scanner;

public class Answer07 {
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		// 주어진 두 배열의 같은 인덱스의 숫자를 합쳐서 하나의 배열로 출력하는 메소드를 만드세요.
		// 단, 같은 위치에 숫자가 없다면 해당 위치의 숫자를 그냥 출력하세요.
		
		int[] firstArr = new int[] {78,54,89,57,84};
		int[] secondArr = new int[] {95,74,91,84};
		
		
		int[] sumArr = sum(firstArr,secondArr);
		
		for(int i=0;i<sumArr.length;i++) {
			System.out.println((i+1)+"번째 인덱스 : "+sumArr[i]);
			
		}
		
		System.out.print("{"+sumArr[0]+","+sumArr[1]+","+sumArr[2]+","+sumArr[3]+","+sumArr[4]+"}");

	}

	private static int[] sum(int[] firstArr, int[] secondArr) {

		int[] sumArr = new int[firstArr.length];
		
		for(int i=0;i<sumArr.length;i++) {
			
			if(i==4) {
				sumArr[i] = firstArr[i];
				break;
			}
			sumArr[i] = firstArr[i]+secondArr[i];
			
			
			
		}
		
		return sumArr;
	}
	
	

}
