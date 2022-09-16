package ch04;

import java.util.Random;
import java.util.Scanner;

public class Paper {

	public static void main(String[] args) {
		// 가위바위보 게임
		
		
		//사용할 클래스 입력
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		
		// 변수 선언
		String com = "";
		int i=0; //게임 진행할 횟수
		int j = 1; // 게임 카운트
		int countW = 0;
		int countL = 0;
		int countD = 0;
		
		System.out.println("안녕하세요, 가위바위보 게임입니다.");
		System.out.print("게임 진행할 횟수를 입력해 주세요>");
		i = Integer.parseInt(in.nextLine());
		
		
		
		while(j<=i) {
				
			
			//컴퓨터에게 임의의 난수 부여 후 가위바위보로 바꿔주기
			int comNum = r.nextInt(3); //0,1,2
			
			if(comNum==0) {
				com="가위";
			}else if(comNum==1) {
				com="바위";
			}else if(comNum==2) {
				com="보";
			}
			
			
			System.out.println("가위바위보 게임을 시작합니다.");
			System.out.println("가위, 바위, 보 중 하나를 입력해 주세요.");
			String user = in.nextLine();
			
			switch(user) {
			case "가위" :
				j++;
				if(com.equals("가위")) {
					System.out.println("비겼습니다.");
					countD++;
				}else if(com.equals("바위")) {
					System.out.println("졌습니다.");
					countL++;
				}else if(com.equals("보")) {
					System.out.println("이겼습니다.");
					countW++;
				}
				break;
			case "바위" :
				j++;
				if(com.equals("가위")) {
					System.out.println("이겼습니다.");
					countW++;
				}else if(com.equals("바위")) {
					System.out.println("비겼습니다.");
					countD++;
				}else if(com.equals("보")) {
					System.out.println("졌습니다.");
					countL++;
				}
				break;
			case "보" :
				j++;
				if(com.equals("가위")) {
					System.out.println("졌습니다.");
					countL++;
				}else if(com.equals("바위")) {
					System.out.println("이겼습니다.");
					countW++;
				}else if(com.equals("보")) {
					System.out.println("비겼습니다.");
					countD++;
				}
				break;
			default:
				System.out.println("잘못 입력했습니다. \n확인 후 다시 입력해 주세요");
			}
			
	//		System.out.println("컴퓨터 : "+com);
	//		System.out.println("유저 : "+user);
			
			
			
			
			
		}
		System.out.println("승리 : "+countW+"회, 패배 : "+countL+"회, 무승부 : "+countD+"회로 결과는...");
		if(countL<countW) {
			System.out.println("승리!");
		}else if(countL>countW) {
			System.out.println("패배!");
		}else if(countL==countW) {
			System.out.println("무승부!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
