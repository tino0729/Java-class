import java.time.LocalDate;

public class FitnessTracker {
    private String activityName;
    private int minutesSpent;
    private LocalDate date;

    // Default constructor
    public FitnessTracker() {
        activityName = "running";
        minutesSpent = 0;
        date = LocalDate.of(LocalDate.now().getYear(), 1, 1);
    }

    // Overloaded constructor
    public FitnessTracker(String activityName, int minutesSpent, LocalDate date) {
        this.activityName = activityName;
        this.minutesSpent = minutesSpent;
        this.date = date;
    }

    // Getter methods
    public String getActivityName() {
        return activityName;
    }

    public int getMinutesSpent() {
        return minutesSpent;
    }

    public LocalDate getDate() {
        return date;
    }
}
