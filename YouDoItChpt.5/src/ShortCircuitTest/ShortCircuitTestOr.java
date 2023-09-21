package ShortCircuitTest;
public class ShortCircuitTestOr {
    public static void main(String[] args) {
        // Using falseMethod() to the left of || operator
        if (falseMethod() || trueMethod())
            System.out.println("At least one is true");
        else
            System.out.println("Both are not true");

        // Using trueMethod() to the left of || operator
        if (trueMethod() || falseMethod())
            System.out.println("At least one is true");
        else
            System.out.println("Both are not true");
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
