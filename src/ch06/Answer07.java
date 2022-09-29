package ch06;

import java.util.Scanner;

public class Answer07 {
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		// 주어진 두 배열의 같은 인덱스의 숫자를 합쳐서 하나의 배열로 출력하는 메소드를 만드세요.
		// 단, 같은 위치에 숫자가 없다면 해당 위치의 숫자를 그냥 출력하세요.
		
		int[] firstArr = new int[]  {78,54,89,57,84,1,2,8,1,1};
		int[] secondArr = new int[] {95,74,91,84,1,99,2,2,2,10};
		
		
		int[] sumArr = sum(firstArr,secondArr);
		
		
		System.out.print("sumArr : {");
		for(int i=0;i<sumArr.length;i++) {
			if(i<sumArr.length-1) {
				System.out.print(sumArr[i]+",");
			}else if(i==sumArr.length-1) {
				System.out.print(sumArr[i]);
			}
			
		}
		System.out.println("}");
	}
	
	
	
	
	

	private static int[] sum(int[] firstArr, int[] secondArr) {
		int min = -1;
		int max = -1;
		if(firstArr.length>secondArr.length) {
			min=secondArr.length;
			max=firstArr.length;
		}else if(firstArr.length<secondArr.length) {
			min = firstArr.length;//8
			max = secondArr.length;//10
		}else if(firstArr.length==secondArr.length) {
			min=secondArr.length;
			max=firstArr.length;
		}
		
		
		
		int[] sumArr = new int[max];//10
		
		
		
		for(int i=0;i<min;i++) {//0~7 8개
			sumArr[i] = firstArr[i]+secondArr[i];
		}
		
		
		if(firstArr.length>secondArr.length) {
			for(int i=min;i<max;i++) {
				sumArr[i]=firstArr[i];
				
			}
			return sumArr;
			
		}else if(firstArr.length<secondArr.length) {//8<10
			for(int i=min;i<max;i++) {//int i=8;
				sumArr[i] = secondArr[i];
				
			}
			return sumArr;
		}

		return sumArr;
		
	}
	
	

}
