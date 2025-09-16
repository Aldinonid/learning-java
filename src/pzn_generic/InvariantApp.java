package pzn_generic;

public class InvariantApp {
	public static void main(String[] args) {
		
		MyData<String> stringMyData = new MyData<>("Eko");
		// doIt(stringMyData); // ERROR
		// MyData<Object> objectMyData = stringMyData; // ERROR
		
		MyData<Object> objectMyData = new MyData<>(1000);
		// MyData<Integer> integerMyData = objectMyData; // ERROR
		// doItInteger(objectMyData); // ERROR
	}
	
	public static void doIt(MyData<Object> objectMyData) {
		// do nothing
	}
	
	public static void doItInteger(MyData<Integer> integerMyData) {
		// do nothing
	}
}
