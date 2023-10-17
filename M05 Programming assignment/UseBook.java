import java.util.Scanner;

public class UseBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the title of the Fiction book
        System.out.print("Enter the title of the Fiction book: ");
        String fictionTitle = scanner.nextLine();

        // Create a Fiction book with the provided title
        fiction fictionBook = new fiction(fictionTitle);

        // Prompt the user for the title of the NonFiction book
        System.out.print("Enter the title of the NonFiction book: ");
        String nonFictionTitle = scanner.nextLine();

        // Create a NonFiction book with the provided title
        NonFiction nonFictionBook = new NonFiction(nonFictionTitle);

        // Close the scanner
        scanner.close();

        // Display the details of the Fiction book
        System.out.println("\nFiction Book Details:");
        System.out.println("Title: " + fictionBook.getTitle());
        System.out.println("Price: $" + fictionBook.getPrice());

        // Display the details of the NonFiction book
        System.out.println("\nNonFiction Book Details:");
        System.out.println("Title: " + nonFictionBook.getTitle());
        System.out.println("Price: $" + nonFictionBook.getPrice());
    }
}
