import java.io.*;

public class StudentsStanding2 {
    public static void main(String[] args) {
        try {
            // Open the files for reading
            BufferedReader goodStandingReader = new BufferedReader(new FileReader("good_standing.txt"));
            BufferedReader probationReader = new BufferedReader(new FileReader("academic_probation.txt"));

            // Display the header for students in good standing
            System.out.println("Students in Good Standing:");
            System.out.println("----------------------------------------");
            System.out.printf("%-10s %-15s %-15s %-10s %-10s%n", "ID", "First Name", "Last Name", "GPA", "Difference");

            
            String line;
            while ((line = goodStandingReader.readLine()) != null) {
                String[] data = line.split(", ");
                String id = data[0];
                String firstName = data[1];
                String lastName = data[2];
                double gpa = Double.parseDouble(data[3]);
                double difference = gpa - 2.0;

                System.out.printf("%-10s %-15s %-15s %-10.2f %-10.2f%n", id, firstName, lastName, gpa, difference);
            }

            System.out.println("----------------------------------------");

            // Display the header for students on academic probation
            System.out.println("\nStudents on Academic Probation:");
            System.out.println("----------------------------------------");
            System.out.printf("%-10s %-15s %-15s %-10s %-10s%n", "ID", "First Name", "Last Name", "GPA", "Difference");

            // Read and display students on academic probation
            while ((line = probationReader.readLine()) != null) {
                String[] data = line.split(", ");
                String id = data[0];
                String firstName = data[1];
                String lastName = data[2];
                double gpa = Double.parseDouble(data[3]);
                double difference = 2.0 - gpa;

                System.out.printf("%-10s %-15s %-15s %-10.2f %-10.2f%n", id, firstName, lastName, gpa, difference);
            }

            System.out.println("----------------------------------------");

            // Close the file readers
            goodStandingReader.close();
            probationReader.close();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
