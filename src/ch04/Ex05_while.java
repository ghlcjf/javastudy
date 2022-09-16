package ch04;

public class Ex05_while {

	public static void main(String[] args) {
		// while문으로 1부터 10까지 출력
		
		int i = 0;
		
		while (i<10) {
			i+=1; // i=i+1, i++과 같은 말
			System.out.println("i : "+i);
			
		}
		
		
		// do while문으로 1부터 10까지 출력
		
		
		int j = 0;
		
		do {		
			j += 1;
			System.out.println("j : "+j);
			
		} while(j<10);
		
		
		
		// while문으로 10부터 1까지 출력
		
		i=10;
		while (i>0) {
			System.out.println("i : "+i);
			i -=1;
		}
		
		
		
		
		
		
		
	}

}
