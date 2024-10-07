import java.awt.*;
import javax.swing.*;

public class BorderLayoutBeispiel
{
    private JFrame fenster;

    public BorderLayoutBeispiel()
    {
        fensterErzeugen();
    }

    private void fensterErzeugen()
    {
        fenster = new JFrame("BorderLayout-Beispiel");
        
        Container contentPane = fenster.getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(new JButton("Norden"), BorderLayout.NORTH);
        contentPane.add(new JButton("Süden"), BorderLayout.SOUTH);
        contentPane.add(new JButton("Mitte"), BorderLayout.CENTER);
        contentPane.add(new JButton("Westen"), BorderLayout.WEST);
        contentPane.add(new JButton("Osten"), BorderLayout.EAST);
        
        fenster.pack();
        fenster.setVisible(true);
    }
}
