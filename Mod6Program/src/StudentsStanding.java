import java.io.*;
import java.util.Scanner;

public class StudentsStanding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Create file writers for good standing and probation students
            FileWriter goodStandingFile = new FileWriter("good_standing.txt");
            FileWriter probationFile = new FileWriter("academic_probation.txt");

            while (true) {
                System.out.print("Enter student ID (or type 'exit' to quit): ");
                String id = scanner.nextLine();

                if (id.equalsIgnoreCase("exit")) {
                    break;
                }

                System.out.print("Enter first name: ");
                String firstName = scanner.nextLine();

                System.out.print("Enter last name: ");
                String lastName = scanner.nextLine();

                System.out.print("Enter GPA: ");
                double gpa = scanner.nextDouble();
                scanner.nextLine(); // Consume the newline character

                // Write student data to the appropriate file
                String studentInfo = id + ", " + firstName + ", " + lastName + ", " + gpa + "\n";
                if (gpa >= 2.0) {
                    goodStandingFile.write(studentInfo);
                } else {
                    probationFile.write(studentInfo);
                }
            }

            // Close the file writers
            goodStandingFile.close();
            probationFile.close();

            System.out.println("Student data has been categorized and saved.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            // Close the Scanner
            scanner.close();
        }
    }
}
