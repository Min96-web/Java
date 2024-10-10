/* Programmet skulle läsa in ett tal som motsvarar en hastighet i knop från användare och
skriva ut ett meddelande om hur många knop användaren angav och hur många km/h det motsvarar.
En knop motsvarar ca 1.852 km/h.
*/

import javax.swing.*; //Aktivera ett standardpaket som kan skapa en dialogruta.
public class KnopToKilometerpertimme { //En klass med namnet KnopToKilometerpertimme.
    public static void main(String[] args) { //En metod med namnet main.
        String input = JOptionPane.showInputDialog ("Skriv in en hastighet i knop"); //Deklarera en variabel av data typen String med namnet input och Mata in data från användare.
        double knop = Double.parseDouble(input); //Initera ett tal på variabel knop
        double K = knop * 1.852; //Beräkna hur många kilometerpertimme knopen motsvarar.
        JOptionPane.showMessageDialog (null, knop + " knop motsvarar " + K +" km/h " ); //Skriv ut resultat.
    }
}
