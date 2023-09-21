package AssignVolunteer;
import java.util.Scanner;

public class AssignVolunteer4 {
    public static void main(String[] args) {
        // Declare variables and constants
        int donationType;
        String volunteer;
        String message; // Added variable for donation message
        final int CLOTHING_CODE = 1;
        final int FURNITURE_CODE = 2;
        final int ELECTRONICS_CODE = 3;
        final int OTHER_CODE = 4;
        final String CLOTHING_PRICER = "Regina";
        final String FURNITURE_PRICER = "Wei";
        final String ELECTRONICS_PRICER = "Lydia";
        final String OTHER_PRICER = "Marco";

        // Define the input device and prompt the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer... ");
        donationType = input.nextInt();

        // Use a switch statement to choose the volunteer's name and set the message
        switch (donationType) {
            case CLOTHING_CODE:
                volunteer = CLOTHING_PRICER;
                message = "a clothing donation";
                break;
            case FURNITURE_CODE:
                volunteer = FURNITURE_PRICER;
                message = "a furniture donation";
                break;
            case ELECTRONICS_CODE:
                volunteer = ELECTRONICS_PRICER;
                message = "an electronics donation";
                break;
            case OTHER_CODE:
                volunteer = OTHER_PRICER;
                message = "another donation type";
                break;
            default:
                volunteer = "invalid";
                message = "an invalid donation type";
        }

        // Display the chosen code, volunteer, and donation message
        System.out.println("You entered " + donationType);
        System.out.println("The volunteer who will price this item is " + volunteer);
        System.out.println("This is " + message);
    }
}
