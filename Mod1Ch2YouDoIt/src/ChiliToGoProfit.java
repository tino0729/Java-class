//Clemente De Rosa
//Mod 1 Chapter 2 YouDoIt
//August 28 2023

import java.util.Scanner;

public class ChiliToGoProfit {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of adult meals ordered: ");
        int numAdultMeals = scanner.nextInt();

        System.out.print("Enter the number of child meals ordered: ");
        int numChildMeals = scanner.nextInt();

        scanner.close();

        double priceAdult = 7.00;
        double priceChild = 4.00;
        double costAdult = 4.35;
        double costChild = 3.10;
        double totAdult = priceAdult * numAdultMeals;
        double totChild = priceChild * numChildMeals;
        double totGrand = totAdult + totChild;
        double totGross = totGrand - (costAdult * numAdultMeals + costChild * numChildMeals);

        System.out.println("Total Money Collected for Adult Meals: $" + totAdult);
        System.out.println("Total Money Collected for Child Meals: $" + totChild);
        System.out.println("Grand Total Money Collected: $" + totGrand);
        System.out.println("Total Gross Profit: $" + totGross);
    }
}




