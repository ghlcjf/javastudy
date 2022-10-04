package ch12;

public class Card02 {
	private String kind;
	private int number;
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public Card02() {
		this("spade",1);
	}
	
	public Card02(String kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}
	@Override
	public String toString() {
//		// TODO Auto-generated method stub
//		return super.toString();
		return "kind : "+kind+", number : "+number;
		
		
		
	}
	
	
	
	
}
