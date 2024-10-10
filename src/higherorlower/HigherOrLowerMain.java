package higherorlower;

/**
 * The game Higher of Lower uses a shuffled deck where the first card shown to the user who
 * guesses if the next card is higher of lower. Om the user guess correct, she gets a point and
 * proceeds with the next card. If she guesses wrong the game ends.
 */
public class HigherOrLowerMain {
    /**
     * Program entry point.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        new HigherOrLower().startGame();
    }
}
