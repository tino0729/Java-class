public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car(2023, Model.SEDAN, Color.BLUE);
        Car car2 = new Car(2022, Model.CONVERTIBLE, Color.RED);

        car1.display();
        car2.display();
    }
}
8-44