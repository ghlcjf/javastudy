package ch12;

public class Point01 implements Cloneable{
	private int x,y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Point01(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x="+x+", y="+y;
	}

	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		}catch(CloneNotSupportedException e) {}
		return obj;
	}
	
	
	
	
	
	
	
}
