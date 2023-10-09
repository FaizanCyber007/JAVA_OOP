import java.util.TimerTask;

public enum OrderStatus {
Pending(1), Preparing(2), Ready(3), Delivered(4);
final int value;

    OrderStatus(int value) {
        this.value = value;
    }


public void updateStatus() throws InterruptedException {
    System.out.println("Your order is on " + OrderStatus.Pending + "!");

    Thread.sleep(8000);
    System.out.println("We are " + OrderStatus.Preparing + " your food!");

    Thread.sleep(8000);
    System.out.println("Your order is " + OrderStatus.Ready + "! 🎉🎉");

    Thread.sleep(8000);
    System.out.println("Your order has been " + OrderStatus.Delivered + ". Enjoy your meal! 😋😋");


}
}
