package ch11;

public class Re01_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//-----------------------------------------------------------
		
		
		String data = null;
//		System.out.println(data.toString());
		try {
			System.out.println(data.toString());
		}catch(NullPointerException e) {
			System.out.println("NullPointer 예외 발생");
		}
		//--------------------------------------------------------------
		
		
		int[] num = {1,2,3};
		try {
			for(int i=0;i<=num.length;i++) {
				System.out.println(num[i]);
			}
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds 예외 발생");
		}
		//---------------------------------------------------------------
		
		
		String data1 = "A101";
		try {
			int value = Integer.parseInt(data1);
			System.out.println(value);
			
		}catch(NumberFormatException e) {
			System.out.println("NumberFormat 예외 발생");
		}
		
		//------------------------------------------------------------------
		
		Animal ani = new Dog();
		
		Dog dog = (Dog)ani;
		
		
		try {
			Cat cat = (Cat)ani;
		}catch(ClassCastException e) {
			System.out.println("ClassCast 예외 발생");
		}
		
		
		
		
		
		
		
		
		System.out.println("예외 발생 이후");
	}

}
