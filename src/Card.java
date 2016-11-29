
public class Card {

    private int rank;
    private String suit;

    public Card(int newRank, String newSuit) {
        if (rank >= 14 || rank <= 0) {
            throw new RuntimeException("The rank must be from 1-13");
            //Throws a runtime exception because the rank is too high or too low
        }

        rank = newRank;
        suit = newSuit;
    }


    public int getRank() {

        return rank;
    }

    public int getRankInt() {
        //Checks if the rank is from 2-10 if not returns -1
        if (rank >= 14 || rank <= 0) {
            return rank;
        }
        return -1;
    }

    public String getSuit() {

        return suit;
    }

    public String toString() {
        return "Card{" +
                ", rank='" + rank + '\'' +
                ", suit='" + suit + '\'' +
                '}';
    }

}
