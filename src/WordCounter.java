/*
Program ask users enter a sentence and a specified character in the sentence, display message describing
total characters and how many specified characters were in this sentence. Program also display
the index location of the first occurrence of the character and the index location of the last occurrence of
the character. Program would handle an error input and print an error message.
@author Minhui
 */

//Activate a default package can create a dialog box.
import javax.swing.*;
//A class with name WordsCounter.
public class WordCounter {
    //Main method.
    public static void main(String[] args) {
        //String variable named sentence.
        String sentence;
        //String variable named word.
        String word;
        //Initiate 0 to int variable.
        int numberOfH = 0;
        //Variable int
        int value1;
        //Variable int
        int value2;
        //Declare String variable.
        sentence = JOptionPane.showInputDialog("Skriv in en mening");
        word = JOptionPane.showInputDialog("Skriv in ett tecken");
        //Converted string value to lowercase.
        sentence = sentence.toLowerCase();
        //Returns the index of the first occurrence of character value1 in the given string.
        value1 = sentence.indexOf(word);
        //Returns the index of the last occurrence of character value2 in the given string.
        value2 = sentence.lastIndexOf(word);
        //Boolean ok store false data.
        boolean ok = false;
        //For loop to get the output.
        for (int i = 0; i < sentence.length(); i++) {
                if (word.contains(sentence.substring(i, i+1))) {
                    //if (sentence == null){
                       // JOptionPane.showMessageDialog(null,"Tack!");
                        //sentence = " ";
                    //}
                    //else {
                    try {
                        numberOfH++;
                        //Right message.
                        ok = true;
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, " Du behöver ange både en mening och ett tecken!");
                    }
                }
            }
            //Display right message.
            if (ok) {
                JOptionPane.showMessageDialog(null, "Meningen har totalt " + sentence.length() + " tecken " +
                        "\nTecknet " + word + " förekommer " + numberOfH + " gånger " + "\nFörsta gången på indexplats " + value1 +
                        "\nSista gången på indexplats " + value2);
            }
            //Display error message.
            else {
                JOptionPane.showMessageDialog(null, " Du behöver ange både en mening och ett tecken!");
            }


        }
}





