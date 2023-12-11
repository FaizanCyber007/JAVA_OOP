public class Electronics extends Product{
    double powerConsumption;
    String warranty;

    public Electronics() {

    }

    public Electronics(String name, double price, int quantity, double taxationSpecifics, ProductType type, double powerConsumption, String warranty) {
        super(name, price, quantity, taxationSpecifics, type);
        this.powerConsumption = powerConsumption;
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return String.format("Product ID: %d \t Name: %s \n Price: %f \t Quantity: %d \n Taxation Specifics: %f \tPower Consumption: %-4.2f \n Warranty: %s", productID, name, price, quantity, taxationSpecifics,powerConsumption, warranty);
    }
}
