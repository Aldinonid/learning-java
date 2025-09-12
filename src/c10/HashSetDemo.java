package c10;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		// create a collection object
		HashSet<String> set = new HashSet<String>();
		
		// add elements
		set.add("Hello");
		set.add("World");
		set.add("java");
		// a collection without duplicate elements
		set.add("World");
		
		
		// traverse
		for (String s : set) {
			System.out.println(s);
		}
	}
}
