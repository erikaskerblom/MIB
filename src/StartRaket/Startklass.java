package StartRaket;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

//Klass som sköter databasuppkoppling och startar programemt

public class Startklass {

public Startklass()
{

}

    private static InfDB idb;
    
    public static void main(String[] args) {
        try {
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddalande" + ettUndantag.getMessage());
        }
          MetoderFyllaCB.databas(idb);
          new MainMenu(idb).setVisible(true);
    }

    
}



