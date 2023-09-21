import java.util.Scanner;

public class BankBalance {
    public static void main(String[] args) {
        double balance;
        int response;
        int year = 1;
        final double INT_RATE = 0.03;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter initial bank balance > ");
        balance = keyboard.nextDouble();
        keyboard.nextLine(); // Consume the newline character
        
        do {
            balance = balance + balance * INT_RATE;
            System.out.println("After year " + year + " at " + INT_RATE + " interest rate, balance is $" + balance);
            year = year + 1;
            
            System.out.println("\nDo you want to see the balance at the end of another year?");
            System.out.println("Enter 1 for yes, or any other number for no >> ");
            response = keyboard.nextInt();
        } while (response == 1);
        
        keyboard.close(); // Close the Scanner
    }
}
