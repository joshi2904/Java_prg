//write a program to count the number of objects created by the users 


public class UserObject {

    // Static variable to keep track of the number of objects created
    private static int objectCount = 0;

    // Constructor
    public UserObject() {
        // Increment the object count each time a new object is created
        objectCount++;
    }

    // Static method to return the number of objects created
    public static int getObjectCount() {
        return objectCount;
    }

    public static void main(String[] args) {
        // Create some objects
        UserObject obj1 = new UserObject();
        UserObject obj2 = new UserObject();
        UserObject obj3 = new UserObject();

        // Print the number of objects created
        System.out.println("Number of objects created: " + UserObject.getObjectCount());
    }
}
