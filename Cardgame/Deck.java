import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
    private ArrayList<Card> cards = new ArrayList<>();

    public Deck() {
        String soortkaart = "";
        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    soortkaart = "Harten";
                    break;
                case 1:
                    soortkaart = "Ruiten";
                    break;
                case 2:
                    soortkaart = "Schoppen";
                    break;
                case 3:
                    soortkaart = "Klavers";
                    break;
            }
            for (int j = 2; j < 11; j++) {
                Card c = new Card(soortkaart, Integer.toString(j), j );
                cards.add(c);
            }
            Card jack = new Card(soortkaart, "jack", 11);
            Card queen = new Card(soortkaart, "queen", 12);
            Card king = new Card(soortkaart, "king", 13);
            Card ace = new Card(soortkaart, "ace", 14);
            
            cards.add(jack);
            cards.add(queen);
            cards.add(king);
            cards.add(ace);
            
            Collections.shuffle(cards);
            }
    }

    public Card getNextCard() {
        return cards.remove(0);
    }
    public ArrayList <Card> getCards() {
        return cards;
    }

}
