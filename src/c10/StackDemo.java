package c10;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class StackDemo {
	public static void main(String[] args) {
		
		
	}
	
	static void firstStack() {
		Queue<String> queue = new LinkedList<>();
		
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		
		String firstElement = queue.poll();
		
		System.out.println(firstElement);
		System.out.println(queue);
	}
	
	static void testStack() {
		Deque<String> stack = new ArrayDeque<>();
		
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		String pop = stack.pop();
		
		System.out.println(pop);
		System.out.println(stack);
	}
}
