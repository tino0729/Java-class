public class Sandwich {
    // Data fields
    private String mainIngredient;
    private String breadType;
    private double price;

    // Constructor
    public Sandwich(String mainIngredient, String breadType, double price) {
        this.mainIngredient = mainIngredient;
        this.breadType = breadType;
        this.price = price;
    }

    // Getter method for mainIngredient
    public String getMainIngredient() {
        return mainIngredient;
    }

    // Setter method for mainIngredient
    public void setMainIngredient(String mainIngredient) {
        this.mainIngredient = mainIngredient;
    }

    // Getter method for breadType
    public String getBreadType() {
        return breadType;
    }

    // Setter method for breadType
    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    // Getter method for price
    public double getPrice() {
        return price;
    }

    // Setter method for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Main method (for testing)
    public static void main(String[] args) {
        Sandwich mySandwich = new Sandwich("Tuna", "Wheat", 4.99);

        // Get and display sandwich details
        System.out.println("Main Ingredient: " + mySandwich.getMainIngredient());
        System.out.println("Bread Type: " + mySandwich.getBreadType());
        System.out.println("Price: $" + mySandwich.getPrice());

        // Update the price
        mySandwich.setPrice(5.49);

        // Display the updated price
        System.out.println("Updated Price: $" + mySandwich.getPrice());
    }
}
