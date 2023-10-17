public class DogTriathlonParticipant {
    private final int NUM_EVENTS;
    private static int totalCumulativeScore = 0;

    private String name;
    private int obedienceScore;
    private int conformationScore;
    private int agilityScore;
    private int total;
    private double avg;

    public DogTriathlonParticipant(String name, int numEvents, int score1, int score2, int score3) {
        this.name = name;
        NUM_EVENTS = numEvents;
        obedienceScore = score1;
        conformationScore = score2;
        agilityScore = score3;

        // Calculate the total score for the participant
        total = obedienceScore + conformationScore + agilityScore;

        // Calculate the average score with a cast to double
        avg = (double) total / NUM_EVENTS;

        // Add the participant's total score to the cumulative score for all participants
        totalCumulativeScore += total;
    }

    public void display() {
        System.out.println(name + " participated in " + NUM_EVENTS +
            " events and has an average score of " + avg);
        System.out.println(name + " has a total score of " + total +
            " bringing the total cumulative score to " + totalCumulativeScore);
    }

    public static void main(String[] args) {
        // Example usage of the DogTriathlonParticipant class
        DogTriathlonParticipant participant1 = new DogTriathlonParticipant("Buddy", 3, 90, 85, 92);
        DogTriathlonParticipant participant2 = new DogTriathlonParticipant("Rex", 3, 88, 92, 87);

        // Display participant information
        participant1.display();
        participant2.display();
    }
}
