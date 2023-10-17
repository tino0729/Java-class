import java.util.Scanner;
import java.time.LocalDate;

public class TestFitnessTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instantiate the first FitnessTracker object with user input
        System.out.println("Enter activity name: ");
        String activityName = scanner.nextLine();

        System.out.println("Enter minutes spent: ");
        int minutesSpent = scanner.nextInt();

        // Clear the newline character from the input buffer
        scanner.nextLine();

        System.out.println("Enter date (yyyy-mm-dd): ");
        String dateInput = scanner.nextLine();
        LocalDate date = LocalDate.parse(dateInput);

        FitnessTracker tracker1 = new FitnessTracker(activityName, minutesSpent, date);

        // Instantiate the second FitnessTracker object using the default constructor
        FitnessTracker tracker2 = new FitnessTracker();

        // Display the values for each object
        System.out.println("\nFitness Tracker 1:");
        displayFitnessTrackerInfo(tracker1);

        System.out.println("\nFitness Tracker 2 (Default Values):");
        displayFitnessTrackerInfo(tracker2);

        scanner.close();
    }

    public static void displayFitnessTrackerInfo(FitnessTracker tracker) {
        System.out.println("Activity: " + tracker.getActivityName());
        System.out.println("Minutes Spent: " + tracker.getMinutesSpent());
        System.out.println("Date: " + tracker.getDate());
    }
}
