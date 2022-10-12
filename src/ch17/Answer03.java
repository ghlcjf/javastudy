package ch17;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Answer03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[][] {
			{5,5,5,5,5,},
			{10,10,10,10,10},
			{20,20,20,20,20},
			{30,30,30,30,30}
		};
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum+=arr[i][j];
			}
		}
		
		System.out.println("arr 배열의 합 : "+sum);
		
		
		
		
		
		
	}

}
