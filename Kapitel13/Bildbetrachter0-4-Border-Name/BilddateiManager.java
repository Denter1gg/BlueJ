import java.awt.image.*;
import javax.imageio.*;
import javax.swing.*;
import java.io.*;

public class BilddateiManager
{
    
    private static String path;
    private static String name;
    // Eine Konstante, die das Format f�r geschriebene Dateien festgelegt.
    // Zul�ssige Formate sind "jpg" und "png".
    private static final String BILDFORMAT = "jpg";
    private static JFileChooser dateiauswahldialog = new JFileChooser(System.getProperty("user.dir"));
    
    
    public static Farbbild gibBild()
    {
        int ergebnis = dateiauswahldialog.showOpenDialog(null);

        if(ergebnis != JFileChooser.APPROVE_OPTION) {
            return null;  // abgebrochen
        }
        File selektierteDatei = dateiauswahldialog.getSelectedFile();
        path = selektierteDatei.getAbsolutePath();
        name = selektierteDatei.getName();
        return ladeBild(selektierteDatei);
    }
    
    public static String getPath()
    {
        return path;
    }
    
    public static String getName()
    {
        return name;
    }
    
    public static Farbbild ladeBild(File bilddatei)
    {
        try {
            BufferedImage bild = ImageIO.read(bilddatei);
            if(bild == null || (bild.getWidth(null) < 0)) {
                // Bild konnte nicht geladen werden - vermutlich falsches Format
                return null;
            }
            return new Farbbild(bild);
        }
        catch(IOException exc) {
            return null;
        }
    }

    public static void speichereBild(Farbbild bild, File datei)
    {
        try {
            ImageIO.write(bild, BILDFORMAT, datei);
        }
        catch(IOException exc) {
            return;
        }
    }
}