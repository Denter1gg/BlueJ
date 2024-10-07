import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Bildbetrachter implements ActionListener
{
    private JFrame fenster;
    private JButton button;
    
    public Bildbetrachter()
    {
        fensterErzeugen();
    }
    
    public void actionPerformed(ActionEvent event)
    {
        System.out.println("Eintrag" + event.getActionCommand()); 
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
        
        menuezeileErzeugen();
        
        fenster.pack();
        fenster.setVisible(true);
    }    
    
    private void menuezeileErzeugen()
    {
        JMenuBar menuezeile = new JMenuBar();
        fenster.setJMenuBar(menuezeile);

        JMenu dateimenue = new JMenu("Datei");
        menuezeile.add(dateimenue);
        
        JMenuItem oeffnenItem = new JMenuItem("Oeffnen");
        oeffnenItem.addActionListener(this);
        dateimenue.add(oeffnenItem);
        
        JMenuItem beendenItem = new JMenuItem("Beenden");
        beendenItem.addActionListener(this);
        dateimenue.add(beendenItem);
        
        JMenu hilfemenue = new JMenu("Hilfe");
        menuezeile.add(hilfemenue);
    }
}
