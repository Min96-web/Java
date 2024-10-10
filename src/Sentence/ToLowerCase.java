package Sentence;

import javax.swing.*;
/*
 * Ett program som tar in en mening från användaren.
 * Programmet gör om alla bokstäver till gemener (små bokstäver) och visar den nya meningen för användaren.
 */
public class ToLowerCase {

    public static void main(String[] args) {
        String sentence = JOptionPane.showInputDialog("Skriv in mening");
        String output;
        output = sentence.toLowerCase();
        JOptionPane.showMessageDialog(null, output);
    }
}
//Konstruera ett program som tar in en mening från användaren. Programmet ska göra om alla bokstäver till gemener
// (små bokstäver) och sedan visa den nya meningen för användaren.