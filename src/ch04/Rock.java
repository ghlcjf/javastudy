package ch04;

import java.util.Random;
import java.util.Scanner;

public class Rock {

	public static void main(String[] args) {
		// 가위바위보 게임
		// 사용할 클래스 선언
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		
		// 컴퓨터가 입력받은 난수를 가위, 바위, 보로 바꿀 때 사용할 변수 선언
		String com = "";
		// 입력 받은 게임 횟수를 저장할 변수 선언
		int num=0;
		int i=0;
		
		// 결과를 셀 변수 선언
		int countWin = 0;
		int countlose = 0;
		int countdraw = 0;
			
		System.out.println("가위바위보 게임을 시작합니다.");
		System.out.println("게임 횟수를 입력해 주세요");
		num = Integer.parseInt(in.nextLine());
		System.out.println("지금부터 가위바위보 게임을 "+num+"회 진행합니다~");
		while(i<num) {
			// 컴퓨터가 입력받을 임의의 난수
			int comNum = r.nextInt(3); //0, 1, 2
			// 컴퓨터가 입력받을 임의의 난수 0, 1, 2를 가위, 바위, 보로 변환
			if(comNum==0) {
				com = "가위";
			}else if(comNum==1) {
				com = "바위";
			}else if(comNum==2) {
				com = "보";
			}
			
			//유저 입력
			System.out.println("가위, 바위, 보 중 하나를 입력해 주세요");
			String user = in.nextLine();
			
			
			// switch문을 이용해 결과 출력
			
			switch(user) {
			case "가위" :
				if(com.equals("가위")) {
					System.out.println("비겼습니다.");
					countdraw++;
				}else if(com.equals("바위")) {
					System.out.println("졌습니다..");
					countlose++;
				}else if(com.equals("보")) {
					System.out.println("이겼습니다!!");
					countWin++;
				}
				i++;
				break;
			case "바위" :
				if(com.equals("가위")) {
					System.out.println("이겼습니다!");
					countWin++;
				}else if(com.equals("바위")) {
					System.out.println("비겼습니다.");
					countdraw++;
				}else if(com.equals("보")) {
					System.out.println("졌습니다.");
					countlose++;
				}
				i++;
				break;
			case "보" :
				if(com.equals("가위")) {
				System.out.println("졌습니다..");
				countlose++;
				}else if(com.equals("바위")) {
					System.out.println("이겼습니다!");
					countWin++;
				}else if(com.equals("보")) {
					System.out.println("비겼습니다.");
					countdraw++;
				}
				i++;
				break;
			case "중단":
				break;
			default:
				System.out.println("잘못 입력했습니다.\n 다시 입력해주세요.");
			}
			if(num>i) {
				
				System.out.println("앞으로 "+(num-i)+"회 남았습니다");
			}
		}
		System.out.println("게임 결과!");
		System.out.println("승리 : "+countWin+"회, "+"패배 : "+countlose+"회, "+"무승부 : "+countdraw+"회입니다.");
		if(countWin>countlose) {
			System.out.println("최종 승리!!");
		}else if(countWin==countlose) {
			System.out.println("무승부!");
		}else if(countWin<countlose) {
			System.out.println("패배!!!!!!!!");
		}
		
		System.out.println("게임을 종료합니다.");
		
		
	}

}
