package ch14;
import java.util.LinkedList;
import java.util.Queue;
public class Ex08_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> names = new LinkedList<>();
		
		names.offer("둘리");
		System.out.println(names.peek());
		names.offer("희동");
		System.out.println(names.peek());
		names.offer("또치");
		System.out.println(names.peek());
		names.offer("공순");
		System.out.println(names.peek());
		names.offer("도우너");
		System.out.println(names.peek());
		System.out.println("----------------------------------");
		while(!names.isEmpty()) {
			System.out.println(names.poll());
		}
		
		
		
	}

}
