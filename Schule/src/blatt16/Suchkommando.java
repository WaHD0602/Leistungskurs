package blatt16;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
public class Suchkommando {

    public static void suchen(String dateiname, String dateiendung, String pfad) {
        File f =  new File(pfad);
        File s;
        if (!f.isFile()){
            String[] arr =  f.list();
            if (arr != null) {
                for (int i = 0; i < arr.length; i++) {
                    s = new File(pfad + "/" + arr[i]);
                    if (s.isFile()) {
                        if (s.getName().equals(dateiname + dateiendung)) {
                            System.out.println(s.getPath());
                            System.exit(0);
                        }
                        // gesuchte Datei?
                    } else {
                        suchen(dateiname, dateiendung, pfad + "/" + arr[i] + "/");
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        suchen("Kira1", ".txt", "C:/");
        System.out.println("Keine Datei mit diesem Namen gefunden!");
    }
}
