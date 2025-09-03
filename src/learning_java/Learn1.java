package learning_java;

public class Learn1 {
	public static void main(String[] args) {
		System.out.println("Hello 世界");
		Boolean isSekai = false;
		String sekai = "世界";
		int number = 123;
		char utsu = '鬱';
		float contohFloat = Float.MAX_VALUE;
		System.out.println("boolean: " + isSekai);
		System.out.println("Char: " + utsu);
		System.out.println(Float.toString(contohFloat));
		System.out.println(sekai);
		System.out.println(number);
		System.out.println(remove("eloquent"));
	}

	public static String remove(String str) {
		return str.substring(1, str.length() - 1);
	}
}
