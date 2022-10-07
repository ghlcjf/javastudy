package ch15;

import ch15.OutterClass.InnerClassA;

public class Ex01_main {

	public static void main(String[] args) {
		// 내부 클래스 인스턴스 만들기
		
		// 1. 외부 클래스의 인스턴스 먼저 생성
		OutterClass oc = new OutterClass();
		
		// 2. 인스턴스 멤버 클래스의 인스턴스 만들기
		
		OutterClass.InnerClassA a = oc.new InnerClassA();

		a.fieldA = 10;
		a.methodA();
		
		// 3. 정적 멤버 클래스의 인스턴스 만들기
		// 외부 클래스의 인스턴스 없이도 생성할 수 있다.
		OutterClass.InnerClassB b = new OutterClass.InnerClassB();
		
		b.fieldA = 10;
		b.methodA();
		b.methodB();
		
		// 4. 로컬 클래스의 인스턴스 만들기
		
		oc.method();
		
		System.out.println(b.fieldB);
		
		//------------------------------------------------------------------
		oc.fieldA.methodA();
		oc.fieldB.methodA();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
