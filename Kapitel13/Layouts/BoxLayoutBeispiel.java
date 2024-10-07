import java.awt.*;
import javax.swing.*;
public class BoxLayoutBeispiel
{
    private JFrame fenster;

    public BoxLayoutBeispiel()
    {
        fensterErzeugen();
    }

    private void fensterErzeugen()
    {
        fenster = new JFrame("BoxLayout-Beispiel");
        
        Container contentPane = fenster.getContentPane();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
        contentPane.add(new JButton("Erster"));
        contentPane.add(new JButton("Zweiter"));
        contentPane.add(new JButton("Der dritte String ist lang"));
        contentPane.add(new JButton("Vierter"));
        contentPane.add(new JButton("Fünfter"));
        
        fenster.pack();
        fenster.setVisible(true);
    }
}
