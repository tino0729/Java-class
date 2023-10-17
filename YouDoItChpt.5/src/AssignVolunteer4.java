import java.util.Scanner;

public class AssignVolunteer4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int donationType;
        String volunteer;
        String message;

        final int CLOTHING_CODE = 1;
        final int FURNITURE_CODE = 2;
        final int ELECTRONICS_CODE = 3;
        final int OTHER_CODE = 4;

        final String CLOTHING_PRICER = "Regina";
        final String FURNITURE_PRICER = "Wei";
        final String ELECTRONICS_PRICER = "Lydia";
        final String OTHER_PRICER = "Marco";

        System.out.print("Enter donation type (1 for clothing, 2 for furniture, 3 for electronics, 4 for other): ");
        donationType = input.nextInt();

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

        System.out.println("You entered " + donationType);
        System.out.println("The volunteer who will price this item is " + volunteer);
        System.out.println("This is " + message);
    }
}
