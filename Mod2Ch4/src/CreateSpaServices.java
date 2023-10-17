import java.util.Scanner;

public class CreateSpaServices {
    public static void main(String[] args) {
        // Declare SpaService objects
        SpaService firstService = new SpaService();
        // Comment out the line that gets data for the secondService object
        // SpaService secondService = new SpaService();
        SpaService thirdService = new SpaService("facial", 22.99);

        // Call the getData method to populate the first SpaService object
        firstService = getData(firstService);

        // Display details for the first SpaService
        System.out.println("First service details:");
        System.out.println(firstService.getServiceDescription() + " $" + firstService.getPrice());

        // Display details for the third SpaService
        System.out.println("Third service details:");
        System.out.println(thirdService.getServiceDescription() + " $" + thirdService.getPrice());
    }

    public static SpaService getData(SpaService service) {
        String serviceDescription;
        double price;

        // Create a Scanner object for user input
        Scanner keyboard = new Scanner(System.in);

        // Prompt the user for and accept service description
        System.out.print("Enter service >> ");
        serviceDescription = keyboard.nextLine();

        // Prompt the user for and accept the price
        System.out.print("Enter price >> ");
        price = keyboard.nextDouble();

        // Clear the Enter key from the input buffer
        keyboard.nextLine();

        // Set the entered service description and price for the SpaService object
        service.setServiceDescription(serviceDescription);
        service.setPrice(price);

        // Close the Scanner
        keyboard.close();

        // Return the filled SpaService object
        return service;
    }
}
