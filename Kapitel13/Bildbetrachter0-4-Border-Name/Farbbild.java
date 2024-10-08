import java.awt.*;
import java.awt.image.*;
import javax.swing.*;

public class Farbbild extends BufferedImage
{
    public Farbbild(BufferedImage image)
    {
         super(image.getColorModel(), image.copyData(null), 
               image.isAlphaPremultiplied(), null);
    }

    public Farbbild(int breite, int hoehe)
    {
        super(breite, hoehe, TYPE_INT_RGB);
    }

    public void setzePunktfarbe(int x, int y, Color col)
    {
        int punktfarbe = col.getRGB();
        setRGB(x, y, punktfarbe);
    }
    
    public Color gibPunktfarbe(int x, int y)
    {
        int punktfarbe = getRGB(x, y);
        return new Color(punktfarbe);
    }
}
