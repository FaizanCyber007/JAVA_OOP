import java.util.Scanner;

public class Customer {
    private String name;
    private String phoneNumber;
    private String email;
    private String address;
    int inputNumber;
    static int counter=1;
    Order letsOrder = new Order(counter++, new Date("October", "2023", 9), OrderStatus.Preparing);
    public Customer() {

    }

    public Customer(String name, String phoneNumber, String email, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void placeorder() {
         do {
             System.out.println("Enter the ID of your desired item or -1 to exit: ");
             Scanner sc = new Scanner(System.in);
             inputNumber = sc.nextInt();
            letsOrder.addItem(inputNumber);
        } while(inputNumber != -1);
         letsOrder.displayCart();
        System.out.printf("Total Cost for your order is: Rs. %.2f\n\n", letsOrder.getTotalCost());
    }

    public void removeOrder() {
        for(int i=0; i<letsOrder.yourCart.length; i++) {

        System.out.println("If you want to remove any item, write its ID, otherwise -1 to continue: ");
        Scanner s = new Scanner(System.in);
        inputNumber=s.nextInt();
        if(inputNumber != -1) {
            letsOrder.removeItem(inputNumber);

        } else {
            break;
        }
        }
    }

    @Override
    public String toString() {
        return String.format("Name: %-25s Phone Number: %s\nEmail ID: %-25s Address: %s",name,phoneNumber,email,address);
    }
}
