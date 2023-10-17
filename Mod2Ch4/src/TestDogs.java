public class TestDogs {
    public static void main(String[] args) {
        // Create and display the first DogTriathlonParticipant object
        DogTriathlonParticipant dog1 = new DogTriathlonParticipant("Bowser", 2, 85, 89, 0);
        dog1.display();

        // Create and display the second DogTriathlonParticipant object
        DogTriathlonParticipant dog2 = new DogTriathlonParticipant("Rush", 3, 78, 72, 80);
        dog2.display();

        // Create and display the third DogTriathlonParticipant object
        DogTriathlonParticipant dog3 = new DogTriathlonParticipant("Ginger", 3, 90, 86, 72);
        dog3.display();
    }
}
