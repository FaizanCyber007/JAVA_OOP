public enum MenuItemType {
    Appetizer(1), Entree(2), Dessert(3), Beverage(4);
    final int value;

    MenuItemType(int value) {
        this.value = value;
    }
}
