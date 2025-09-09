package c7;

class Animal {
	void eat() {
		System.out.println("This is animal eat");
	}
}

class Dog extends Animal {
	@Override
	void eat() {
		System.out.println("This is dog eating");
	}
	
	void sleep() {
		System.out.println("This is dog sleeping");
	}
}

class Cat extends Animal {
	@Override
	void eat() {
		System.out.println("This is cat eating");
	}
	
	void sleep() {
		System.out.println("Cat is sleeping");
	}
	
	void catchMouse() {
		System.out.println("Catching a mouse");
	}
}

public class PolymorphismTest {
	public static void main(String[] args) {
		Animal p = new Dog();
		
		if (p instanceof Cat c) {
			c.sleep();
		} else if (p instanceof Dog d) {
			d.sleep();
		} else {
			System.out.println("Invalid Type, can't be casted");
		}
	}
}
