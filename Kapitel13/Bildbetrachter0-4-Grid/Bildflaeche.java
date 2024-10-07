import java.awt.*;
import javax.swing.*;
import java.awt.image.*;

public class Bildflaeche extends JComponent
{
    private static final long serialVersionUID = 20060330L;

    // Die aktuelle Breite und H�he dieser Bildfl�che.
    private int breite, hoehe;

    // Ein interner Bildpuffer, der zum Zeichnen verwendet wird.
    // Wenn die Fl�che tats�chlich angezeigt werden soll, wird dieser
    // Puffer auf den Bildschirm kopiert.
    private Farbbild bild;

    public Bildflaeche()
    {
        breite = 360;    // beliebig gew�hlte Gr��e 
        hoehe = 240;
        bild = null;
    }

    public void setzeBild(Farbbild bild)
    {
        if(bild != null) {
            breite = bild.getWidth();
            hoehe = bild.getHeight();
            this.bild = bild;
            repaint();
        }
    }
    
    public void loeschen()
    {
        Graphics bildGraphics = bild.getGraphics();
        bildGraphics.setColor(Color.LIGHT_GRAY);
        bildGraphics.fillRect(0, 0, breite, hoehe);
        repaint();
    }
    
    // Die folgenden Methoden redefinieren Methoden, die aus
    // Superklassen geerbt wurden.
    
    public Dimension getPreferredSize()
    {
        return new Dimension(breite, hoehe);
    }
    
    public void paintComponent(Graphics g)
    {
        Dimension size = getSize();
        g.clearRect(0, 0, size.width, size.height);
        if(bild != null) {
            g.drawImage(bild, 0, 0, null);
        }
    }
}
