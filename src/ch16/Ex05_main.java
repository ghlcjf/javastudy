package ch16;

import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntSupplier;
import java.util.function.Predicate;

import javax.annotation.PreDestroy;

public class Ex05_main {

	public static void main(String[] args) {
		// 1) Consumer
		// 매개값 o, 반환값 x
		IntConsumer x1;
		x1 = (a)->{System.out.println("컨슈머 : "+a);};
		x1.accept(10);
		
		// 2) Supplier
		// 매개값 x, 반환값 o
		IntSupplier x2;
		x2 = ()->{return 10;};
		int r2 = x2.getAsInt();
		System.out.println("서플라이어 : "+r2);

		// 3) Predicate
		// 매개값 o, 반환값 T/F
		Predicate<String> x3;
		x3 = (str)->{
			if(str.equals("여")) {
				return true;
			}else {
				return false;	
			}
		};
		String gender = "여";
		if(x3.test(gender)) {
			System.out.println("여자 화장실은 왼쪽입니다.");
		}else {
			System.out.println("남자 화장실은 오른쪽입니다.");
		}
		
		// 4) Operator
		// 매개값 o, 반환값 o, 매개값과 반환값의 타입이 같다.
		IntBinaryOperator x4;
		x4 = (a,b)->{return a*b;};
		int r4 = x4.applyAsInt(3, 6);
		System.out.println("오퍼레이터 : "+r4);
		
		// 5) Function
		// 매개값 o, 반환값 o, 매개값과 반환값의 타입이 다르다.
		
		Function<Member, String> x5;
		x5 = (x)->{
			String g = x.memNum.substring(7, 8);
			if(g.equals("1")) {
				return "남";
			}else if(g.equals("2")) {
				return "여";
			}else {
				return "??";
			}
		};
		Member m = new Member();
		m.memNum = "950704-3876543";
		
		String gender5 = x5.apply(m);
		if(gender5.equals("여")) {
			System.out.println("여자 화장실은 왼쪽입니다.");
		}else if(gender5.equals("남")) {
			System.out.println("남자 화장실은 오른쪽입니다.");
		}else {
			System.out.println("나도 몰라");
		}
		
		
	}
	public static class Member{
		public static String memNum;
	}

}
