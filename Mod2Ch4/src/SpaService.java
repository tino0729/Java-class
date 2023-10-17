public class SpaService {
    // Private data fields
    private String serviceDescription;
    private double price;

    // Two-parameter constructor
    public SpaService(String desc, double pr) {
        serviceDescription = desc;
        price = pr;
    }

    // Default constructor calling the two-parameter constructor with default values
    public SpaService() {
        this("XXX", 0);
    }

    // Constructor (if needed)
    // You can add a constructor to initialize the fields if necessary

    // Methods for setting and retrieving data
    public void setServiceDescription(String service) {
        serviceDescription = service;
    }

    public void setPrice(double servicePrice) {
        price = servicePrice;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public double getPrice() {
        return price;
    }
}
