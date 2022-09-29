package ch05;

import java.util.Random;
import java.util.Scanner;

public class Answer11 {

	public static void main(String[] args) {
		// 야구게임 컴퓨터가 뽑은 임의의 숫자(중복X)3개를 맞추세요
		// 컴퓨터가 뽑은 숫자 중 한 개의 종류와 위치를 함께 맞추면 스트라이크, 
		// 한 개의 종류를 맞췄지만 위치가 잘못된 경우는 볼을 선언해서 
		// 3 스트라이크가 나올 때까지 반복하세요.
		// 몇 번 만에 맞췄는지 최종 기록을 출력하세요
		
		System.out.println("야구 게임!!!!시작!");
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		
		
		int[] coms = new int[3];
		int[] users = new int[3];
		int cnt = 0; // 게임 횟수
		
		int ball = 0, strike = 0;
		
		// 게임 시작 전 컴퓨터가 숫자를 정해야 한다.
		for(int i=0;i<coms.length;i++) {
			coms[i] = r.nextInt(10);
			for(int j=0;j<i;j++) {
				if(coms[i]==coms[j]) {
					i--;
					break;
				}
			}
			
		}
		for(int i=0;i<coms.length;i++) {
			System.out.println(coms[i]+" ");
		}
		
		System.out.println("게임 시작");
		
		
		while(strike<3) {
			ball=0;
			strike=0;
			System.out.println("숫자 3개를 입력하세요.");
			for(int i=0;i<users.length;i++) {
				System.out.print((i+1)+"번째 숫자 >>");
				users[i] = Integer.parseInt(in.nextLine());
			}
			
			for(int i=0;i<users.length;i++) {
				for(int j=0;j<coms.length;j++) {
					if(users[i]==coms[j] && i==j) {
						strike++;
					}else if(users[i]==coms[j] && i!=j) {
						ball++;
					}
				}
			}
			System.out.println(strike+"스트라이크 / "+ball+"볼");
			cnt++;
			
		}
		
		System.out.println("플레이 횟수 : "+cnt);
	}

}
