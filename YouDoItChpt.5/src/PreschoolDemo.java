public class PreschoolDemo {
    public static void main(String[] args) {
        Preschoolstudent ps1 = new Preschoolstudent(2345, 5);
        Preschoolstudent ps2 = new Preschoolstudent(67890, 8);
        
        display(ps1);
        display(ps2);
        
        ps1.setAge(6);
        display(ps1);
        
        ps1.setAge(7);
        display(ps1);
    }

    public static void display(Preschoolstudent ps) {
        System.out.print("Student ID: " + ps.getidNum());
        System.out.println(" Student Age: " + ps.getAge());
        System.out.println();
    }
}
