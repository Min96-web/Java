package higherorlower;

import java.util.Scanner;
/**
 * The game Higher of Lower uses a shuffled deck where the first card shown to the user who
 * guesses if the next card is higher of lower. Om the user guess correct, she gets a point and
 * proceeds with the next card. If she guesses wrong the game ends.
 */
public class HigherOrLower {
    /**
     * Start the game.
     */
    public void startGame() {
        System.out.println("** Välkommen till spelet Högre eller Lägre, spelet där du gissar om nästa kort är högre eller lägre");
        Deck deck = new Deck();
        deck.shuffle();
        boolean play = true;

        String input;
        int score = 0;

        Card card = deck.getNextCard();
        System.out.println("Kort: " + card);

        while(play) {

            System.out.print("Är nästa kort [h]ögre eller [l]ägre? ");

            input = getInput();

            Card nextCard = deck.getNextCard();
            System.out.println("Nästa kort: " + nextCard);

            if(input.equalsIgnoreCase("h") && nextCard.isHigherThan(card) ||
                    input.equalsIgnoreCase("l") && nextCard.isLowerThan(card)) {
                score ++;
                System.out.println("Korrekt! Du har nu gissar rätt " + score + " gånger.");
            }
            else {
                System.out.println("Det är tyvärr fel. Du gissade rätt " + score + " gånger");
                play = false;
            }
            if(deck.numberOfCards() == 0) {
                System.out.println("Du är helt fantastiskt, du tog dig igenom hela kortleken!");
                play = false;
            }
            card = nextCard;
        }
    }
    /**
     * Get user input.
     *
     * @return user input
     */
    public String getInput() {
        String input = "";
        Scanner scanner = new Scanner(System.in);
        while(!input.equalsIgnoreCase("h") && !input.equalsIgnoreCase("l")) {
            input = scanner.nextLine();
        }
        return input;
    }
}
