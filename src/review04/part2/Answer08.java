package review04.part2;

import java.util.Scanner;

public class Answer08 {
	public static void main(String[] args) {
		// 임의의 수를 입력받아서 해당 단을 출력하세요
		
		Scanner in =  new Scanner(System.in);
		
		System.out.println("몇단?");
		int num = Integer.parseInt(in.nextLine());
		
		
		for(int i=1;i<10;i++) {
			System.out.println(num+"X"+i+"="+(num*i));
		}
		
		
		
	}
}
