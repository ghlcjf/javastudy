package ch04;

import java.util.Random;
import java.util.Scanner;

public class Game_Ex_02 {

	public static void main(String[] args) {
		// 컴퓨터가 숫자 맞추는 게임
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		
		boolean b = true;
		int max = 100;
		int min = 1;
		int com = 0;
		int count = 0;
		
		
		
		
		
		
		System.out.println("컴퓨터가 맞출 답을 입력해 주세요.");
		int user = Integer.parseInt(in.nextLine());
		
		while(b) {
			com = r.nextInt(max-min+1)+min;
			count++;
			System.out.println(com);
			if(com<user) {
				
				System.out.println("정답은 "+com+"보다 큰 숫자입니다.");
				min=com+1;
			}else if(com>user) {
				
				System.out.println("정답은 "+com+"보다 작은 숫자입니다.");
				max=com-1;
			}else if(com==user) {
				
				System.out.println("정답!!! 총 "+count+"번 만에 맞췄습니다!");
				b=false;
			}
			
			
		}
		
		
		

	}

}
