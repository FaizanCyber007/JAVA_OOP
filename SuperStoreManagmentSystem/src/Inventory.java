import java.util.Scanner;

public class Inventory extends Product {
    Product[] list = new Product[100];

//    Inventory() {
//        for(int i=0; i<list.length; i++) {
//            if(list[i] == null) {
//                list[i] = new Product("VIVO Y33T", 40000, 5, 234.4, ProductType.Electronics);
//            }
//        }
//    }

    public void displayInventory() {
        for(Product p:list) {
            if(p != null) {
                System.out.println(p);
                System.out.println();
                System.out.println();
            }
        }

    }
    public Product selectProduct(int a) {
        for(int i=0; i<list.length; i++) {
            if(list[i].productID == a) {
                return list[i];
            }

    }
        return null;

    }
    public void addProduct(Product p) {
        for(int i=0; i<list.length; i++) {
            if(list[i] == null) {
                list[i] = p;
                break;
            }
        }
    }
    public void removeProduct(int id) {
        for(int i=0; i< list.length; i++) {
            if(list[i].productID == id && list[i] != null) {
                list[i] = null;
                for(int j = i; j< list.length-1; j++) {
                        list[j] = list[j+1];
//                        list[j].productID -= 1;
                }
                    break;
            }
        }
    }

    public void updateProduct(int a) {
        Product p = selectProduct(a);
        System.out.println(p);
        System.out.println();
        System.out.println("Select a number based on your need!!");
        System.out.println("1: Name \t 2: Price: \t 3: Quantity: \t 4: Taxation Specifics");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        System.out.println("Enter new Value:");
        if(userInput == 1) {
            sc.nextLine();
            p.setName(sc.nextLine());
        } else if(userInput == 2) {
            p.setPrice(sc.nextDouble());
        } else if(userInput == 3) {
            p.setQuantity(sc.nextInt());
        } else if(userInput == 4) {
            p.setTaxationSpecifics(sc.nextDouble());
        }
    }
}
