import javax.swing.JOptionPane;
import java.time.*;

public class TimedResponse {
    public static void main(String[] args) {
        LocalDateTime time1, time2;
        int seconds1, seconds2, difference;

        // Assign the current time to time1 and extract the current seconds component
        time1 = LocalDateTime.now();
        seconds1 = time1.getSecond();

        // Display a dialog box that asks the user to make a difficult choice
        JOptionPane.showConfirmDialog(null, "Is stealing ever justified?");

        // Get the system time immediately after the user responds and extract its seconds component
        time2 = LocalDateTime.now();
        seconds2 = time2.getSecond();

        // Compute the difference between the times and display the result in a dialog box
        difference = seconds2 - seconds1;
        JOptionPane.showMessageDialog(null,
            "End seconds: " + seconds2 + "\nStart seconds: " + seconds1 + "\nIt took " + difference + " seconds for you to answer");
    }
}
