public class Party {
    private int guests;

    // Constructor (optional)
    public Party(int initialGuests) {
        guests = initialGuests;
    }

    public int getGuests() {
        return guests;
    }

    public void setGuests(int numGuests) {
        guests = numGuests;
    }

    public void displayInvitation() {
        System.out.println("Please come to my party!");
    }
}
