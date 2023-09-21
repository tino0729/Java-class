public class DemoIncrement2 {
    public static void main(String[] args) {
        int v = 4;
        int plusPlusV = ++v;
        v = 4;
        int vPlusPlus = v++;

        int x = 6;  // Rename one of the x variables, e.g., int x2 = 6;
        int y = 10;
        boolean isEqual = (x == y);
        boolean isNotEqual = (x != y);
        boolean isGreaterThan = (x > y);
        boolean isLessThan = (x < y);

        System.out.println("v is " + v);
        System.out.println("++v is " + plusPlusV);
        System.out.println("v++ is " + vPlusPlus);
        System.out.println("x is " + x);
        System.out.println("y is " + y);
        System.out.println("x == y is " + isEqual);
        System.out.println("x != y is " + isNotEqual);
        System.out.println("x > y is " + isGreaterThan);
        System.out.println("x < y is " + isLessThan);

        int w = 17;
        x = 17;  // Assign a new value to the existing x variable.
        y = 18;
        boolean compare1 = (++w == y);
        boolean compare2 = (x++ == y);

        System.out.println("First compare is " + compare1);
        System.out.println("Second compare is " + compare2);
    }
}
