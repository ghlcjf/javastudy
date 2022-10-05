package ch14;

import java.util.HashSet; // Set을 구현한 클래스
import java.util.Iterator;
import java.util.Set; // 인터페이스

public class Ex02_main {

	public static void main(String[] args) {
		
		Set<String> names = new HashSet<>();
		
		names.add("둘리");
		names.add("희동이");
		names.add("희동이"); // 중복 발생 
		names.add("또치");
		names.add("도우너");
		
		
		System.out.println("집합의 갯수 : "+names.size());
		
		names.add("둘리"); // 중복.......
		
		System.out.println("집합의 갯수 : "+names.size());
		
		names.remove("희동이");
		System.out.println("집합의 갯수 : "+names.size());
		System.out.println("-------------------------------------");
		//-------------------------------------------------------------
		// Set의 전체 데이터 조회
		
		Iterator<String> itr = names.iterator();
		
		while(itr.hasNext()) {// 반복자 내에 다음 꺼낼 것이 있는가?를 뜻하는 hasNext()
			String str = itr.next();// 다을 꺼낼 것을 꺼내세요.를 뜻하는 next()
			System.out.println("이름 : "+str);
		}
		
		System.out.println("-------------------------------------");
		//------------------------------------------------------------
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
