//employee program
//short-cut of Getter setter 

// File: src/Employee.java
public class Employee {
    private String name;
    private int id;
    private double salary;

    // Default constructor
    public Employee() {
    }

    // Parameterized constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Getters and Setters (generated using IDE shortcuts)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}


// File: src/Main.java
public class Main {
    public static void main(String[] args) {
        // Create Employee objects
        Employee emp1 = new Employee();
        emp1.setName("John Doe");
        emp1.setId(101);
        emp1.setSalary(75000);

        Employee emp2 = new Employee("Jane Smith", 102, 85000);

        // Display Employee details
        System.out.println("Employee 1: " + emp1.getName() + ", ID: " + emp1.getId() + ", Salary: $" + emp1.getSalary());
        System.out.println("Employee 2: " + emp2.getName() + ", ID: " + emp2.getId() + ", Salary: $" + emp2.getSalary());
    }
}

