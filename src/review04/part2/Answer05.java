package review04.part2;

import java.util.Random;
import java.util.Scanner;

public class Answer05 {
	public static void main(String[] args) {
		// 컴퓨터와 진행하는 가위바위보 게임
		
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		
		int num = r.nextInt(3);
		String com=null;
		
		if(num==0) {
			com="가위";
		}else if(num==1) {
			com="바위";
		}else if(num==2) {
			com="보";
		}
		System.out.println("테스트용 컴퓨터 : "+com);
		
		
		System.out.println("가위바위보!");
		String user = in.nextLine();
		
		
		switch(user) {
		case"가위":
			if(com.equals("가위")) {
				System.out.println("비김");
			}else if(com.equals("바위")) {
				System.out.println("짐");
			}else if(com.equals("보")) {
				System.out.println("이김");
			}
			break;
		case"바위":
			if(com.equals("가위")) {
				System.out.println("이김");
			}else if(com.equals("바위")) {
				System.out.println("비김");
			}else if(com.equals("보")) {
				System.out.println("짐");
			}
			break;
		case"보":
			if(com.equals("가위")) {
				System.out.println("짐");
			}else if(com.equals("바위")) {
				System.out.println("이김");
			}else if(com.equals("보")) {
				System.out.println("비김");
			}
			break;
		default:
			System.out.println("똑바로");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
