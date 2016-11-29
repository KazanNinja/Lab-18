
public class Card {

    private int rank;

    private String rankString;
    private String suit;

    public Card(int newRank, String newSuit) {
        if (newRank >= 14 || newRank <= 0) {
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

    /**
     * This method gets the rank of the card and converts it to a string including the Jack, Queen, King, Ace
     */
    public String getRankString() {
        if (rank == 1) {
            return "Ace";
        }
        else if (rank == 11) {
            return "Jack";
        }
        else if (rank == 12) {
            return "Queen";
        }
        else if (rank == 13) {
            return "King";
        }

        return Integer.toString(rank);
    }

    public String toString() {
        return "Card{" +
                ", rank='" + rank + '\'' +
                ", suit='" + suit + '\'' +
                '}';
    }

}
