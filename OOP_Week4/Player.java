public class Player {
    Card cardHolder[] = new Card[13];
    final String name;

    Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return String.format("%s", name);
    }
}
