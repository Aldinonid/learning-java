package c6;

public class HeadTeacher extends Human {
    private int yearsExperience;
    private String department;

    // Constructor to initialize HeadTeacher-specific fields + Human fields
    public HeadTeacher(String name, int age, int yearsExperience, String department) {
        super(name, age);
        this.yearsExperience = yearsExperience;
        this.department = department;
    }

    // HeadTeacher-specific methods
    public void holdMeeting() {
        System.out.println(getName() + " is holding a meeting for the " + department + " department.");
    }

    public void evaluateStaff() {
        System.out.println(getName() + " is evaluating staff in the " + department + " department.");
    }

    // Implement abstract methods from Human
    @Override
    public void eat() {
        System.out.println(getName() + " (HeadTeacher) is eating at their desk.");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " (HeadTeacher) is catching up on sleep over the weekend.");
    }

    // Getters for HeadTeacher-specific fields
    public int getYearsExperience() {
        return yearsExperience;
    }

    public String getDepartment() {
        return department;
    }
}