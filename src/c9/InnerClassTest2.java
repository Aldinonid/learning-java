package c9;

class OuterB {
	String name;
	private class Inner {
		static int a = 10; // Allowed starting from JDK 16
	}
	public Inner getInstance() {
		System.out.println(OuterB.Inner.a);
		return new Inner();
	}
}

public class InnerClassTest2 {
	public static void main(String[] args) {
		OuterB o = new OuterB();
		System.out.println(o.getInstance());
	}
}
