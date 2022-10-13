package review04.part1;

import java.util.Scanner;

public class Answer02 {
	public static void main(String[] args) {
		// 문자열을 두 번 연속으로 입력해서 저장된 글자와 모두 일치하면 성공
		// 둘 중 하나만 일치라면 글쎄
		// 모두 불일치하면 실패
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("조건문 연습 >>");
		String ans = in.nextLine();
		System.out.println("반복문 연습 >> ");
		String ans2 = in.nextLine();
		
		
		if(ans.equals("조건문 연습")&&ans2.equals("반복문 연습")) {
			System.out.println("성공");
		}else if(ans.equals("조건문 연습")||ans2.equals("반복문 연습")) {
			System.out.println("글쎄");
		}else {
			System.out.println("실패");
		}
	}
}
