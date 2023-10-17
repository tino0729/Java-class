import java.util.Scanner;

public class ArithmeticDemo3 {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        int sum;
        int difference;
        double average; // Change the data type to double for average

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter an integer >> ");
        firstNumber = input.nextInt();

        System.out.print("Please enter another integer >> ");
        secondNumber = input.nextInt();

        sum = firstNumber + secondNumber;
        difference = firstNumber - secondNumber;
        average = (double) sum / 2; // Cast the entire expression

        System.out.println(firstNumber + " + " + secondNumber + " is " + sum);
        System.out.println(firstNumber + " - " + secondNumber + " is " + difference);
        System.out.println("The average of " + firstNumber + " and " + secondNumber + " is " + average);

        input.close(); // Close the Scanner when done
    }
}
20