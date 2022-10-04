package ch12;

public class Person01 {
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Person01(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		return super.equals(obj);
		
		if(obj!=null && obj instanceof Person01) {
//			Person01 per01 = (Person01)obj;
//			boolean check = this.id == per01.id;
//			return check;
			return this.id == ((Person01)obj).id;
			
		}else {
			return false;
		}
		
		
		
		
	}
	
	
	
}
