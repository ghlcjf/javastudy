package ch04;

public class Ex07_break {

	public static void main(String[] args) {
		// 1부터 5까지 출력하는 반복문
		int i = 0;
		while (i<5) {
			i++;
			if (i==3) continue;
			System.out.println("i : "+i);			
		}

	}

}
