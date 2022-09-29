package classanswercard;

public class Card {
	int num = 1;
	boolean run = true;
	
	Card(){}
	Card(int num,boolean run){ 
		this.num = num;
		this.run = run;
	}
	
	public String info(){
		String result = "";
		result +=num;
		if(run) {
			result+="k";
		}
		return result;
	}
}
