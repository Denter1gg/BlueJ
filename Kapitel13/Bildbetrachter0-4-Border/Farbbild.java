import java.awt.*;
import java.awt.image.*;
import javax.swing.*;

public class Farbbild extends BufferedImage
{
    private String fileName;
    public Farbbild(BufferedImage image, String fileName)
    {
         super(image.getColorModel(), image.copyData(null), 
               image.isAlphaPremultiplied(), null);
               this.fileName = fileName;
    }
    
    public String getFilePath()
    {
        return fileName;
    }

    /**
     * Erzeuge ein Farbbild mit der angegebenen Größe mit
     * undefiniertem Inhalt.
     * @param breite  die Breite des Bildes
     * @param hoehe   die Hoehe des Bildes
     */
    public Farbbild(int breite, int hoehe)
    {
        super(breite, hoehe, TYPE_INT_RGB);
    }

    /**
     * Setze den angegebenen Bildpunkt dieses Bildes auf die
     * angegebene Farbe.
     * @param x    die x-Koordinate des Bildpunktes
     * @param y    die y-Koordinate des Bildpunktes
     * @param col  die Farbe des Bildpunktes
     */
    public void setzePunktfarbe(int x, int y, Color col)
    {
        int punktfarbe = col.getRGB();
        setRGB(x, y, punktfarbe);
    }
    
    /**
     * Liefere die Farbe des angegebenen Bildpunktes.
     * @param x  die x-Koordinate des Bildpunktes
     * @param y  die y-Koordinate des Bildpunktes
     * @return   die Farbe des Bildpunktes an der angegebenen Position
     */
    public Color gibPunktfarbe(int x, int y)
    {
        int punktfarbe = getRGB(x, y);
        return new Color(punktfarbe);
    }
}
