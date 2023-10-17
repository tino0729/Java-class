import java.util.Scanner;

public class BookArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to hold 10 books
        Book[] books = new Book[10];

        // Prompt the user to enter book information for each slot in the array
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Book #" + (i + 1) + ":");
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.print("Is it Fiction (F) or NonFiction (N): ");
            String bookType = scanner.nextLine().toUpperCase();

            // Create the appropriate book type based on user input
            if (bookType.equals("F")) {
                books[i] = new fiction(title);
            } else if (bookType.equals("N")) {
                books[i] = new NonFiction(title);
            } else {
                System.out.println("Invalid input. Please enter 'F' for Fiction or 'N' for NonFiction.");
                i--; // Reprompt for the same slot in the array
            }
        }

        // Close the scanner
        scanner.close();

        // Display details about all 10 books
        System.out.println("\nDetails of all 10 Books:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Book #" + (i + 1) + ":");
            System.out.println("Title: " + books[i].getTitle());
            System.out.println("Price: $" + books[i].getPrice());
            System.out.println();
        }
    }
}
