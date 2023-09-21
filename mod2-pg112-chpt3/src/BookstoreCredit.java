//Clemente De Rosa
// 8-30-2023
// Chapter 3 page 112, exercise 5


import java.util.Scanner;

public class BookstoreCredit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student's grade point average: ");
        double gpa = scanner.nextDouble();

        displayCredit(name, gpa);

        scanner.close();
    }

    public static void displayCredit(String name, double gpa) {
        double credit = gpa * 10;
        System.out.println("Student: " + name);
        System.out.println("Grade Point Average: " + gpa);
        System.out.println("Bookstore Credit: $" + credit);
    }
}
