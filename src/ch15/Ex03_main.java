package ch15;

public class Ex03_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Television tv = new Television(new RemoteController() {
			
			@Override
			public void turnOn() {
				System.out.println("텔레비전을 켭니다.");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("텔레비전을 끕니다.");
				
			}
		});
		
		
		
		tv.tvOn();
		tv.tvOff();
		
		tv.m(new RemoteController2() { // 데이터 == 메서드 거의..
			@Override
			public void muted() {
				System.out.println("음소거를 합니ㄷ...");
				
			}
		});
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
