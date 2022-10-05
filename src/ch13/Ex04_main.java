package ch13;

public class Ex04_main {

	public static void main(String[] args) {
		//범용성도 높고 안정성도 높은 제네릭
		
		
		// 과일을 담기 위한 박스를 만들어 봅시다.
		Box2<Apple> aBox = new Box2<Apple>(); 
		Box2<Peach> pBox = new Box2<Peach>(); 
		Box2<Apple> oBox = new Box2</*Apple*/>(); // 생략도 가능
		
		// 과일 객체를 담아봅시다.
		aBox.setField(new Apple());
		pBox.setField(new Peach());
//		oBox.setField("사과"); // 에러메시지 바로 뜸 => 안정성이 높다
		// 실수로 엉뚱한 데이터 입력을 방지하는 기능
		
		// 박스에 저장된 과일 객체를 꺼내봅시다.
		Apple apple = aBox.getField(); // 형변환도 필요없다
		Peach peach = pBox.getField();
//		Apple apple1 = (Apple)oBox.getObj();
		
		// 꺼내진 과일 객체가 정상적인지 체크해봅시다.
		System.out.println(apple);
		System.out.println(peach);
//		System.out.println(apple1);

		
		
	}

}
