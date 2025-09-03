package c6;

public abstract class Human {
    private String name;
    private int age;

    // Constructor to initialize name and age
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters for name and age
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Abstract methods (subclasses must implement these)
    public abstract void eat();
    public abstract void sleep();
}