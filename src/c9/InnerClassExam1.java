package c9;

public class InnerClassExam1 {
	public static void main(String[] args) {
		Outer.inner oi = new Outer().new inner();
		oi.method();
	}
}

class Outer {
	private int a = 30;
	
	class inner {
		private int a = 20;
		
		public void method() {
			int a = 10;
			System.out.println(a);
			System.out.println(this.a);
			System.out.println(Outer.this.a);
		}
	}
}
