import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Bildbetrachter
{
    private JFrame fenster;
    
    public Bildbetrachter()
    {
        fensterErzeugen();
    }

    // ---- Implementierung der Menü-Funktionen ----
    
    private void dateiOeffnen()
    {
        // Testausgabe, bis wir das richtig implementiert haben
        System.out.println("Datei öffnen");
    }

    private void beenden()
    {
        System.exit(0);
    }
    
    private void info()
    {
        System.out.println("Information");
    }
    
    private void speichern()
    {
        System.out.println("Datei speichern");
    }
    
    // ---- Swing-Anteil zum Erzeugen des Fensters mit allen Komponenten ----
    
    private void fensterErzeugen()
    {
        fenster = new JFrame("Bildbetrachter");
        menuezeileErzeugen(fenster);
        
        Container contentPane = fenster.getContentPane();
        
        JLabel label = new JLabel("Ich bin ein Label. Ich kann Text anzeigen.");
        contentPane.add(label);

        // Aufbau abgeschlossen - Komponenten arrangieren lassen
        fenster.pack();
        fenster.setVisible(true);
    }
    
    private void menuezeileErzeugen(JFrame fenster)
    {
        JMenuBar menuezeile = new JMenuBar();
        fenster.setJMenuBar(menuezeile);
                
        // das Datei-Menü erzeugen
        JMenu dateiMenue = new JMenu("Datei");
        menuezeile.add(dateiMenue);
        
        JMenu hilfeMenue = new JMenu("Hilfe");
        menuezeile.add(hilfeMenue);
        
        JMenuItem oeffnenEintrag = new JMenuItem("Öffnen");
        oeffnenEintrag.addActionListener(e -> dateiOeffnen());                           
        dateiMenue.add(oeffnenEintrag);

        JMenuItem beendenEintrag = new JMenuItem("Beenden");
        beendenEintrag.addActionListener(e -> beenden());
        dateiMenue.add(beendenEintrag);
        
        JMenuItem infoEintrag = new JMenuItem("Info");
        infoEintrag.addActionListener(e -> info());
        hilfeMenue.add(infoEintrag);
        
        JMenuItem speichernEintrag = new JMenuItem("Speichern");
        speichernEintrag.addActionListener(e -> speichern());
        dateiMenue.add(speichernEintrag);
    }
}
