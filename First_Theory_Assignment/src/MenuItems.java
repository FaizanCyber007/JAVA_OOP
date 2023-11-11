public enum MenuItems {
    RussianSalad(1, "Russian Salad", "A mix of chopped vegetables, soft potatoes, and creamy mayo, a classic favorite.", 600, MenuItemType.Appetizer),
    Biryani(2, "Chicken Biryani", "Tender chicken and fragrant rice, spiced just right for a delightful meal.", 400, MenuItemType.Entree),
    Pulao(3, "Pulao", "A flavorful rice dish with your choice of ingredients, cooked with aromatic spices for a satisfying and fragrant meal.", 400, MenuItemType.Entree),
    ZingerBurger(4, "Zinger Burger", " Fiery chicken delight in a soft embrace.", 500, MenuItemType.Entree),
    PattyBurger(5, "Patty Burger", "A juicy beef patty in a soft bun, a classic delight.", 450, MenuItemType.Entree),
    GrilledBurger(6, "Grilled Burger", "A smoky, seasoned beef patty in a soft bun, grilled to perfection.", 500, MenuItemType.Entree),
    ChickenTikkaPizza(7, "Chicken Tikka Pizza (Large)", "A pizza with spiced chicken, aromatic spices, and tomato sauce.", 1500, MenuItemType.Entree),
    CheezLoverPizza(8, "Cheez Lover Pizza (Large)", "A pizza loaded with a variety of cheeses, perfect for cheese enthusiasts.", 1500, MenuItemType.Entree),
    ChickenSteakPizza(9, "Chicken Steak Pizza (Large)", "A pizza with seasoned chicken steak slices and fresh veggies.", 1500, MenuItemType.Entree),
    Sajji(10, "Sajji", "A Pakistani specialty - marinated, skewered, and roasted meat with spices.", 1000, MenuItemType.Entree),
    Wings(11, "Fried Wings", "Crispy chicken wings with spices, perfect for snacking.", 1200, MenuItemType.Entree),
    ZingerWrap(12, "Zinger Wrap", "A spicy chicken patty wrapped in tortilla, a zesty handheld delight.", 800, MenuItemType.Entree),
    ChickenShawarma(13, "Chicken Shawarma (Large)", "Slices of marinated, slow-cooked chicken in pita bread with veggies and tahini.", 300, MenuItemType.Entree),
    ZingerShawarma(14, "Zinger Shawarma", "A fusion of Zinger chicken and Middle Eastern Shawarma.", 400, MenuItemType.Entree),
    Platter(15, "Platter Shawarma", "A feast with chicken or beef, vegetables, rice, and pita bread, topped with tahini sauce.", 700, MenuItemType.Entree),
    MangoShake(16, "Mango Shake", "A refreshing blend of ripe mangoes and creamy milk", 450, MenuItemType.Beverage),
    OreoShake(17, "Oreo Shake", "A creamy vanilla ice cream and crushed Oreo cookie milkshake.", 500, MenuItemType.Beverage),
    Cocktail(18, "Cocktail", "An expertly crafted mix of premium spirits, fruits, and juices.", 750, MenuItemType.Beverage),
    ChickenKarhai(19, "Chicken Karhai", "A spicy Pakistani dish with tender chicken cooked in a karhai.", 1500, MenuItemType.Entree),
    ChickenSoup(20, "Chicken Soup (Family Bowl)", "A comforting bowl with chicken, vegetables, and flavorful broth", 2000, MenuItemType.Appetizer);

    final int itemID;
    final String itemName;
    final String itemDescription;
    final double itemPrice;
    final MenuItemType itemType;
    MenuItems(int itemID, String itemName, String itemDescription, double itemPrice, MenuItemType itemType) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
        this.itemType = itemType;
    }

    public int getItemID() {

        return itemID;
    }

    public String getItemName() {

        return itemName;
    }

    public String getItemDescription() {

        return itemDescription;
    }

    public double getItemPrice() {

        return itemPrice;
    }

    public MenuItemType getItemType() {

        return itemType;
    }

    @Override
    public String toString() {
        return String.format("Item ID: %03d   Item Name: %-30s   Item Description: %-120s   Item Price: Rs. %-6.2f   Item Type: %s",itemID,itemName,itemDescription,itemPrice,itemType);
    }
}
