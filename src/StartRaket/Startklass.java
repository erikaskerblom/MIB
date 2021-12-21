package StartRaket;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class Startklass {

    private static InfDB databas;
    
    public static void main(String[] args) {
        try {
            databas = new InfDB("mibdb", "3306", "mibdba", "mibkey");
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddalande" + ettUndantag.getMessage());
        }
    
          new Startsida().setVisible(true);
    }

    
}



