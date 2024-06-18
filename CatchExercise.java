Write a java program using multiple catch blocks. Create a class CatchExercise inside the try block declare an array a[] and initialize with value a[5] =30/5;. In each catch block show Arithmetic exception and ArrayIndexOutOfBoundsException.

=>public class CatchExercise {
    public static void main(String[] args) {
        try {
            // Declare an array
            int[] a = new int[5];

            // This statement will cause ArithmeticException if not properly handled
            a[5] = 30 / 0;

            // This statement will cause ArrayIndexOutOfBoundsException
            a[5] = 10;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }

        System.out.println("Execution continues after the try-catch blocks.");
    }
}
