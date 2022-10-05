package ch14;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex01_main {

	public static void main(String[] args) {
		
		//ArrayList<String> names = new ArrayList<>(); // 문자열을 담는 리스트
		LinkedList<String> names = new LinkedList<>();
		// 둘다 List를 구현받기 때문에 사용법은 똑같다.
		
		
		names.add("둘리");
		names.add("또치");
		names.add("뚱이");
		names.add("스펀지밥");
		names.add("콩순이");
		names.add("도우너");
		names.add("희동이");
		names.add("공순이");
		for(int i=0;i<names.size();i++) {
			System.out.println(names.get(i));
		}
		System.out.println("----------------------------");
		System.out.println("2번 인덱스 데이터 : "+names.get(2));
		
		names.add(2,"집게사장");
		System.out.println("----------------------------");
		System.out.println("2번 인덱스 데이터 : "+names.get(2));
		System.out.println("----------------------------");
		for(int i=0;i<names.size();i++) {
			System.out.println(names.get(i));
		}
		System.out.println("----------------------------");
		String name1 = names.get(1);
		System.out.println("1번 인덱스 데이터 : "+name1);
		System.out.println("----------------------------");
		System.out.println("리스트의 길이 : "+names.size());
		
		names.add(6,"차니");
		System.out.println("----------------------------");
		System.out.println("리스트의 길이 : "+names.size());
		for(int i=0;i<names.size();i++) {
			System.out.println((i)+"번째 데이터 : "+names.get(i));
		}
		
		System.out.println("----------------------------");
		names.remove(6);
		System.out.println("리스트의 길이 : "+names.size());
		for(int i=0;i<names.size();i++) {
			System.out.println((i)+"번째 데이터 : "+names.get(i));
		}
		System.out.println("----------------------------");
//		names.clear();
		System.out.println("리스트의 길이 : "+names.size());
		
		//--------------------------------------------------------
		System.out.println("----------------------------");
		// 리스트로 반복자를 사용할 수 있다
		
		Iterator<String> itr = names.iterator();
		int cnt = 0;
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println((cnt++)+" 이름 : "+name);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
