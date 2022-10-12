package review05.part3;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Answer01 {

	public static void main(String[] args) {
		// 0부터 9까지 임의의 숫자 3개를 저장할 수 있는 배열
		
		Random r = new Random();
		
		int[] arr = new int[3];
		
		for(int i=0;i<arr.length;i++) {
			int num = r.nextInt(9)+1;
			arr[i]=num;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					i--;
					break;
				}
			}
			
		}
		
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+"번째 배열의 숫자 : "+arr[i]);
		}
		
		Set<Integer> is = new HashSet<>(); 
//		for(int i=0;is.size()<3;i++) {
//			is.add(r.nextInt(9)+1);
//		}
		while(is.size()<3) {
			is.add(r.nextInt(9)+1);
		}
		for(int i:is) {
			System.out.println(i);
		}
		
	}

}
