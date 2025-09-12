package c10;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		// create a collection object - TreeSet
		Set<String> set = new TreeSet<>();
		
		// add elements
		set.add("ccc");
		set.add("aaa");
		set.add("aaa"); // duplicate element
		set.add("bbb");
		
		// traverse the TreeSet instance using Iterator
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
	}
}
