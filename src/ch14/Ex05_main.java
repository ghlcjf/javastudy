package ch14;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Ex05_main {

	public static void main(String[] args) {
		// TreeSet
		//Set<String> companys = new TreeSet<>();
		// Set인터페이스는 TreeSet만이 가진 메서드를 모른다.
		
		TreeSet<String> companys = new TreeSet<>();
		// 타입을 TreeSet으로 선언해야 TreeSet 전용 메서드를 사용할 수 있다.
		
		companys.add("메타");
		companys.add("애플");
		companys.add("넷플릭스");
		companys.add("구글");
		companys.add("아마존"); // 구글,넷플릭스,메타,아마존,애플 순으로 정렬될 것이다
		companys.add("넷플릭스");
		//-------------------------------------------------------------
		
		System.out.println("등록된 총 회사 수 : "+companys.size());
		System.out.println("첫번째 회사 : "+companys.first());
		System.out.println("마지막 회사 : "+companys.last());
		System.out.println("알리익스프레스보다 아래 이름 : "+companys.lower("알리익스프레스"));
		System.out.println("메타보다 위에 있는 이름 : "+companys.higher("메타"));
		System.out.println("메타이거나 메타보다 아래 있는 이름 : "+companys.floor("메타"));
		System.out.println("나이키이거나 나이키보다 위에 있는 이름 : "+companys.ceiling("나이키"));
		// pollFirst(); pollLast(); 꺼내고 지우기
		
		System.out.println("---------------------------------------");
		Iterator<String> companysItr = companys.iterator();
		
		while(companysItr.hasNext()) {
			String name = companysItr.next();
			System.out.println("회사명 : "+name);
		}
		
		
		
		
		System.out.println("---------------------------------------");
		for(String name:companys) {
			System.out.println("회사명 : "+name);
		}
		
		
		System.out.println("---------------------------------------");
		// TreeMap
		TreeMap<Integer,String> students = new TreeMap<>();
		
		students.put(13, "가로");
		students.put(25, "나로");
		students.put(17, "다로");
		students.put(30, "라로");
		students.put(9, "마로");
		students.put(17, "바로");
		
		System.out.println("전체 학생 수 : "+students.size());
		
		System.out.println("첫 번째 학생 번호 : "+ students.firstEntry().getKey()
							+", 첫 번째 학생 이름 : "+students.firstEntry().getValue());
		
		System.out.println("마지막 학생 번호 : "+ students.lastEntry().getKey()
							+", 마지막 학생 이름 : "+students.lastEntry().getValue());
		//미만
		System.out.println("16번 보다 작은 학생 번호 : "+ students.lowerEntry(16).getKey()
				+", 16번 보다 작은학생 이름 : "+students.lowerEntry(16).getValue());
		//초과
		System.out.println("25번 보다 큰 학생 번호 : "+ students.higherEntry(25).getKey()
				+", 25번 보다 큰 학생 이름 : "+students.higherEntry(25).getValue());
		//이하
		System.out.println("25번과 같거나 작은 학생 번호 : "+ students.floorEntry(25).getKey()
				+", 25번과 같거나 작은 학생 이름 : "+students.floorEntry(25).getValue());
		//이상
		System.out.println("16번과 같거나 큰 학생 번호 : "+ students.ceilingEntry(16).getKey()
				+", 16번과 같거나 큰 학생 이름 : "+students.ceilingEntry(16).getValue());
		
		//---------------------------------------------------------------------
		System.out.println("---------------------------------------");
		
		
		Set<Map.Entry<Integer,String>> studentsSet = students.entrySet();
		
		for(Map.Entry<Integer,String> student:studentsSet) {
			int num = student.getKey();
			String name = student.getValue();
			System.out.println("학생 번호 : "+num+", 학생 이름 : "+name);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
