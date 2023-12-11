public class Product {
    int productID;
    static int count=1;
    String name;
    double price;
    int quantity;
    double taxationSpecifics;

    ProductType type;

    public Product() {

    }

    public Product(String name, double price, int quantity, double taxationSpecifics, ProductType type) {
        this.productID = count++;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.taxationSpecifics = taxationSpecifics;
        this.type = type;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTaxationSpecifics() {
        return taxationSpecifics;
    }

    public void setTaxationSpecifics(double taxationSpecifics) {
        this.taxationSpecifics = taxationSpecifics;
    }

    public double updatePrice(double price) {
        this.price = price;
        return this.price;
    }

    @Override
    public String toString() {
        return String.format("Product ID: %d \t Name: %s \n Price: %f \t Quantity: %d \n Taxation Specifics: %f", productID, name, price, quantity, taxationSpecifics);
    }
}
