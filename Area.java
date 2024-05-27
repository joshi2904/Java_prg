//(1)Write a program to print the area of a rectangle by creating a class named 'Area' having //two methods. First method named as 'setDim' takes length and 
//breadth of rectangle as parameters and the second method named as 'getArea' returns the //area of the rectangle.

public class Area {
    private double length;
    private double breadth;

    // Method to set the dimensions of the rectangle
    public void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and return the area of the rectangle
    public double getArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Area rectangle = new Area();
        rectangle.setDim(5, 3);
        System.out.println("The area of the rectangle is: " + rectangle.getArea());
    }
}
