public class IntegerDemo {
    public static void main(String[] args) {
        int anInt = 1234;
        byte aByte = 12; // Attempt to set a large value to a byte (will generate an error)
        short aShort = 12345;
        long aLong = 1234L; // Add 'L' to indicate a long literal

        int anotherInt = anInt * 10000000;

        System.out.println("The int is " + anInt);
        System.out.println("The byte is " + aByte);
        System.out.println("The short is " + aShort);
        System.out.println("The long is " + aLong);
        System.out.println("Another int is " + anotherInt);
    }
}
