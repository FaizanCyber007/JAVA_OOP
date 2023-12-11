public class Sitting extends Furniture{
    double loadCapacity;

    public Sitting() {
    }

    public Sitting(String name, double price, int quantity, double taxationSpecifics, ProductType type, String dimension, String material, double loadCapacity) {
        super(name, price, quantity, taxationSpecifics, type, dimension, material);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return String.format("Product ID: %d \t Name: %s \n Price: %f \t Quantity: %d \n Taxation Specifics: %f \tDimension: %s \n Material: %s \t Load Capacity: %f", productID, name, price, quantity, taxationSpecifics,dimension, material,loadCapacity);
    }
}
