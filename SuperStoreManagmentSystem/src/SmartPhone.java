public class SmartPhone extends Electronics {
    String operatingSystem;
    double storageCapacity;
    double cameraResolution;

    public SmartPhone() {

    }

    public SmartPhone(String name, double price, int quantity, double taxationSpecifics, ProductType type, double powerConsumption, String warranty, String operatingSystem, double storageCapacity, double cameraResolution) {
        super(name, price, quantity, taxationSpecifics, type, powerConsumption, warranty);
        this.operatingSystem = operatingSystem;
        this.storageCapacity = storageCapacity;
        this.cameraResolution = cameraResolution;
    }

    @Override
    public String toString() {
        return String.format("Product ID: %d \t Name: %s \n Price: %f \t Quantity: %d \n Taxation Specifics: %f \tPower Consumption: %-4.2f \n Warranty: %s \t Storage Capacity: %f GB \nCamera Resolution: %f px \t Operating System: %s", productID, name, price, quantity, taxationSpecifics,powerConsumption, warranty, storageCapacity,cameraResolution,operatingSystem);
    }

}
