/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StartRaket;

import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

/**
 *
 * @author filip
 */
public class Validering {

    public static boolean textFaltHarVarde(JFormattedTextField rutaAttKolla) {
        boolean resultat = true;

        if (rutaAttKolla.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Inmatningsrutan är tom!");
            resultat = false;
        }

        return resultat;
    }
}
