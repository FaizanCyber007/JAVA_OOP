public class Furniture extends Product{
    String dimension;
    String material;

    public Furniture() {

    }

    public Furniture(String name, double price, int quantity, double taxationSpecifics, ProductType type, String dimension, String material) {
        super(name, price, quantity, taxationSpecifics, type);
        this.dimension = dimension;
        this.material = material;
    }

    @Override
    public String toString() {
        return String.format("Product ID: %d \t Name: %s \n Price: %f \t Quantity: %d \n Taxation Specifics: %f \tDimension: %s \n Material: %s", productID, name, price, quantity, taxationSpecifics,dimension, material);
    }
}
