package pzn_generic;

public class ContravariantApp {
	public static void main(String[] args) {
		MyData<Object> objectMyData = new MyData<>("Eko");
		objectMyData.setData(1000);
		
		process(objectMyData);
		
		System.out.println(objectMyData.getData());
	}
	
	public static void process(MyData<? super String> myData) {
		Object value = myData.getData();
		System.out.println("Process parameter " + value);
		
		myData.setData("Kurniawan");
	}
}
