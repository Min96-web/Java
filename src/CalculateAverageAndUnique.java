import java.util.Scanner;
/**
 * A program with the help of a terminal to get some integer from users then print the average and the unique of
 * those numbers. This programs will also be able to handle incorrect input, then print the appropriate error
 * message and ask for users to put in a new correct number.
 * @author Minhui Zhong
 * @version 1.0
 */
public class CalculateAverageAndUnique {
    /**
     * Program entry point
     *
     * @param args not used
     */
    public static void main(String[] args) {
        printWelcome();
        int[] n = {-12,4,5,9};
        int min = getMinNumber(n);
        int max = getMaxNumber(n);
        int amountNumbers = getTotalInput();
        int[] arrayNumbers = new int[amountNumbers];
        for (int i = 0; i < amountNumbers; i++) {
            arrayNumbers[i] = getNumber();
        }
        System.out.println("Du angav " + amountNumbers + " tal. \n" + "Varav " + calculateUnique(arrayNumbers,min,max) +
                " är unika. \n" + "Medelvärdet för talen är " + numbersOfAverage(arrayNumbers));
    }
    /**
     * Print welcome message.
     */
    public static void printWelcome() {
        System.out.println("** HELTALSHANTERARE **");
    }
    /**
     * Start the program
     * Method for getting amount of integer numbers from user
     * @return  amount of numbers provided by user(totalNumber)
     */
    public static int getTotalInput() {
        Scanner scanner = new Scanner(System.in);
        String input;
        int totalNumber = 1;
        boolean correctNumber = false;
        while (!correctNumber) {
            System.out.print("Hur många heltal vill du ange: ");
            input = scanner.nextLine();
            try {
                totalNumber = Integer.parseInt(input);
                if (totalNumber < 1) {
                    System.out.println("Ogiltigt värde");
                    correctNumber = false;
                } else {
                    correctNumber = true;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Ogiltigt värde");
            }
        }
        return totalNumber;
    }
    /**
     * A method to get a integer number from the amount numbers
     * @return the number from input by user(inputNumber)
     */
    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = 0;
        boolean correctInput = false;
        while(!correctInput) {
            System.out.print("Ange heltal: ");
            String number = scanner.nextLine();
            try {
                inputNumber = Integer.parseInt(number);
                if(inputNumber == 0){
                    System.out.println("Ogiltigt värde");
                    correctInput = false;
                } else {
                    correctInput = true;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Ogiltigt värde");
            }
        }
        return inputNumber;
    }
    /**
     * A method to get the average value
     * Calculate the average from those provided numbers by users
     * @param n Total numbers we want to calculate average from user
     * @return average value
     */
    public static int numbersOfAverage(int[] n) {
        int amountOfNumber = 0;
        for (int i : n) {
            amountOfNumber += i;
        }
        return amountOfNumber / n.length;
    }
    /**
     * A method to get a min value
     * @param n the numbers provided by user
     * @return min value
     */
    public static int getMinNumber(int[] n){
        int min = n[0];
        for(int i = 1; i < n.length; i++) {
            if(n[i] < min) {
                min = n[i];
            }
        } return min;
    }
    /**
     * A method to get a max value
     * @param n the numbers provided by user
     * @return max value
     */
    public static int getMaxNumber(int[] n){
        int max = n[0];
        for(int i = 1; i < n.length; i++) {
            if(n[i] > max) {
                max = n[i];
            }
        } return max;
    }
    /**
     * Calculate unique numbers from the provided numbers
     * @param n the numbers we want to calculate unique numbers
     * @param min min value (inclusive in input)
     * @param max max value (inclusive in input)
     * @return the amount of unique numbers
     */
    public static int calculateUnique(int[] n,int min,int max) {
        int uniqueCounter = 0;
        int[] arrayUnique = new int[max - min + 1];
        for (int j : n) {
            arrayUnique[j - min]++;
        }
        for (int j = 1; j < arrayUnique.length; j++) {
            if (arrayUnique[j] == 1) {
                uniqueCounter++;
            }
        }
        return uniqueCounter;
    }
}
