public class Grocery extends Product{
    Date expirationDate;
    String nutritionValue;

    public Grocery() {

    }

    public Grocery(String name, double price, int quantity, double taxationSpecifics, ProductType type, Date expirationDate, String nutritionValue) {
        super(name, price, quantity, taxationSpecifics, type);
        this.expirationDate = expirationDate;
        this.nutritionValue = nutritionValue;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public String getNutritionValue() {
        return nutritionValue;
    }

    @Override
    public String toString() {
        return String.format("Product ID: %d \t Name: %s \n Price: %f \t Quantity: %d \n Taxation Specifics: %f \tExpiration Date: %-40s \n Nutrition Value: %s", productID, name, price, quantity, taxationSpecifics,expirationDate, nutritionValue);
    }
}

