public class DivideEvenly {
    public static void main(String[] args) {
        final int LIMIT = 100; // Named constant for the value 100
        int var;

        // Statement explaining the purpose of the program
        System.out.print(LIMIT + " is evenly divisible by ");

        // Loop to check which numbers divide 100 evenly
        for (var = 1; var <= LIMIT; ++var) {
            if (LIMIT % var == 0) {
                System.out.print(var + " ");
            }
        }

        // Advance to the next line
        System.out.println();
    }
}
