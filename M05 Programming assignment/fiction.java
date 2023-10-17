public class fiction extends Book {
    public fiction(String title) {
        super(title);
        setPrice(24.99);
    }

    @Override
    public void setPrice(double price) {
        super.price = price;
    }
}
