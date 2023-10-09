public class TesterClass {
    public static void main(String[] args) {
        Restaurant r1 = new Restaurant(new Date("October","2023",4), OrderStatus.Preparing, "Faizan Javed", "03320436737", "faizanjaved246@gmail.com", "Zaib Colony, Gujrat");


        r1.c1.letsOrder.displayMenu();
        r1.c1.placeorder();
        r1.c1.removeOrder();
        System.out.println();
        System.out.println();
        System.out.println("-------------- Order details are shown below!! -------------");
        System.out.println(r1);
        r1.c1.letsOrder.displayCart();
        System.out.println("Your Total bill is: Rs. " + r1.c1.letsOrder.getTotalCost());
        try {
            r1.o1.checkStatus.updateStatus();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
