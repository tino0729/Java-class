import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class ReservationDemo extends JFrame {
    private List<Reservation> reservations = new ArrayList<>();
    private DefaultTableModel tableModel;
    private final String reservationsFileName = "reservations.txt";
    private JTable table;

    public ReservationDemo() {
        setTitle("Hotel Reservation System");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Table
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Name");
        tableModel.addColumn("Arrival Date");
        tableModel.addColumn("Room Type");
        tableModel.addColumn("Email");
        tableModel.addColumn("Phone Number");
        tableModel.addColumn("Departure Date");
        table = new JTable(tableModel);
        JScrollPane tableScrollPane = new JScrollPane(table);
        add(tableScrollPane, BorderLayout.CENTER);

        // Make Reservation Panel
        JPanel makeReservationPanel = new JPanel();
        JButton makeReservationButton = new JButton("Make Reservation");
        makeReservationPanel.add(makeReservationButton);

        makeReservationButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                makeReservation();
            }
        });

        add(makeReservationPanel, BorderLayout.SOUTH);

        loadReservationsFromFile();
    }

    private void makeReservation() {
        String guestName = JOptionPane.showInputDialog("Enter guest name:");
        String roomType = showRoomTypeDialog();
        String arrivalDateStr = JOptionPane.showInputDialog("Enter arrival date (MM/dd/yyyy):");
        String departureDateStr = JOptionPane.showInputDialog("Enter departure date (MM/dd/yyyy):");
        String email = JOptionPane.showInputDialog("Enter email:");
        String phoneNumber = JOptionPane.showInputDialog("Enter phone number:");

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
            Date arrivalDate = dateFormat.parse(arrivalDateStr);
            Date departureDate = dateFormat.parse(departureDateStr);
            Reservation reservation = new Reservation(guestName, roomType, arrivalDate, departureDate, email, phoneNumber);
            reservations.add(reservation);
            updateReservationTable();
            saveReservationsToFile();
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Invalid date format. Please use MM/dd/yyyy.");
        }
    }

    private String showRoomTypeDialog() {
        String[] roomTypes = { "Beach View", "Executive Suite", "Penthouse" };
        return (String) JOptionPane.showInputDialog(null, "Select room type:", "Room Type",
                JOptionPane.QUESTION_MESSAGE, null, roomTypes, roomTypes[0]);
    }

    private void updateReservationTable() {
        tableModel.setRowCount(0);
        for (Reservation reservation : reservations) {
            tableModel.addRow(new Object[]{
                reservation.getGuestName(),
                new SimpleDateFormat("MM/dd/yyyy").format(reservation.getArrivalDate()),
                reservation.getRoomType(),
                reservation.getEmail(),
                reservation.getPhoneNumber(),
                new SimpleDateFormat("MM/dd/yyyy").format(reservation.getDepartureDate())
            });
        }
    }

    private void loadReservationsFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(reservationsFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 6) {
                    String guestName = parts[0].trim();
                    String roomType = parts[1].trim();
                    SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
                    Date arrivalDate = dateFormat.parse(parts[2].trim());
                    Date departureDate = dateFormat.parse(parts[3].trim());
                    String email = parts[4].trim();
                    String phoneNumber = parts[5].trim();

                    Reservation reservation = new Reservation(guestName, roomType, arrivalDate, departureDate, email, phoneNumber);
                    reservations.add(reservation);
                }
            }
            updateReservationTable();
        } catch (IOException | ParseException e) {
            // Handle file not found error (first run or the file was deleted)
        }
    }

    private void saveReservationsToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(reservationsFileName))) {
            for (Reservation reservation : reservations) {
                SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
                writer.println(reservation.getGuestName() + ", " + reservation.getRoomType() + ", " +
                        dateFormat.format(reservation.getArrivalDate()) + ", " +
                        dateFormat.format(reservation.getDepartureDate()) + ", " +
                        reservation.getEmail() + ", " + reservation.getPhoneNumber());
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error saving reservations to file.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ReservationDemo gui = new ReservationDemo();
                gui.setVisible(true);
            }
        });
    }
}

class Reservation {
    private String guestName;
    private String roomType;
    private Date arrivalDate;
    private Date departureDate;
    private String email;
    private String phoneNumber;

    public Reservation(String guestName, String roomType, Date arrivalDate, Date departureDate, String email, String phoneNumber) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getGuestName() {
        return guestName;
    }

    public String getRoomType() {
        return roomType;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
