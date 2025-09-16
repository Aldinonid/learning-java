package pzn_generic;

public class ArrayHelperApp {
	public static void main(String[] args) {
		
		String[] names = {"Eko", "Kurniawan", "Khannedy"};
		Integer[] numbers = {1, 2, 3, 4, 5};
		
		System.out.println(ArrayHelper.count(names));
		System.out.println(ArrayHelper.count(numbers));
	}
}
