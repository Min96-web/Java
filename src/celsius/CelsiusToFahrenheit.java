package celsius;

import javax.swing.*;
/*
 * Ett program som tar in en temperatur i Celsius och konverterar den till Fahrenheit.
 */
public class CelsiusToFahrenheit {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Skriv in temperatur i Celsius");
        Double temperatureCelsius = Double.parseDouble(input);
        Double temperatureFahrenheit = temperatureCelsius * 1.8 + 32;
        JOptionPane.showMessageDialog(null, temperatureCelsius + " grader Celsius är " + temperatureFahrenheit + " grader Fahrenheit");
    }
}
//Kontruera ett program som tar in en temperatur i Celsius från användaren och konverterar den till Fahrenheit
// och meddelar svaret till användaren. Formeln för att konverteringen: Celsius * 1.8 + 32.