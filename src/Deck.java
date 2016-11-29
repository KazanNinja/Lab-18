import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> CardList;

    public Deck() {
        CardList = new ArrayList<>();
    }

    /**
     * Adds the default playing cards to the ArrayList
     */
    public void addCardsDefault() {
        //Adds cards 1-13 with Hearts as the suit
        for(int i = 1; i <= 13; i++) {
            CardList.add(new Card(i, "Hearts"));
        }
        //Adds cards 1-13 with Diamonds as the suit
        for(int i = 1; i <= 13; i++) {
            CardList.add(new Card(i, "Diamonds"));
        }
        //Adds cards 1-13 with Clubs as the suit
        for(int i = 1; i <= 13; i++) {
            CardList.add(new Card(i, "Clubs"));
        }
        //Adds cards 1-13 with Spades as the suit
        for(int i = 1; i <= 13; i++) {
            CardList.add(new Card(i, "Spades"));
        }
    }

    public String toString() {
        return "Deck{" +
                "CardList=" + CardList +
                '}';
    }
}
