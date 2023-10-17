import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class ReservationSystem {
    private List<Accommodation> accommodations = new ArrayList<>();
    private final String accommodationsFileName = "accommodations.txt";
    private SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

    public static void main(String[] args) {
        ReservationSystem system = new ReservationSystem();
        system.loadAccommodationsFromFile();
        system.start();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nHotel Reservation System");
            System.out.println("1. Make a Reservation");
            System.out.println("2. View Reservations");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    makeReservation(scanner);
                    break;
                case 2:
                    viewReservations();
                    break;
                case 3:
                    saveAccommodationsToFile();
                    System.out.println("Exiting program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public void makeReservation(Scanner scanner) {
        System.out.print("Enter guest name: ");
        String guestName = scanner.next();

        System.out.print("Enter room number: ");
        int roomNumber = scanner.nextInt();

        System.out.print("Enter arrival date (MM/dd/yyyy): ");
        String arrivalDateStr = scanner.next();

        System.out.print("Enter departure date (MM/dd/yyyy): ");
        String departureDateStr = scanner.next();

        try {
            Date arrivalDate = dateFormat.parse(arrivalDateStr);
            Date departureDate = dateFormat.parse(departureDateStr);
            Accommodation accommodation = new Accommodation(guestName, roomNumber, arrivalDate, departureDate);
            accommodations.add(accommodation);
            System.out.println("Reservation created.");
        } catch (java.text.ParseException ex) {
            System.out.println("Invalid date format. Please use MM/dd/yyyy.");
        }
    }

    public void viewReservations() {
        System.out.println("\nReservations:");
        for (Accommodation accommodation : accommodations) {
            System.out.println(accommodation);
        }
    }

    public void loadAccommodationsFromFile() {
        try (Scanner scanner = new Scanner(new File(accommodationsFileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String guestName = parts[0].trim();
                    int roomNumber = Integer.parseInt(parts[1].trim());
                    Date arrivalDate = dateFormat.parse(parts[2].trim());
                    Date departureDate = dateFormat.parse(parts[3].trim());

                    Accommodation accommodation = new Accommodation(guestName, roomNumber, arrivalDate, departureDate);
                    accommodations.add(accommodation);
                }
            }
        } catch (FileNotFoundException | java.text.ParseException e) {
            // Handle file not found error (first run or the file was deleted)
        }
    }

    public void saveAccommodationsToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(accommodationsFileName))) {
            for (Accommodation accommodation : accommodations) { 
                writer.println(accommodationToCsvString(accommodation));
            }
        } catch (IOException e) {
            System.err.println("Error saving accommodations to file.");
        }
    }

    private String accommodationToCsvString(Accommodation accommodation) {
        return accommodation.getGuestName() + ", " + accommodation.getRoomNumber() + ", " +
               dateFormat.format(accommodation.getArrivalDate()) + ", " +
               dateFormat.format(accommodation.getDepartureDate());
    }
}

class Accommodation {
    private String guestName;
    private int roomNumber;
    private Date arrivalDate;
    private Date departureDate;

    public Accommodation(String guestName, int roomNumber, Date arrivalDate, Date departureDate) {
        this.guestName = guestName;
        this.roomNumber = roomNumber;
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
    }

    public String getGuestName() {
        return guestName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        return "Guest: " + guestName + ", Room: " + roomNumber +
               ", Arrival Date: " + dateFormat.format(arrivalDate) +
               ", Departure Date: " + dateFormat.format(departureDate);
    }
}
