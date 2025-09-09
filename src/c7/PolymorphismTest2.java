package c7;

class Parent2 {
	String name = "Parent Name";
	
	void show() {
		System.out.println("Parent's show()");
	}
}

class Child2 extends Parent2 {
	String name = "Child Name";
	
	@Override
	void show() {
		System.out.println("Child's show()");
	}
}

public class PolymorphismTest2 {
	public static void main(String[] args) {
		Parent2 p = new Child2();
		
		System.out.println(p.name);
		p.show();
	}
}
