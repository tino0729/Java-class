import java.util.Scanner;

public class TestSandwich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for sandwich details
        System.out.println("Enter sandwich details:");
        System.out.print("Main Ingredient: ");
        String mainIngredient = scanner.nextLine();
        
        System.out.print("Bread Type: ");
        String breadType = scanner.nextLine();
        
        System.out.print("Price: $");
        double price = scanner.nextDouble();
        
        // Create a Sandwich object with the entered details
        Sandwich mySandwich = new Sandwich(mainIngredient, breadType, price);

        // Display sandwich details
        System.out.println("\nSandwich Details:");
        System.out.println("Main Ingredient: " + mySandwich.getMainIngredient());
        System.out.println("Bread Type: " + mySandwich.getBreadType());
        System.out.println("Price: $" + mySandwich.getPrice());

        scanner.close(); // Close the scanner
    }
}
    

