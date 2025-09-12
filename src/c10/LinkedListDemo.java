package c10;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		// initialize and instantiate a LinkedList instance
		LinkedList<String> list = new LinkedList<>();
		System.out.println(list);
		
		// 1. addition methods
		System.out.println("\n=== Adding Elements ===");
		list.add("Apple");
		list.add(0, "Banana");
		list.addFirst("Cherry");
		System.out.println("After additions: " + list);
		
		// 2. queue ops
		System.out.println("\n=== Queue ops ===");
		list.offer("Fig");
		list.offerFirst("Grapes");
		System.out.println("After queue ops: " + list);
		
		// 3. retrieval methods
		
		// 4. bulk ops
		System.out.println("\n=== bulk ops ===");
		LinkedList<String> newElements = new LinkedList<>();
		newElements.add("Kiwi");
		newElements.add("Lemon");
		
		list.addAll(newElements); // this means bulk ops
		System.out.println("After bulk ops: " + list);
	}
}
