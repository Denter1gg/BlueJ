import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
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
                
        // Das Datei-Menue erzeugen
        JMenu dateiMenue = new JMenu("Datei");
        menuezeile.add(dateiMenue);
        
        JMenuItem oeffnenEintrag = new JMenuItem("Öffnen");
        oeffnenEintrag.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            { 
                dateiOeffnen();
            }
        });
        dateiMenue.add(oeffnenEintrag);

        JMenuItem beendenEintrag = new JMenuItem("Beenden");
        beendenEintrag.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            { 
                beenden(); 
            }
        });
        dateiMenue.add(beendenEintrag);

    }
}
