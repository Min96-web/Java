/*
Program ask users enter a sentence and a specified character in the sentence, display message describing
total characters and how many specified characters were in this sentence. Program also display
the index location of the first occurrence of the character and the index location of the last occurrence of
the character. Program would handle an error input and print an error message.
@author Minhui
 */

//Activate a default package can create a dialog box.
import javax.swing.*;
import java.util.Objects;

public class WordConter2 { //A class with name WordsCounter2.
    public static void main(String[] args) { //Main method.
        String sentence; //String variable named sentence.
        String word; //String variable named word.
        int numberOfH = 0; //Initiate 0 to int variable.
        int value1; //Variable int
        int value2;
        boolean ok = false; //Boolean ok store false data.
        sentence = JOptionPane.showInputDialog("Skriv in en mening"); //Declare String variable.
        word = JOptionPane.showInputDialog("Skriv in ett tecken");
        if (sentence == null && word == null) { //Avoid program crash and close program
            JOptionPane.showMessageDialog(null, "Tack och hej!");
        }
        else {
            sentence = Objects.requireNonNull(sentence).toLowerCase(); //Converted string value to lowercase.
            value1 = sentence.indexOf(word); //Returns the index of the first occurrence of character value1 in the given string.
            value2 = sentence.lastIndexOf(word); //Returns the index of the last occurrence of character value2 in the given string.
            for (int i = 0; i < sentence.length(); i++) {  //For loop to get the output.
                if (word.contains(sentence.substring(i, i + 1))) {
                    numberOfH++;
                    ok = true;
                }
            }
            if (ok) { //Display right message.
                JOptionPane.showMessageDialog(null, "Meningen har totalt " + sentence.length() + " tecken " +
                        "\nTecknet " + word + " förekommer " + numberOfH + " gånger " + "\nFörsta gången på indexplats " + value1 +
                        "\nSista gången på indexplats " + value2);
            }
            else { //Display error message.
                JOptionPane.showMessageDialog(null, " Du behöver ange både en mening och ett tecken!");
            }
        }


    }
}





