package c6;

public class InheritanceDemo {
    public static void main(String[] args) {
    	// create a Teach object via param-contructor
    	Teacher mathTeacher = new Teacher("Ms. Smith", 35, "T1001", "Math");
    	
    	System.out.println("--- Teacher ---");
    	
    	// getName()... that are inherited from Human superclass
    	System.out.println("Name: " + mathTeacher.getName()); // if it works, it means inheritance works here
    	System.out.println("Age: " + mathTeacher.getAge());
        // getEmployeeId() and getSubject() are Teacher's OWN methods (for its unique fields)

    	
        
        // gradePapers() and conductClass() are Teacher's OWN methods (unique behavior)

    	
    	
        
        // eat() and sleep() are OVERRIDDEN methods - defined in Human (abstract) but implemented in Teacher

    	


        // Create a Student object - Student extends Human
        // Constructor parameters:
        // - First 2 params ("John Doe", 20) are for Human's superclass constructor
        // - Last 2 params ("S2001", 3.8) are for Student's own fields

    	
    	
        
        System.out.println("\n--- Student ---");
        
        
        // getName() and getAge() are INHERITED from Human superclass

        
        
        // getStudentId() and getGpa() are Student's OWN methods (for its unique fields)


        
        
        // attendLecture() and submitAssignment() are Student's OWN methods (unique behavior)

        
        
        
        // eat() and sleep() are OVERRIDDEN methods - defined in Human (abstract) but implemented in Student

        
        

        // Create a HeadTeacher object - HeadTeacher extends Human
        // Constructor parameters:
        // - First 2 params ("Mr. Johnson", 45) are for Human's superclass constructor
        // - Last 2 params (10, "Science") are for HeadTeacher's own fields

        
        
        System.out.println("\n--- HeadTeacher ---");
        // getName() and getAge() are INHERITED from Human superclass


        
        
        // getYearsExperience() and getDepartment() are HeadTeacher's OWN methods

        
        
        // holdMeeting() and evaluateStaff() are HeadTeacher's OWN methods (unique behavior)

        
        
        
        // eat() and sleep() are OVERRIDDEN methods - defined in Human (abstract) but implemented in HeadTeacher

        
    	
    	
    }
}
