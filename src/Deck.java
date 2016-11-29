import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> CardList;


    public Deck(ArrayList<Card> cardList) {
        CardList = cardList;
    }

    public void addCardsDefault(Card card) {


    }

    //Idk why you would need this
    public void addCard(Card card) {
        CardList.add(card);
    }

    public String toString() {
        return "Deck{" +
                "CardList=" + CardList +
                '}';
    }
}
