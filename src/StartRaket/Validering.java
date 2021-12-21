/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StartRaket;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class Validering {
    
    //Kollar så att fältet inte lämnats tomt
public static boolean textFaltHarVarde(JTextField rutaAttKolla)
{
    boolean resultat=true;
    if(rutaAttKolla.getText().isEmpty()){
       JOptionPane.showMessageDialog(null,"Inmatningsruta är tom, var vänlig skriv något.");
       rutaAttKolla.requestFocus();

       resultat=false;
       
    }

     return resultat;
}
    //Kollar så att användarnamnet är en siffra
public static boolean ogiltigtAnvandarNamn(JTextField rutaAttKolla) {
        boolean resultat = true;
        
        try{
        String inString = rutaAttKolla.getText();
        Integer.parseInt(inString);
        }   
        catch(NumberFormatException e)
        {
        JOptionPane.showMessageDialog(null,"Var vänlig att ange ditt ID (siffra)");
        rutaAttKolla.requestFocus();

        }
        
        return resultat;
    }

    //Kollar så att ett nytt lösenord är max 8 tecken
//public static boolean rattLangd(JPasswordField nyttLosen)

}
      