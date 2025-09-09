package c8;

class ParentQ {
	void talk() {
		
	}
}

class ChildQ extends ParentQ {
	@Override
	void talk() throws ArrayIndexOutOfBoundsException {
		System.out.println("ChildQ talk()");
		throw new ArrayIndexOutOfBoundsException("Tidak bisa bro");
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
}
