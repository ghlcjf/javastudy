package review04.part1;

import java.util.Scanner;

public class Answer01 {
	public static void main(String[] args) {
		// 글자를 입력해서 다음 글자와 일치하면 성공, 아니면 실패
		
		Scanner in =  new Scanner(System.in);
		
		System.out.println("'조건문 연습'을 입력하세요");
		String ans = in.nextLine();
		
		
		if(ans.equals("조건문 연습")) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		
		
		
	}
}
