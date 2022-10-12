package ch17;

import java.util.Arrays;
import java.util.OptionalInt;

public class Answer05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {78,54,89,57,84,95,74,91,84,67,52,94,82};
		
		OptionalInt max = Arrays.stream(arr).max();
		
		System.out.println("arr 배열의 최대값 : "+max.getAsInt());
		
	}

}
