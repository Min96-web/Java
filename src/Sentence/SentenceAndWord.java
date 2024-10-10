package Sentence;

import javax.swing.*;
/*
 * Ett program som tar in en mening och ett ord från användaren och skriver ut om meningen
 * börjar med ordet och om meningen avslutas med ordet. Programmet ska inte ta hänsyn till
 * stora och små bokstäver så 'Boll' och 'boll' bedöms som samma ord.
 */
public class SentenceAndWord {

    public static void main(String[] args) {
        String sentence = JOptionPane.showInputDialog("Skriv in en mening");
        String word = JOptionPane.showInputDialog("Skriv in ett ord");
        String output;

        sentence = sentence.toLowerCase();
        word = word.toLowerCase();

        if(sentence.startsWith(word)) {
            output = "Meningen börjar med ordet";
        }
        else {
            output = "Meningen börjar inte med ordet";
        }

        if(sentence.endsWith(word)) {
            output = output + ", meningen slutar med ordet.";
        }
        else {
            output = output + ", meningen slutar inte med ordet.";
        }
        JOptionPane.showMessageDialog(null, output);
    }
}
//Konstruera ett program som tar in en mening och ett ord från användaren. Programmet ska sedan skriva ut om meningen,
// börjar med ordet och om meningen avslutas med ordet. Programmet ska inte ta hänsyn till stora och små bokstäver
// så 'Boll' och 'boll' ska bedömas som samma ord.