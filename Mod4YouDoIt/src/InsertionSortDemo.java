import java.util.*;

class InsertionSortDemo {
    public static void main(String[] args) {
        int[] someNums = new int[5];
        Scanner keyboard = new Scanner(System.in);
        int a, b, temp;

        // Prompt the user for values and fill the array
        for (a = 0; a < someNums.length; ++a) {
            System.out.print("Enter number " + (a + 1) + " >> ");
            someNums[a] = keyboard.nextInt();
        }

        // Display the initial array
        display(someNums, 0);

        // Insertion sort algorithm
        a = 1;
        while (a < someNums.length) {
            temp = someNums[a];
            b = a - 1;
            while (b >= 0 && someNums[b] > temp) {
                someNums[b + 1] = someNums[b];
                --b;
            }
            someNums[b + 1] = temp;
            display(someNums, a);
            ++a;
        }
    }

    // Display the array with an iteration number
    public static void display(int[] someNums, int a) {
        System.out.print("Iteration " + a + ": ");
        for (int x = 0; x < someNums.length; ++x) {
            System.out.print(someNums[x] + " ");
        }
        System.out.println();
    }
}
