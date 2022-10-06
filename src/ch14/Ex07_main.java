package ch14;

import java.util.Stack;

public class Ex07_main {

	public static void main(String[] args) {
		// 졸려
		Stack<String> names = new Stack<>();
		
		names.push("둘리");
		System.out.println(names.peek());
		names.push("또치");
		System.out.println(names.peek());
		names.push("도우너");
		System.out.println(names.peek());
		names.push("마이클");
		System.out.println(names.peek());
		names.push("희동이");
		System.out.println(names.peek());
		System.out.println("------------------------------------------");
		while(!names.isEmpty()) {
			System.out.println(names.pop());
		}
		
		
	}

}
