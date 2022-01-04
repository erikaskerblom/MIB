/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StartRaket;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import oru.inf.InfDB;
import oru.inf.InfException;


/**
 *
 * @author erika
 */
public class MetoderFyllaCB {

    private static InfDB idb;

    public static void databas(InfDB idb) {
        MetoderFyllaCB.idb = idb;
    }

    public static void laggTillAgent(JComboBox cb) {
        String agentFraga = "SELECT namn FROM agent";

        ArrayList<String> allaAgenter;

        try {
            allaAgenter = idb.fetchColumn(agentFraga);
             for (String a : allaAgenter) {
            cb.addItem(a);
        }
        } 
        catch (InfException ex) {
            Logger.getLogger(MetoderFyllaCB.class.getName()).log(Level.SEVERE, null, ex);
        }

       
    }
}