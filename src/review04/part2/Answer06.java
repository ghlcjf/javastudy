package review04.part2;

import java.util.Random;
import java.util.Scanner;

public class Answer06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		int win = 0;
		int draw = 0;
		int lose = 0;
		
		
		System.out.println("몇번?");
		int count = Integer.parseInt(in.nextLine());
		
		for(int i=0;i<count;i++) {
			
			
			
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
					draw++;
				}else if(com.equals("바위")) {
					System.out.println("짐");
					lose++;
				}else if(com.equals("보")) {
					System.out.println("이김");
					win++;
				}
				break;
			case"바위":
				if(com.equals("가위")) {
					System.out.println("이김");
					win++;
				}else if(com.equals("바위")) {
					System.out.println("비김");
					draw++;
				}else if(com.equals("보")) {
					System.out.println("짐");
					lose++;
				}
				break;
			case"보":
				if(com.equals("가위")) {
					System.out.println("짐");
					lose++;
				}else if(com.equals("바위")) {
					System.out.println("이김");
					win++;
				}else if(com.equals("보")) {
					System.out.println("비김");
					draw++;
				}
				break;
			default:
				System.out.println("똑바로");
			}
			
			
			
			
			
		}	
		
		System.out.println("게임 종료");
		System.out.println(win+"승 "+draw+"무 "+lose+"패");
		
		
		
		
		
	}
	
	
}
