import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Bildbetrachter
{
    private JFrame fenster;
    private JButton button;
    
    public Bildbetrachter()
    {
        fensterErzeugen();
    }
    
    
    // ---- Swing-Anteil zum Erzeugen des Fensters mit allen Komponenten ----
    
    private void fensterErzeugen()
    {
        fenster = new JFrame("Bildbetrachter");
        Container contentPane = fenster.getContentPane();
        
        JLabel label = new JLabel("Ich bin ein Label. Ich kann Text anzeigen.");
        contentPane.add(label);
        
        JButton button = new JButton("Ich bin ein Knopf. Ich kann angeclickt werden.");
        contentPane.add(button);
        
        JMenuBar menuezeile = new JMenuBar();
        fenster.setJMenuBar(menuezeile);

        JMenu dateimenue = new JMenu("Datei");
        menuezeile.add(dateimenue);
        
        JMenuItem oeffnenItem = new JMenuItem("¨Offnen");
        dateimenue.add(oeffnenItem);
        
        JMenuItem beendenItem = new JMenuItem("Beenden");
        dateimenue.add(beendenItem);
        
        fenster.pack();
        fenster.setVisible(true);
        button.setVisible(true);
    }    
}
