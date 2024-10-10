package Sentence;

import javax.swing.*;
/*
 * Ett program som tar in två meningar från användaren och skriver ut den mening som var längst.
 * Om både är lika långa skrivs istället ett meddelande om att så var fallet istället ut.
 */
public class LongestSentence {

    public static void main(String[] args) {
        String sentence1 = JOptionPane.showInputDialog("Skriv in första meningen");
        String sentence2 = JOptionPane.showInputDialog("Skriv in andra meningen");
        String output;

        if(sentence1.length() > sentence2.length()) {
            output = sentence1;
        }
        else if(sentence2.length() > sentence1.length()) {
            output = sentence2;
        }
        else {
            output = "Båda meningarna var lika långa";
        }
        JOptionPane.showMessageDialog(null, output);
    }
}
//Konstruera ett program som tar in två meningar från användaren. Programmet ska sedan skriva ut den mening som var
// längst. Om både var lika långa ska istället ett meddelande om att så var fallet skrivas ut.