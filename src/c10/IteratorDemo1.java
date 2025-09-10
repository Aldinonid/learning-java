package c10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo1 {
	public static void main(String[] args) {
		iteratorRemove();
		
		
	}
	
	static void iteratorRemove() {
		List<Integer> c = new ArrayList<>();
		
		c.add(1);
		c.add(2);
		c.add(3);
		c.add(4);
		
		// 1. remove through iterator.remove() - most recommended, most safe way for removal
//		Iterator<String> it = c.iterator();
//		while (it.hasNext()) {
//			String element = it.next();
//			if (element.equals("java")) {
//				it.remove();
//			}
//		}
//		System.out.println(c);
		
		// 2. index-based removal
//		c.remove(2);
//		System.out.println(c);
		
		// 3. value(object)-based removal
		c.remove(3); // why it works? why remove() accepts a String, because it takes it as a String object.
		// what type of param java will consider for this 3? an object? or an int number?
		// for other primitive type, e.g., int, java will do the "auto-boxing" for us.
		System.out.println(c);
	}
	
	static void iteratorLoop() {
		List<String> c = new ArrayList<>();
		
		c.add("hello");
		c.add("world");
		c.add("java");
		c.add("javaee");
		
		// 1. Iterator
		
		
		// 2. Enhance for-loop
		// 3. lamda expression
		// 4. standard for-loop
		for (int i = 0; i < c.size(); i++) {
			String string = c.get(i);
			System.out.println(string);
		}
		
		// 5. ListIterator
		ListIterator listIt = c.listIterator();
	}
	
	static void iteratorIntro() {
		Collection<String> c = new ArrayList<>();
		
		c.add("Coba");
		c.add("Hello");
		c.add("java");
		
		// create the iterator
		Iterator<String> it = c.iterator();
		
		// use while loop to traverse the collection
		while (it.hasNext()) {
			String s = it.next();
			if ("java".equals(s)) {
				// remove the current element that the iterator is pointing to
				it.remove();
			}
			System.out.println(c);
		}
		
		// demo lambda expression by using foreach()
		c.forEach(item -> System.out.println(item));
	}
}
