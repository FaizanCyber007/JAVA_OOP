public class Game {
    Card cards[] = new Card[52];
    Player player1 = new Player("Faizan");
    Player player2 = new Player("Fahad");
    Player player3 = new Player("Faisal");
    Player player4 = new Player("Abdullah");


    public void distributeCards() {
        for(int i=51, j=0; i>=0; j++) {
            player1.cardHolder[j] = cards[i--];
            player2.cardHolder[j] = cards[i--];
            player3.cardHolder[j] = cards[i--];
            player4.cardHolder[j] = cards[i--];
        }
    }

    public void displayEachPlayerCard() {
        for(int j=0; j<13; j++) {
            System.out.println(player1.cardHolder[j]); 
            System.out.println(player2.cardHolder[j]); 
            System.out.println(player3.cardHolder[j]); 
            System.out.println(player4.cardHolder[j]); 
        }
    }
}
