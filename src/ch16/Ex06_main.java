package ch16;

import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;

public class Ex06_main {

	public static void main(String[] args) {
		// 메서드 참조
		int x = 10, y = 20;
		IntBinaryOperator op;
		
		// 1) 인스턴스 메서드 참조 : 이미 있는 메서드를 람다식으로 사용하겠다.
		// [원래 만들고 싶은 참조]
		Calc c = new Calc();
//		op=(a,b)->{return c.instanceMethod(a, b);};
//		
//		int result = op.applyAsInt(x, y);
//		int result2 = c.instanceMethod(x, y);
//		System.out.println(result+","+result2);
//		System.out.println("인스턴스 메서드 참조1 : "+op.applyAsInt(x, y));
		
		// [인스턴스 메서드 참조]
		op = c::instanceMethod;
		System.out.println("인스턴스 메서드 참조2 : "+op.applyAsInt(x, y));
		
		
		
		
		// 2) 정적 메서드 참조 : 
		// [원래 만들고 싶은 참조]
//		op = (a,b)->{return Calc.staticMethod(a, b);};
//		System.out.println("정적 메서드 참조 1 : "+op.applyAsInt(x, y));
		
		
		// [인스턴스 메서드 참조]
		op = Calc::staticMethod;
		System.out.println("정적 메서드 참조 1 : "+op.applyAsInt(x, y));
		
		
		
		
		// 3) 생성자 참조 : 매개값을 넣어서 인스턴스를 만드는 메서드
		// [원래 만들고 싶은 참조]
		BiFunction<Integer, Integer, Calc> func;
		
		func = (a,b)->{return new Calc(x,y);};
		Calc c3= func.apply(x, y);
		
		
		// [생성자 참조]
		func = Calc::new;
		Calc c33= func.apply(x, y);
		
		
		
	}

}
