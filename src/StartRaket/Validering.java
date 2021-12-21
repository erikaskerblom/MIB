/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StartRaket;

import javax.swing.JOptionPane;
import javax.swing.JTextField;


/**
 *
 * @author majahawia
 */
public class Validering {
    
public static boolean textFaltHarVarde(JTextField rutaAttKolla)
{
    boolean resultat=true;
    if(rutaAttKolla.getText().isEmpty()){
       JOptionPane.showMessageDialog(null,"Inmatningsruta är tom!");
       resultat=false;
       
    }

     return resultat;
}

}
