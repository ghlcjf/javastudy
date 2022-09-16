package ch04;

import java.util.Random;
import java.util.Scanner;

public class Game_Ex {

	public static void main(String[] args) {
		// 1부터 100까지 숫자 맞추기
		
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		
		
		int com = r.nextInt(100)+1;
		boolean b = true;
		int count = 0;
		
		System.out.println("숫자 맞추기 게임을 시작합니다.");
		System.out.println("1부터 100까지의 숫자 중 원하는 숫자를 입력해 주세요.");
		
		while(b) {
			int user = Integer.parseInt(in.nextLine());
			
			if(user>com) {
				System.out.println("정답은 "+user+"보다 작은 숫자입니다.");
				count++;
			}else if(user<com) {
				System.out.println("정답은 "+user+"보다 큰 숫자입니다.");
				count++;
			}else if(user==com) {
				count++;
				System.out.println("정답!!!\n총 "+count+"번 만에 맞췄습니다!");
				
				b=false;
			}
		}
		
		

	}

}
