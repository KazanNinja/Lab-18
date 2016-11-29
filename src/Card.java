
public class Card {

    private String rank;
    private String suit;

    public Card(String rank, String suit) {
        if (Integer.parseInt(rank) >= 11 || Integer.parseInt(rank) <= 1) {
            throw new RuntimeException("The rank must be from 2-10");
            //Throws a runtime exception because the rank is too high
        }

        this.rank = rank;
        this.suit = suit;
    }

    public String getRank() {

        return rank;
    }

    public int getRankInt() {
        //Checks if the rank is from 2-10 if not returns -1
        if (Integer.parseInt(rank) >= 11 || Integer.parseInt(rank) <= 1) {
            return Integer.parseInt(rank);
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
