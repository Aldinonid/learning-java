package pzn_generic;

public class CovariantApp {
	public static void main(String[] args) {
		
		MyData<String> stringMyData = new MyData<>("Eko");
		
		process(stringMyData);
		
		MyData<? extends Object> myData = stringMyData;
	}
	
	public static void process(MyData<? extends Object> myData) {
		System.out.println(myData.getData());
		
//		myData.setData("Eko"); 
		// Covariant not possible to set data, cause it danger if we change the data type from initialization.
	}
}
