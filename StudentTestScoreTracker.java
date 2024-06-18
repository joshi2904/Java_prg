import java.util.ArrayList;
import java.util.Scanner;

public class StudentTestScoreTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int n = scanner.nextInt();

        // Initialize the ArrayList
        ArrayList<Integer> scores = new ArrayList<>();

        // Read n integers and add them to the ArrayList
        for (int i = 0; i < n; i++) {
            int score = scanner.nextInt();
            scores.add(score);
        }

        // Output the elements in the ArrayList
        System.out.println("Elements in the ArrayList:");
        for (int score : scores) {
            System.out.println(score);
        }
        
        scanner.close();
    }
}
