public class TestClass {
    public static void main(String[] args) {



        Inventory i = new Inventory();
        i.addProduct(new SmartPhone("Samsung", 200000, 3, 200, ProductType.Electronics, 34.5, "2 years", "Android Lollipop", 128, 50));
        i.addProduct(new SmartPhone("Vivo", 200000, 3, 200, ProductType.Electronics, 34.5, "2 years", "Android Lollipop", 128, 50));
        i.addProduct(new SmartPhone("Redmi", 200000, 3, 200, ProductType.Electronics, 34.5, "2 years", "Android Lollipop", 128, 50));
        i.addProduct(new Laptop("Dell Latitiude", 50000, 3, 30, ProductType.Electronics, 50, "5 Years", "Core i5 7th Generation", 16, "14 * 8"));
        System.out.println(" ======================================================== ");
        System.out.println(" ==================== INITIAL INVENTORY ================= ");
        System.out.println(" ======================================================== ");
        i.displayInventory();
        System.out.println();
        System.out.println();
//        Product p = i.selectProduct(2);
//        p.setQuantity(9);
//        p.setPrice(100);
        System.out.println(i.selectProduct(2));
        System.out.println();
        System.out.println();
        i.removeProduct(4);
        i.displayInventory();
        System.out.println();
        System.out.println();

        i.updateProduct(2);
        System.out.println(" ======================================================== ");
        System.out.println(" ==================== UPDATED INVENTORY ================= ");
        System.out.println(" ======================================================== ");
        i.displayInventory();


//        i.removeProduct(3);
//        i.displayInventory();
    }
}
