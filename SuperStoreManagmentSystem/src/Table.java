public class Table extends Furniture{
    String shape;

    public Table() {
    }

    public Table(String name, double price, int quantity, double taxationSpecifics, ProductType type, String dimension, String material, String shape) {
        super(name, price, quantity, taxationSpecifics, type, dimension, material);
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }
    @Override
    public String toString() {
        return String.format("Product ID: %d \t Name: %s \n Price: %f \t Quantity: %d \n Taxation Specifics: %f \tDimension: %s \n Material: %s \t Shape: %s", productID, name, price, quantity, taxationSpecifics,dimension, material,shape);
    }
}
