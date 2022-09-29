package classanswercard;

public class CardMain {

	public static void main(String[] args) {
		
		Card card1 = new Card(3,false);
		Card card2 = new Card();
		
		System.out.println(card1.info()); // 3
		System.out.println(card2.info()); // 1k

	}

}
