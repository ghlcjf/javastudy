package ch17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Ex04_main {

	public static void main(String[] args) {
		// 스트림
		int[] nums = new int[] {78,54,89,57,84,95,74,91,84,67,52,94,82};
		
		IntStream numStream = Arrays.stream(nums);
		
		
		
		
		// 최종 연산 : 마지막 수도꼭지 역할을 해 주는 연산
		//			=> 스트림 하나 당 최종 연산 하나.
		//	sum(), count(), average(), min(), max()
//		int total = numStream.sum();
//		System.out.println("배열의 합계 : "+total);
		
		
//		long cnt = numStream.count();
//		System.out.println("배열의 갯수 : "+cnt);
		
		
//		OptionalInt max = numStream.max();
//		System.out.println("배열의 최대값 : "+max.getAsInt());
		
		// 	forEach() 갯수를 세 주는 역할 => 매개값 Consumer 인터페이스로 만들어진 객체
		numStream.forEach(num->System.out.println(num));
		
		
		
		
		// reduce() => 매개값 BinaryOperator 인터페이스로 만들어진 객체
		
		List<String> list = new ArrayList<>();
		
		list.add("캡틴아메리카");
		list.add("스파이더맨");
		list.add("헐크");
		list.add("데드풀");
		list.add("앤트맨");
		list.add("아이언맨");
		
		String str = list.stream()
						 .reduce("",(m,n)->{
							 if(m.compareToIgnoreCase(n)>=0) {
								 return m;
							 }else {
								 return n;
							 }
						 });
		System.out.println("마지막 나올 영웅 : "+str);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
