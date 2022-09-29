package ch10;

public class Check01Test implements Check01 {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("메서드 1");
	}

	@Override
	public void method2(int a) {
		// TODO Auto-generated method stub
		System.out.println("메서드 2 : "+a);
	}

	@Override
	public String method3() {
		// TODO Auto-generated method stub
		System.out.println("메서드 3");
		return "메서드 3 result";
	}

}
