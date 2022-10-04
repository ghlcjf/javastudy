package ch12;

public class Ex04_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		
		sb.append("자바");
		sb.append("는 ");
		sb.append("재미");
		sb.append("있어");
		sb.append("요!");
		
		String str1 = sb.toString();
		
		String str2= "자바"+"는 "+"재미"+"있어"+"요!";
		
		String str3 = "자바".concat("는 ").concat("재미").concat("있어").concat("요!");
		
		// str3 오리지널 | str2 +연산자 활용 | str1 메모리 절약
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

	}

}
