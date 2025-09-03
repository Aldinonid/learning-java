package oop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Collections {
	public static void main(String[] args) {
//		arrayList();
//		immutableArrayList();
		arrayList2();
	}
	
	static void arrayList2() {
		List<String> lists = new ArrayList<>();
		lists.add("aaa");
		lists.add("bbb");
		lists.add("ccc");
		
		// Method .forEach
		System.out.print("[");
		lists.forEach(list -> System.out.print(list == lists.get(lists.size() - 1) ? list : list + ", "));
		System.out.println("]");
		
		// Method: String join()
		System.out.println("[" + String.join(", ", lists) + "]");
		
		// Method: Stream API 
		String result = lists.stream().collect(Collectors.joining(", ", "[", "]"));
		System.out.println(result);
	}
	
	static void arrayList() {
		ArrayList<String> array = new ArrayList<>();
		
		array.add("New");
		array.add("Java");
		array.add("Learning");
		array.add("Old");
		
		
		boolean isRemoved = array.remove("Nothing"); 
		System.out.println("Cause \"Nothing\" isn't in the list removed will be false: " + isRemoved);
		
		System.out.println("System remove the list of " + array.remove(2));
		
		array.set(0, "Old");
		
		System.out.println("Get the list of index 0 that has been updated is " + array.get(0));
		
		System.out.println("Size of the array list is "+ array.size());
		
		System.out.println();
		System.out.print("Now we print all the list ");
		array.forEach(arr -> System.out.print(arr + " "));
	}
	
	static void immutableArrayList() {
		List<String> immutableList = List.of("A", "B", "C");
		
		immutableList.add("acb");
	}
	
	
	
}
