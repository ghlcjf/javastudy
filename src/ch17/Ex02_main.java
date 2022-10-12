package ch17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Ex02_main {

	public static void main(String[] args) {
		// 스트림
		// 1. 배열이나 리스트를 어떻게 스트림으로 바꾸는가.
		
		//	1) 배열 - 기본타입
			int[] arr1 = new int[5];
			long[] arr2 = new long[5];
			double[] arr3 = new double[5];
			
			IntStream stream1 = Arrays.stream(arr1);
			LongStream stream2 = Arrays.stream(arr2);
			DoubleStream stream3 = Arrays.stream(arr3);
			
		
		//	2) 배열 - 참조타입
			String[] arr4 = new String[5];
			
			Stream<String> stream4 = Arrays.stream(arr4);
			// 일반 Stream에 제네릭을 사용
			
			
		//	3) 리스트 (ArrayList, LinkedList)
			List<String> list = new ArrayList<>();
			// 리스트 생성
			Stream<String> streamList = list.stream();
			// 스트림으로 변경
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
