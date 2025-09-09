package c9;

// Outer class: Outer01
class Outer01 {
	private static String sc_name = "HITHINK Programmer";
	
	
	// Static inner class: Inner01
	public static class Inner01 {
		private String name;
		
		public Inner01(String name) {
			this.name = name;
		}
		
		public void showName() {
			System.out.println(this.name);
			// Extension: Static inner class can directly access outer class's static members
			System.out.println(sc_name);
		}
	}
}

public class InnerClassDemo01 {
	public static void main(String[] args) {
		Outer01.Inner01 in = new Outer01.Inner01("Mike");
		in.showName();
	}
}
