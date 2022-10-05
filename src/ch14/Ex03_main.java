package ch14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex03_main {

	public static void main(String[] args) {
		// 반복자 => 향상된 for문과 연결되어 있다
		String[] names1 = new String[] {"가","나","다","라"};
		
		
		for(String name:names1) {
			System.out.println("이름 : "+name);
		}
		
		
		//----------------------------------------
		System.out.println("-------------------------------");
		List<String> names2 = new ArrayList<>();
		names2.add("가");
		names2.add("나");
		names2.add("다");
		names2.add("라");
		
		for(String name:names2) {
			System.out.println("이름 : "+name);
		}
		
		System.out.println("-------------------------------");
		// Set도 향상된 for문을 이용해 출력할 수 있다. 순서는 멋대로임 Set 자체가 순서가 없기 때문
		Set<String> names3 = new HashSet<>();
		
		names3.add("가");
		names3.add("나");
		names3.add("다");
		names3.add("라");
		
		for(String name:names3) {
			System.out.println("이름 : "+name);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
