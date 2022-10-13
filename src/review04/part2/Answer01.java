package review04.part2;

import java.util.Scanner;

public class Answer01 {
	public static void main(String[] args) {
		// 가위바위보 하나를 입력하면 입력한 글자가 출력되도록 하되
		// 잘못 입력한 경우 에러라고 출력되도록 코드를 작성해 보자
		
		
		Scanner in = new Scanner(System.in);
		
		
		String user= in.nextLine();
		
		
		if(user.equals("가위")) {
			System.out.println("가위");
		}else if(user.equals("바위")) {
			System.out.println("바위");
		}else if(user.equals("보")) {
			System.out.println("보");
		}else {
			System.out.println("에러");
		}
		
		
	}
}
