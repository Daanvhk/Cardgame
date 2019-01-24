import java.util.Scanner;
/**
 *
 * @author Beheerder
 */
public class Game {
    
    private static Card currentCard;
    private static Card nextCard;
    int correctAnswerCount;
    
    public static void main(String[] args) {
    	
        int correctAnswerCount = 0;
        Deck d = new Deck();
        boolean isPlaying = true; 
        
        System.out.println("Dit is een kaart spel, veel succes!");
        System.out.println(" ");
        
        while (isPlaying) {
            Scanner scan = new Scanner (System.in);
            
            if (nextCard == null) {
                currentCard = d.getNextCard();
            }
            else {
                currentCard = nextCard;
            }
            
            Card nextCard = d.getNextCard();
            
            System.out.println("Vul in: Higher or Lower");
            System.out.println("Je kaart is: " + currentCard);
            
            if ( nextCard.getWaarde() > currentCard.getWaarde() && scan.hasNext("Higher")){
                correctAnswerCount++;
                System.out.println("Goedzo!");
                System.out.println(" ");
                System.out.println("De kaart was " + nextCard);
                System.out.println(" ");  
            } 
            
            else if ( nextCard.getWaarde() < currentCard.getWaarde() && scan.hasNext("Lower")) {
                correctAnswerCount++;
            System.out.println("Goedzo! ");
                System.out.println(" ");
                System.out.println("De kaart was " + nextCard);
                System.out.println(" ");
            }
            
            else if (nextCard.getWaarde() == currentCard.getWaarde()) {
                
                System.out.println(nextCard);
                System.out.println(" ");
                System.out.println("De waarde is gelijk je krijgt een nieuwe kaart");
                System.out.println(" ");
            }
            else {
                System.out.println("Jammer joh de kaart was: " + nextCard + " je had " + correctAnswerCount + " punt(en)");
                System.out.println(" ");
                isPlaying = false;
            }
            
        }
        
    }

}