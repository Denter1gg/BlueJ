import java.awt.image.*;
import javax.imageio.*;
import javax.swing.*;
import java.io.*;

public class BilddateiManager
{
    // Eine Konstante, die das Format für geschriebene Dateien festgelegt.
    // Zulässige Formate sind "jpg" und "png".
    private static final String BILDFORMAT = "jpg";
    private static JFileChooser dateiauswahldialog = new JFileChooser(System.getProperty("user.dir"));
    
    public static Farbbild gibBild()
    {
        int ergebnis = dateiauswahldialog.showOpenDialog(null);

        if(ergebnis != JFileChooser.APPROVE_OPTION) {
            return null;  // abgebrochen
        }
        File selektierteDatei = dateiauswahldialog.getSelectedFile();
        return ladeBild(selektierteDatei);
    }

    public static Farbbild ladeBild(File bilddatei)
    {
        try {
            BufferedImage bild = ImageIO.read(bilddatei);
            if(bild == null || (bild.getWidth(null) < 0)) {
                // Bild konnte nicht geladen werden - vermutlich falsches Format
                return null;
            }
            return new Farbbild(bild, bilddatei.getName());
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