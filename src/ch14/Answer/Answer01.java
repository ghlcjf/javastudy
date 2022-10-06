package ch14.Answer;

import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class Answer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> lotto = new TreeSet<>();
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		
		System.out.println("몇번?");
		int s = Integer.parseInt(in.nextLine());
		
		for(int j=0;j<s;j++) {
			for(int i=0;lotto.size()<6;i++) {
				lotto.add(r.nextInt(45)+1);
			}
			for(int num:lotto) {
				System.out.print("("+num+") ");
				
			}
			lotto.clear();
			System.out.println("");
			
		}
		
		
		
	}

}
