package ch12;

public class ReCard {

	
	private String kind;
	private int num;
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public ReCard(String kind, int num) {
		this.kind = kind;
		this.num = num;
	}
	public ReCard() {
		this("spade",1);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "kind : "+kind+", number : "+num;
	}
	
	
	
	
	
	
	
	
}
