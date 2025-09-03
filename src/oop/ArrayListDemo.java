package oop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<Student> lists = new ArrayList<Student>();
		
		lists.add(new Student("Ahmad", 17));
		lists.add(new Student("Ricky", 7));
		lists.add(new Student("Maikel", 27));
		
		// Method 0: .forEach
		System.out.println("Method 0 (.forEach)");
		System.out.print("[");
		lists.forEach(list -> System.out.print(list == lists.get(lists.size() - 1) ? list : list + ", "));
		System.out.println("]");
		
		System.out.println();
		
		// Method 1: use index to check last element
		System.out.println("Method 1 use index to check last element");
		System.out.print("[");
		for (int i = 0; i < lists.size(); i++) System.out.print(lists.get(i) == lists.get(lists.size() - 1) ? lists.get(i) : lists.get(i) + ", ");
		System.out.println("]");
		
		System.out.println();
		
		// Method 2: use iterator and hasNext()
		System.out.println("Method 2 use iterator and hasNext()");
		System.out.print("[");
		Iterator<Student> iterator = lists.iterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			System.out.print(!iterator.hasNext() ? student : student + ", ");
		}
		System.out.println("]");
		
		System.out.println();
		
		// Method 3: Using String.join() (it's recommended method - since Java 8)
		System.out.println("Method 3 Using String.join() but i need use Stream because we use custom class");
		String strResult = String.join(", ", lists.stream().map(Student::toString).toList());
		System.out.println("[" + strResult + "]");
		
		System.out.println();
		
		// Method 4: Using Stream API (since Java 8)
		System.out.println("Method 4 Using Stream API");
		String result = lists.stream().map(Student::toString).collect(Collectors.joining(", ", "[", "]"));
		System.out.println(result);
		
		System.out.println();
		
		// Method 5: StringBuilder
		System.out.println("Method 5");
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < lists.size(); i++) {
			sb.append(lists.get(i));
			if (i < lists.size() - 1) {
				sb.append(", ");
			}
			
		}
		sb.append("]");
		System.out.println(sb);
	}
}
