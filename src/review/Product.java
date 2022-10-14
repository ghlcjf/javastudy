package review;

public class Product {
	private String name;
	private int num;
	private int cost;
	private int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Product(String name, int num, int cost, int price) {
		
		this.name = name;
		this.num = num;
		this.cost = cost;
		this.price = price;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+"의 원가는 "+this.cost+"원이고 판매 대금은 "+this.cost*num+"원입니다.\n총 수익은 "+(this.price*num-this.cost*num)+"원입니다.";
	}
	
	
	
	
}
