public class Laptop extends Electronics{
    String processorType;
    double ramSize;
    String screenDimension;

    public Laptop() {

    }

    public Laptop(String name, double price, int quantity, double taxationSpecifics, ProductType type, double powerConsumption, String warranty, String processorType, double ramSize, String screenDimension) {
        super(name, price, quantity, taxationSpecifics, type, powerConsumption, warranty);
        this.processorType = processorType;
        this.ramSize = ramSize;
        this.screenDimension = screenDimension;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    public double getRamSize() {
        return ramSize;
    }

    public void setRamSize(double ramSize) {
        this.ramSize = ramSize;
    }

    public String getScreenDimension() {
        return screenDimension;
    }

    public void setScreenDimension(String screenDimension) {
        this.screenDimension = screenDimension;
    }

    @Override
    public String toString() {
        return String.format("Product ID: %d \t Name: %s \n Price: %f \t Quantity: %d \n Taxation Specifics: %f \tPower Consumption: %-4.2f \n Warranty: %s \t Ram Size: %f \nScreen Dimension: %s \t Processor Type: %s", productID, name, price, quantity, taxationSpecifics,powerConsumption, warranty, ramSize,screenDimension,processorType);
    }
}

