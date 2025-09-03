package c6;

public class Student extends Human {
    private String studentId;
    private double gpa;

    // Constructor to initialize Student-specific fields + Human fields
    public Student(String name, int age, String studentId, double gpa) {
        super(name, age); // Call Human's constructor
        this.studentId = studentId;
        this.gpa = gpa;
    }

    // Student-specific methods
    public void attendLecture() {
        System.out.println(getName() + " is attending a lecture.");
    }

    public void submitAssignment() {
        System.out.println(getName() + " is submitting an assignment.");
    }

    // Implement abstract methods from Human
    @Override
    public void eat() {
        System.out.println(getName() + " (Student) is eating in the cafeteria.");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " (Student) is sleeping to rest for exams.");
    }

    // Getters for Student-specific fields
    public String getStudentId() {
        return studentId;
    }

    public double getGpa() {
        return gpa;
    }
}