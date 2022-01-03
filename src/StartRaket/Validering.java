/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StartRaket;

import javax.swing.JComboBox;
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
    //Kollar så att man matat in en siffra i textrutan.
public static boolean ogiltigtVarde(JTextField rutaAttKolla) {
        boolean resultat = true;
        
        try{
        String inString = rutaAttKolla.getText();
        Integer.parseInt(inString);
        }   
        catch(NumberFormatException e)
        {
        JOptionPane.showMessageDialog(null,"Var vänlig ange en siffra");
        rutaAttKolla.requestFocus();

        }
        
        return resultat;
    }

    //Kollar så att ett nytt lösenord är max 8 tecken
public static boolean rattLangd(JPasswordField nyttLosen) {
        boolean lagomLangd = true;
        String losenord = new String(nyttLosen.getPassword());
        if (losenord.length() > 8) {
            JOptionPane.showMessageDialog(null, "Vänligen ange ett lösenord med MAX 8 tecken.");
            lagomLangd = false;
        }
        return lagomLangd;



}
    //Kollar så att comboboxen har ett valt värde
    public static boolean rattIndexComboBox(JComboBox x) {
        boolean IndexHarVarde = true;
        if (x.getSelectedIndex() == 0) {
            IndexHarVarde = false;
            JOptionPane.showMessageDialog(null, "Vänligen välj ett alternativ i listan");
        }
        return IndexHarVarde;
    }
}
      