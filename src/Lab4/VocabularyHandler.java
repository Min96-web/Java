package Lab4;

import java.util.Scanner;
/**
 * Text based program that ask user to put in the their English translation of ten Swedish words example: 'bil:
 * car', 'hus : house'. If user get the correct in their input that get one score.  When user wrote in the english
 * vocabularies, the program will display the vocabularies is correct, wrong or almost wrong. If user put in 'Q or
 * q' as input, that display the amount of vocabularies user answered and total score user got.
 *
 * @author Minhui Zhong
 * @version 1.0
 */
public class VocabularyHandler {
    /**
     * Program entry point
     *
     * @param args not used
     */
    public static void main(String[] args) {
        printInstruction();
        startPlay();
    }
    /**
     * Print the program instruction
     */
    public static void printInstruction() {
        System.out.println("** GLOSÖVNING - ENGELSKA ** \n" + "Skriv det engelska ordet. " +
                "Avsluta programmet genom att skriva Q.");
    }
    /**
     * Start the program
     * A method to create the data structure of this program
     */
    public static void startPlay() {
        String[] prompt = {"bil : ", "hus : ", "springa : ", "blå : ", "baka : ", "hoppa : ", "simma : ", "måne : ", "väg : ", "snäll : "};
        String[] answer = {"car", "house", "run", "blue", "bake", "jump", "swim", "moon", "road", "kind", "Q"};
        Vocabulary[] vocabularies = {new Vocabulary(prompt[0], answer[0]), new Vocabulary(prompt[1], answer[1]),
                new Vocabulary(prompt[2], answer[2]), new Vocabulary(prompt[3], answer[3]), new Vocabulary(prompt[4], answer[4]),
                new Vocabulary(prompt[5], answer[5]), new Vocabulary(prompt[6], answer[6]), new Vocabulary(prompt[7], answer[7]),
                new Vocabulary(prompt[8], answer[8]), new Vocabulary(prompt[9], answer[9])
        };
        getUserInput(vocabularies);
    }
    /**
     * A method to get the inputs from user
     *
     * @param vocabularies vocabularies are the total vocabularies program have
     */
    public static void getUserInput(Vocabulary[] vocabularies) {
        int score = 0;
        int amountOfWord = 0;
        Scanner getInput = new Scanner(System.in);
        for (int i = 0; i < vocabularies.length; i++) {
            System.out.print(vocabularies[i].prompt);
            String answer = getInput.nextLine();
            answer = answer.toLowerCase();
            amountOfWord++;
            if (answer.equals(vocabularies[i].answer)) {
                score++;
                System.out.println("Korrekt! " + score + " rätt av " + vocabularies.length + " ord.");
            }
            if (answer.equalsIgnoreCase("Q")) {
                System.out.println("Du svarade på totalt " + (amountOfWord - 1) + " glosor och hade " + score + " rätt. Välkommen åter! \n\n" +
                        "** GLOSÖVNING - ENGELSKA ** \n" + "Skriv det engelska ordet. " +
                        "Avsluta programmet genom att skriva Q.");
                i = -1;
                score = 0;
                amountOfWord = 0;
            }
            if (answer.equalsIgnoreCase("")) {
                System.out.println("Du anger inget ord. Korrekt svar är " + vocabularies[i].answer);
            } else if (!answer.equalsIgnoreCase("Q") && !answer.equals(vocabularies[i].answer)) {
                int charCounterWords = 0;
                for (int j = 0; j < answer.length(); j++) {
                    try {
                        if (answer.charAt(j) == vocabularies[i].answer.charAt(j)) {
                            charCounterWords++;
                        }
                    }
                    catch(Exception ignored) {
                    }
                }
                if (charCounterWords > answer.length() / 2) {
                    System.out.println("Nästan rätt. Korrekt svar är " + vocabularies[i].answer);
                } else {
                    System.out.println("Du anger ett fel ord. Korrekt svar är " + vocabularies[i].answer);
                }
            }
        }
        System.out.println("Du svarade på totalt " + amountOfWord + " glosor och hade " + score + " rätt. Välkommen åter!");
    }

}