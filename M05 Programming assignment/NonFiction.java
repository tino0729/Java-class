public class NonFiction extends Book {
    public NonFiction(String title) {
        super(title);
        setPrice(37.99);
    }

    @Override
    public void setPrice(double price) {
        super.price = price;
    }
}
