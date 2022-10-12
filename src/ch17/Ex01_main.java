package ch17;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Ex01_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
		// 물탱크에 있는 데이터
		
		IntStream stream1 = Arrays.stream(arr);
		// 파이프 생성
		// 배열이나 리스트 등의 데이터 묶음을 1차 통로에 집어넣는다.
		
		IntStream stream2 = stream1.filter((n)->{return n%2==1;});
		// 필터
		// predicate == T/F가 나오게하는 ...
		// 1차 통로에 홀수인 데이터만 추리는 (필터링하는) 2차 통로를 붙인다.
		
		int total1 = stream2.sum();/*sum() << stream의 합을 구하는 메서드*/
		// 2차 통로로부터 나온 데이터들의 합계를 구하는 최종 통로
		
		System.out.println("홀수들의 합 : "+total1);
		
		
		
		int total2 = Arrays.stream(arr).filter(n->n%2==0).sum();
		
		System.out.println("짝수들의 합 : "+total2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
