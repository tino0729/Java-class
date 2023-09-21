import java.util.*;

public class CustomerSurvey {
    public static void main(String args[]) {
        // Declare a variable to hold the consumer's rating.
        int rating;
        // Declare constants for the lowest and highest ratings (1 and 5).
        final int MIN = 1;
        final int MAX = 5;
        
        // Create a Scanner input object to read user input.
        Scanner input = new Scanner(System.in);

        // Add a series of nine output statements that explain the rating system and prompt the user.
        System.out.println("Please enter a value that");
        System.out.println("represents your satisfaction with");
        System.out.println("our service.");
        System.out.println("Enter a value between " + MIN);
        System.out.println("and " + MAX);
        System.out.println("with " + MAX + " meaning highly");
        System.out.println("satisfied and");
        System.out.println(MIN + " meaning not at all satisfied.");
        System.out.print("Enter your rating >> ");
        
        // Get the numeric rating from the user.
        rating = input.nextInt();

        // Add a loop that continues to execute while the user's response is out of range (1-5).
        while (rating < MIN || rating > MAX) {
            System.out.println("You must enter a value");
            System.out.println("between " + MIN + " and " + MAX);
            System.out.print("Please try again >> ");
            rating = input.nextInt();
        }

        // The loop ends only when the user's response is in range.
        // Thank the user and add closing curly braces for the main() method and for the class.
        System.out.println("Thank you.");
        input.close(); // Close the Scanner to prevent resource leak.
    }
}
