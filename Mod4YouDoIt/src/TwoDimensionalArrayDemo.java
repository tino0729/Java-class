import java.util.Scanner;

class TwoDimensionalArrayDemo {
    public static void main(String[] args) {
        int[][] count = new int[3][3];
        Scanner input = new Scanner(System.in);
        int row, column;
        final int QUIT = 99;

        // Prompt the user to enter a row or QUIT to quit
        System.out.print("Enter a row or " + QUIT + " to quit > ");
        row = input.nextInt();

        // Main loop
        while (row != QUIT) {
            System.out.print("Enter a column > ");
            column = input.nextInt();

            // Check if the row and column are within appropriate ranges
            if (row < count.length && column < count[row].length) {
                count[row][column]++;

                // Display the updated array
                for (int r = 0; r < count.length; ++r) {
                    for (int c = 0; c < count[r].length; ++c) {
                        System.out.print(count[r][c] + " ");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Invalid position selected");
            }

            // Prompt the user for the next row number
            System.out.print("Enter a row or " + QUIT + " to quit > ");
            row = input.nextInt();
        }
    }
}
