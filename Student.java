//Write a program to print the names of students by creating a Student class. If no name is //passed while creating an object of Student class, 
//then the name should be "Unknown", otherwise the name should be equal to the String value //passed while creating object of Student class.

public class Student {
    private String name;

    // Default constructor setting name to "Unknown"
    public Student() {
        this.name = "Unknown";
    }

    // Constructor that accepts a name
    public Student(String name) {
        this.name = name;
    }

    // Method to get the name of the student
    public String getName() {
        return name;
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        // Creating student objects
        Student student1 = new Student();
        Student student2 = new Student("Alice");

        // Printing student names
        System.out.println("Student 1 name: " + student1.getName());
        System.out.println("Student 2 name: " + student2.getName());
    }
}
