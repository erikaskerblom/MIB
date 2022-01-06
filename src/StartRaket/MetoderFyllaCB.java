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

    public static void laggTillPlats(JComboBox cb) {
        String platsFraga = "Select benamning From plats";

        ArrayList<String> allaPlatser;

        try {
            allaPlatser = idb.fetchColumn(platsFraga);
            for (String p : allaPlatser) {
                cb.addItem(p);
            }
        } catch (InfException ex) {
            Logger.getLogger(MetoderFyllaCB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void laggTillOmrade(JComboBox cb) {
        String omradesFraga = "Select benamning from omrade";

        ArrayList<String> allaOmraden;

        try {
            allaOmraden = idb.fetchColumn(omradesFraga);
            for (String o : allaOmraden) {
                cb.addItem(o);
            }

        } catch (InfException ex) {
            Logger.getLogger(MetoderFyllaCB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void laggTillAlien(JComboBox cb) {
        String alienFraga = "Select namn from alien";

        ArrayList<String> allaAliens;

        try {
            allaAliens = idb.fetchColumn(alienFraga);
            for (String a : allaAliens) {
                cb.addItem(a);
            }
        } catch (InfException ex) {
            Logger.getLogger(MetoderFyllaCB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void laggTillUtrustning(JComboBox cb) {
        String utrustningFraga = "Select Benamning from utrustning";

        ArrayList<String> allaUturstningar;

        try {
            allaUturstningar = idb.fetchColumn(utrustningFraga);
            for (String a : allaUturstningar) {
                cb.addItem(a);
            }
        } catch (InfException ex) {
            Logger.getLogger(MetoderFyllaCB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }



}
