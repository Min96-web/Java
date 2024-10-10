package celsius;

import javax.swing.*;
/*
 * Ett program som tar in en temperatur i Fahrenheit och konverterar den till Kelvin.
 */
public class FahrenheitToKelvin {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Skriv in temperatur i Fahrenheit");
        Double temperatureFahrenheit = Double.parseDouble(input);
        Double temperatureKelvin = (temperatureFahrenheit - 32) / 1.8 + 273.15;
        JOptionPane.showMessageDialog(null, temperatureFahrenheit + " grader Fahrenheit är " +
                temperatureKelvin + " grader Kelvin");
    }
}
//Modifiera programmet så att det istället tar in en temperatur i Fahrenheit från användaren och konverterar till
// Kelvin. Formel för konverteringen: (Fahrenheit - 32) / 1.8 +  273.15.