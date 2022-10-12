package ch17;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Answer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {10,15,47,23,51};
		
		IntStream arrStream = Arrays.stream(arr);
		
		int total = arrStream.sum();
		
		System.out.println("arr 배열의 합 : "+total);
		
		
		
		
		
		
		
		
		
	}

}
