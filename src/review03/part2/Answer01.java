package review03.part2;

public class Answer01 {
	public static void main(String[] args) {
		// 편의점에서 간식을 구매했더니 22,320원이 나왔다
		// 5만원 권을 제출하고 받을 거스름돈을 화폐 매수대로 출력하세요
		
		
		int balance = 50000-22320;
		
		
		System.out.println(balance);
		System.out.println("만원권 : "+balance/10000);
		System.out.println("오천원권 : "+balance%10000/5000);
		System.out.println("천원권 : "+balance%10000%5000/1000);
		System.out.println("오백원권 : "+balance%10000%5000%1000/500);
		System.out.println("백원권 : "+balance%10000%5000%1000%500/100);
		System.out.println("오십원권 : "+balance%10000%5000%1000%500%100/50);
		System.out.println("십원권 : "+balance%10000%5000%1000%500%100%50/10);
		
		
		
	}
}
