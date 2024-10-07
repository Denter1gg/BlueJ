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
        if (event.getActionCommand().equals("Oeffnen")){
            dateiOeffnen();
        }
        
        else if (event.getActionCommand().equals("Beenden")){
            beenden();
        }
        
        else if (event.getActionCommand().equals("Speichern")){
            dateiSpeichern();
        }
        
        else if (event.getActionCommand().equals("Info")){
            info();
        }
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
        JMenu hilfemenue = new JMenu("Hilfe");
        menuezeile.add(dateimenue);
        menuezeile.add(hilfemenue);
        
        JMenuItem oeffnenItem = new JMenuItem("Oeffnen");
        JMenuItem beendenItem = new JMenuItem("Beenden");
        JMenuItem speichernItem = new JMenuItem("Speichern");
        JMenuItem infoItem = new JMenuItem("Info");
        
        oeffnenItem.addActionListener(this);
        beendenItem.addActionListener(this);
        speichernItem.addActionListener(this);
        infoItem.addActionListener(this);
        
        dateimenue.add(oeffnenItem);
        dateimenue.add(beendenItem);
        dateimenue.add(speichernItem);
        hilfemenue.add(infoItem);
    }
    
    private void dateiOeffnen()
    {
        System.out.println("Datei Öffnen");
    }
    
    private void dateiSpeichern()
    {
        System.out.println("Datei Speichern");       
    }
    
    private void beenden()
    {
        System.out.println("Beenden");
    }
    
    private void info()
    {
        System.out.println("Info");
    }
}
