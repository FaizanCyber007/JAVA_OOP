public class Restaurant {
    static int count=1;
    int orderID;
    Date date;
    OrderStatus checkStatus;
    String name;
    String phoneNumber;
    String email;
    String address;
    Order o1;
    Customer c1;

    Restaurant(Date date, OrderStatus checkStatus, String customerName, String phoneNumber, String email, String address) {
        this.orderID = count++;
        this.date = date;
        this.checkStatus = checkStatus;
        this.name = customerName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        o1 = new Order(this.orderID, this.date, this.checkStatus);
        c1 = new Customer(this.name, this.phoneNumber, this.email, this.address);
    }



    @Override
    public String toString() {
        return String.format("%s\n%s",o1,c1);
    }
}