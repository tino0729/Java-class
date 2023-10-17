public class StringBuilderMethods {
    public static void main(String[] args) {
        // Create a StringBuilder object and display it
        StringBuilder str = new StringBuilder("singing");
        System.out.println(str);

        // Use append() method to add characters and display
        str.append(" in the dead of ");
        System.out.println(str);

        // Use insert() method to insert characters and display
        str.insert(0, "Black");
        System.out.println(str);
        str.insert(5, "bird ");
        System.out.println(str);

        // Add one more append and display sequence
        str.append("night");
        System.out.println(str);
    }
}
