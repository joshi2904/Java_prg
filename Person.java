//calculate tax of person class

// File: src/Person.java
public class Person {
    private String name;
    private double income;

    // Constructor to initialize the name and income
    public Person(String name, double income) {
        this.name = name;
        this.income = income;
    }

    // Method to calculate the tax based on income
    public double calculateTax() {
        double tax = 0.0;
        if (income <= 10000) {
            tax = 0;  // No tax for income up to 10,000
        } else if (income <= 30000) {
            tax = (income - 10000) * 0.1;  // 10% tax for income between 10,001 and 30,000
        } else if (income <= 100000) {
            tax = (20000 * 0.1) + ((income - 30000) * 0.2);  // 20% tax for income between 30,001 and 100,000
        } else {
            tax = (20000 * 0.1) + (70000 * 0.2) + ((income - 100000) * 0.3);  // 30% tax for income above 100,000
        }
        return tax;
    }

    // Method to get the name of the person
    public String getName() {
        return name;
    }

    // Method to get the income of the person
    public double getIncome() {
        return income;
    }
}
