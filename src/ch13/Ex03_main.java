package ch13;

public class Ex03_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 과일을 담기 위한 박스를 만들어 봅시다.
		Box aBox = new Box(); // 이보다 범용성이 높을 수 없다.
		Box pBox = new Box(); // 안정성이 떨어진다.
//		Box oBox = new Box();
		
		// 과일 객체를 담아봅시다.
		aBox.setObj(new Apple());
		pBox.setObj(new Peach());
//		oBox.setObj("사과");
		
		
		// 박스에 저장된 과일 객체를 꺼내봅시다.
		Apple apple = (Apple)aBox.getObj();
		Peach peach = (Peach)pBox.getObj();
//		Apple apple1 = (Apple)oBox.getObj();
		// 꺼내진 과일 객체가 정상적인지 체크해봅시다.
		System.out.println(apple);
		System.out.println(peach);
//		System.out.println(apple1);
	}

}
