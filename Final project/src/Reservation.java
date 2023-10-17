import java.text.SimpleDateFormat;
import java.util.Date;

public class Reservation {
    private String guestName;
    private Date arrivalDate;
    private Date departureDate;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

    // Updated constructor to match the changes
    public Reservation(String guestName, Date arrivalDate, Date departureDate) {
        this.guestName = guestName;
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
    }

    public String getGuestName() {
        return guestName;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    @Override
    public String toString() {
        return "Guest: " + guestName + ", Arrival: " + dateFormat.format(arrivalDate) + ", Departure: " + dateFormat.format(departureDate);
    }
}
