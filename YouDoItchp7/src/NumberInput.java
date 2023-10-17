import javax.swing.*;

public class NumberInput {
    public static void main(String[] args) {
        // Declare variables
        String inputString;
        int inputNumber;
        int result;

        // Declare a constant
        final int FACTOR = 10;

        // Input dialog to get user's input
        inputString = JOptionPane.showInputDialog(null, "Enter a number");

        // Convert input String to an integer
        inputNumber = Integer.parseInt(inputString);

        // Perform arithmetic and display the result
        result = inputNumber * FACTOR;
        JOptionPane.showMessageDialog(null, inputNumber + " * " + FACTOR + " = " + result);
    }
}
