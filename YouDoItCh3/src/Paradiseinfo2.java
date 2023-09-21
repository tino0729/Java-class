///Clemente De Rosa
/// Sdev200 Module 2
/// August 28 2023

import java.util.Scanner;

public class TestInfo {
    public static void main(String[] args) {
        double price;
        double discount;
        double savings;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter cutoff price for discount >> ");
        price = keyboard.nextDouble();
        
        System.out.print("Enter discount rate as a whole number >> ");
        discount = keyboard.nextDouble();
        
        keyboard.close();
        
        DiscountCalculator calculator = new DiscountCalculator(); // Create an instance of the DiscountCalculator class
        savings = calculator.computeDiscountInfo(price, discount); // Call the method using the instance
        
        displayInfo(price, discount, savings);
        
        System.out.println("Special this week on any service over $" + price);
        System.out.println("Discount of " + discount + " percent");
        System.out.println("That's a savings of at least $" + savings);
    }

    public static void displayInfo(double price, double discount, double savings) {
        System.out.println("Calling method from another class:");
        System.out.println("Special this week on any service over $" + price);
        System.out.println("Discount of " + discount + " percent");
        System.out.println("That's a savings of at least $" + savings);
    }
}
