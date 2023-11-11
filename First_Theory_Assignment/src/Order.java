
public class Order {
    MenuItems[] yourCart = new MenuItems[10];
    private int orderID;
    private double totalCost;
    Date date;

    OrderStatus checkStatus;

    int i =0;

    public Order() {

    }

    public Order(int orderID, Date date, OrderStatus checkStatus) {
        this.orderID = orderID;
        this.date = date;
        this.checkStatus = checkStatus;
    }

    public OrderStatus getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(OrderStatus checkStatus) {
        this.checkStatus = checkStatus;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }


    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void displayMenu() {
        System.out.println("---MENU CARD---");
        for(MenuItems menuItems : MenuItems.values()) {
            System.out.println(menuItems);
        }
    }
    public void addItem(int itemID) {
            if(itemID >=0 && itemID<=MenuItems.values().length) {
                MenuItems selectedItem = MenuItems.values()[itemID - 1];


                yourCart[i++] = selectedItem;
                totalCost += selectedItem.getItemPrice();
            } else {
                if(itemID != -1)
                    System.out.println("Invalid ID entered!!");
            }
    }

    public void removeItem(int itemID) {
        for(int j=0; j< yourCart.length; j++) {
            if(itemID == yourCart[j].itemID) {
                totalCost -= yourCart[j].itemPrice;
                yourCart[j] = null;
                for(int k = j; k < yourCart.length -1; k++) {
                    yourCart[k] = yourCart[k+1];
                }

                break;
            }
        }


    }

    public void displayCart() {
        System.out.println("--------------------------------------------");
        System.out.println("------------ Your Cart Contains ------------");
        for (MenuItems cartItems : yourCart) {
            if (cartItems != null) {
                System.out.println(cartItems);
            }
        }
        System.out.println();

    }

    @Override
    public String toString() {
        return String.format("Dated: %-25s  Order ID: %d",date, orderID);
    }


}
