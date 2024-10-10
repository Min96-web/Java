import java.util.HashSet;
import java.util.Scanner;

/**
 * A program with the help of terminal to get some integer from users then print average and unique. This
 * programs will also be able to handle incorrect input and then print the appropriate error message.
 * @author Minhui Zhong
 * @version 1.0
 */
public class Lab3 {
    /**
     * Program entry point
     *
     * @param args not used
     */
    public static void main(String[] args) {
        printWelcome();
        //int[] n ={-12,-11,5,9};
        //int min = getMinNumber(n);
        //int max = getMaxNumber(n);
        int amountNumbers = getTotalInput();
        int[] arrayNumbers = new int[amountNumbers];
        for (int i = 0; i < amountNumbers; i++) {
            arrayNumbers[i] = getNumber();
        }
        System.out.println("Du angav " + amountNumbers + " tal. \n" + "Varav " + calculateUnique(arrayNumbers) + " är unika. \n" +
                "Medelvärdet för talen är " + numbersOfAverage(arrayNumbers));

    }

    /**
     * Print welcome message.
     */
    public static void printWelcome() {
        System.out.println("** HELTALSHANTERARE **");
    }

    /**
     * Get amount of integer numbers from user
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
     * En method to get the integer number
     * @return the number from input by user(inputNumber)
     */
    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = 0;
        System.out.print("Ange heltal: ");
        String number = scanner.nextLine();
        try {
            inputNumber = Integer.parseInt(number);
        } catch (NumberFormatException nfe) {
            System.out.println("Ogiltigt värde");
        }
        return inputNumber;
    }

    /**
     * Calculate average from the provided numbers via terminal
     * @param n the numbers we want to calculate average from user
     * @return average
     */
    public static int numbersOfAverage(int[] n) {
        int amountOfNumber = 0;
        for (int i : n) {
            amountOfNumber += i;
        }
        return amountOfNumber / n.length;
    }

    /**
     *
     * @param n the numbers provided by user
     * @return min value
     */
    /*public static int getMinNumber(int[] n){
        int min = n[0];
        for(int i = 1; i < n.length; i++) {
            if(n[i]<min) {
                min = n[i];
            }
        } return min;
    }*/

    /**
     *
     * @param n the numbers provided by user
     * @return max value
     */
    /*public static int getMaxNumber(int[] n){
        int max = n[0];
        for(int i = 1; i < n.length; i++) {
            if(n[i]<max) {
                max = n[i];
            }
        } return max;
    }*/
    public static int calculateUnique(int[] n) {
        int uniqueCounter = 0;
        /*int[] arrayUnique = new int[max - min + 1];
        for( int j : n) {
            arrayUnique[j - min] ++;
        }*/
        //int []uniqueNumbers = new int[n];
        HashSet<Integer> totalUnique = new HashSet<>();
        for (int j = 0; j < n.length; j++) {
            if (totalUnique.add(j)) {
                uniqueCounter++;
            } else {
                uniqueCounter--;
            }
            if (uniqueCounter<0) {
                uniqueCounter=0;
            }

            //for(int j = 1; j < arrayUnique.length; j ++) {
            //if(arrayUnique[j]==1){
              //  uniqueCounter ++;
            }
        return uniqueCounter;
        }

    }






