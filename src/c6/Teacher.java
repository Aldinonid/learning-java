package c6;

public class Teacher extends Human {
    private String employeeId;
    private String subject;

    // Constructor to initialize Teacher-specific fields + Human fields
    public Teacher(String name, int age, String employeeId, String subject) {
        super(name, age); // Call Human's constructor
        this.employeeId = employeeId;
        this.subject = subject;
    }

    // Teacher-specific methods
    public void gradePapers() {
        System.out.println(getName() + " is grading papers for " + subject + ".");
    }

    public void conductClass() {
        System.out.println(getName() + " is conducting a " + subject + " class.");
    }

    // Implement abstract methods from Human
    @Override
    public void eat() {
        System.out.println(getName() + " (Teacher) is eating during lunch break.");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " (Teacher) is sleeping after a long day.");
    }

    // Getters for Teacher-specific fields
    public String getEmployeeId() {
        return employeeId;
    }

    public String getSubject() {
        return subject;
    }
}