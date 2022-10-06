package ch14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex04_main {

	public static void main(String[] args) {
		// HashMap
		// Map은 인터페이스 HashMap은 클래스
		// <기본타입> 은 들어갈 수 없다 wrapper 클래스 이용
		Map<String,Integer> fruit = new HashMap<>();
		
		fruit.put("사과", 1000);
		fruit.put("바나나", 500);
		fruit.put("샤인머스켓", 20000);
		fruit.put("복숭아", 2000);
		fruit.put("키위", 1500);
		
		System.out.println("과일 갯수 : "+fruit.size());
		System.out.println("샤인머스켓의 가격 : "+fruit.get("샤인머스켓"));
		System.out.println("키위의 가격 : "+fruit.get("키위"));
		
		System.out.println("-------------------------------------");
		fruit.put("키위", 2000);
		System.out.println("과일 갯수 : "+fruit.size());
		System.out.println("키위의 가격 : "+fruit.get("키위"));
		
		
		System.out.println("-------------------------------------");
		fruit.remove("바나나");
		System.out.println("과일 갯수 : "+fruit.size());
		System.out.println("바나나의 가격 : "+fruit.get("바나나"));
		
		
		
		System.out.println("-------------------------------------");
		// 특정 키가 있는지 체크하는 기능
		if(fruit.containsKey("복숭아")) {
			System.out.println("복숭아의 가격 : "+fruit.get("복숭아"));
		}
		
		if(fruit.containsKey("천도복숭아")) {
			System.out.println("천도복숭아의 가격 : "+fruit.get("천도복숭아"));
		}else {
			System.out.println("우리 가게는 천도복숭아를 취급하지 않습니다.");
		}
		
		
		
		
		System.out.println("-------------------------------------");
		// Map의 전체 데이터 조회 => Set으로 바꿔서 조회
		// 1) key들을 Set으로 변환해서 처리
		Set<String> fruitName = fruit.keySet();
		// Map<key,value> key 값이 String이라서 Set<String>
		
		Iterator<String> fruitNameItr = fruitName.iterator();
		
		while(fruitNameItr.hasNext()) {
			String keyName = fruitNameItr.next();
			int value = fruit.get(keyName);
			
			System.out.println("과일 : "+keyName+"\n가격 : "+value+"\n");
		}
		
		System.out.println("-------------------------------------");
		// 2) Entry(key와 value의 묶음)를 Set으로 변환
		
		Set<Map.Entry<String,Integer>> fruitEntry = fruit.entrySet();
		
		Iterator<Map.Entry<String,Integer>> fruitEntryItr = fruitEntry.iterator();
		
		
		while(fruitEntryItr.hasNext()) {
			Map.Entry<String,Integer> fruit1 = fruitEntryItr.next();
			String key = fruit1.getKey();
			int value = fruit1.getValue();
			System.out.println("과일 : "+key+"\n가격 : "+value+"\n");
		}
		
		
		// 반복자(iterator)는 일회용이라 한 번 사용 후 다시 사용해야 할 때는 
		// 다시 조회해야 함.
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
