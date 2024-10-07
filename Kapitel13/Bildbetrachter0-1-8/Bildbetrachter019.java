import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;

public class Bildbetrachter019
{
    private JFrame fenster;
    private JButton button;
    
    public Bildbetrachter019()
    {
        fensterErzeugen();
    }
    
    private void fensterErzeugen()
    {
        fenster = new JFrame("Bildbetrachter");
        Container contentPane = fenster.getContentPane();
        
        JLabel label = new JLabel("Ich bin ein Label. Ich kann Text anzeigen.");
        contentPane.add(label);
        
        JButton button = new JButton("Ich bin ein Knopf. Ich kann angeclickt werden.");
        contentPane.add(button); 
        
        //Erzeugen der Menüzeile
        JMenuBar menuBar = new JMenuBar();
        fenster.setJMenuBar(menuBar);
        
        //Erzeugen der MenüKnöpfe
        JMenu dateimenue = new JMenu("Datei");
        JMenu hilfemenue = new JMenu("Hilfe");
        menuBar.add(hilfemenue);
        menuBar.add(dateimenue);
        
        //Erzeugen der Knöpfe in Menüknöpfen
        JMenuItem oeffnenItem = new JMenuItem("Öffnen");
        JMenuItem speichernItem = new JMenuItem("Speichern");
        JMenuItem beendenItem = new JMenuItem("Beenden");
        JMenuItem infoItem = new JMenuItem("Info");
        
        oeffnenItem.addActionListener(new OeffnenActionListener());
        dateimenue.add(oeffnenItem);
        
        speichernItem.addActionListener(new SpeichernActionListener());
        dateimenue.add(speichernItem);
        
        beendenItem.addActionListener(new BeendenActionListener());
        dateimenue.add(beendenItem);
                
        
        beendenItem.addActionListener(new InfoActionListener());
        hilfemenue.add(infoItem);
        
        fenster.pack();
        fenster.setVisible(true);
    } 
    
    //Klassen zum Ausführen des belauschten Kommands
    class OeffnenActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent oeffnenEven)
        {
            System.out.println("Datei geöffnet");
        }
    }
    
    class BeendenActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.out.println("Beendet");
        }
    }
    
    class SpeichernActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent speichernEvent)
        {
            System.out.println("Gespeichert");
        }
    }
    
    class InfoActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent infoEvent)
        {
            System.out.println("Info");
        }
    }
}
