package pzn_generic;

public class GenericClassApp {
	public static void main(String[] args) {
		MyData<String> stringMyData = new MyData<String>("Eko");
		MyData<Integer> intMyData = new MyData<Integer>(10);
		
		String stringValue = stringMyData.getData();
		Integer intValue = intMyData.getData();
		
		System.out.println(stringValue);
		System.out.println(intValue);
	}
}
