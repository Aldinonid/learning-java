package c8;

import java.util.ArrayList;
import java.util.List;

class ParentQ {
	void talk() {
		
	}
	
	void show() throws ClassNotFoundException {
		
	}
}

class ChildQ extends ParentQ {
	@Override
	void talk() throws ArrayIndexOutOfBoundsException {
		System.out.println("ChildQ talk()");
		throw new ArrayIndexOutOfBoundsException("Tidak bisa bro");
	}
	
	@Override
	void show() throws ClassNotFoundException {
		
	}
}

public class ExceptionDemo {
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		
		ParentQ p = new ChildQ();
		p.talk();
		
		try {
			int[] arr = { 1, 2, 3 };
			System.out.println(arr[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The Exceptions are handled");
		} finally {
			// codes that always execute
			System.out.println("Done execute");
		}
	}
	
	public static void arrayAndCollections() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
	}
}
