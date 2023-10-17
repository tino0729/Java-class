public class ShortCircuitTestOr {

    public static void main(String[] args) {
        // First test, falseMethod() to the left of the || operator
        if (falseMethod() || trueMethod())
            System.out.println("At least one is true");
        else
            System.out.println("Both are false");

        // Second test, trueMethod() to the left of the || operator
        if (trueMethod() || falseMethod())
            System.out.println("At least one is true");
        else
            System.out.println("Both are false");
    }

    public static boolean trueMethod() {
        System.out.println("Within trueMethod()");
        return true;
    }

    public static boolean falseMethod() {
        System.out.println("Within falseMethod()");
        return false;
    }
}
