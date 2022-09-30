package ch11;

import java.util.Scanner;

public class Ex04_main {

	public static void main(String[] args) {
		// 
		Scanner in = new Scanner(System.in);
		System.out.println("0을 입력해 주세요");
		int num = Integer.parseInt(in.nextLine());
		
		try {
			method1(num);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("");
			System.out.println("예외 : "+e.getMessage());
		}
		
		System.out.println("이어서 실행");
		

	}

	private static void method1(int num) throws MyException{
		// 사용자 정의 예외를 발생 시킬 메서드 
		if(num!=0) {
			throw new MyException("0 입력 오류 강제 예외 발생");
			//예외가 발생했음을 알려주는 코드
			
		}
		
		
	}

}
