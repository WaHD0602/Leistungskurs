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

    public static boolean suchenUndLoeschen(String dateiname, String dateiendung, String pfad) {

        File f = new File(pfad);
        if (!f.exists()) {
            return false;

        }
        if (f.isDirectory()) {
            File[] inhalt = f.listFiles();
            if (inhalt != null) {
                for (File s : inhalt) {
                    if (s.isFile()) {
                        if (s.getName().equals(dateiname + dateiendung)) {
                            if (s.delete()) {
                                System.out.println("Datei gelöscht: " + s.getAbsolutePath());
                            } else {
                                System.out.println("Datei gefunden, aber konnte nicht gelöscht werden!");
                            }
                            return true;
                        }
                    }
                    else if (s.isDirectory()) {
                        if (suchenUndLoeschen(dateiname, dateiendung, s.getAbsolutePath())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }



    public static void main(String[] args) {
        //suchenUndLoeschen("TDorndiegeileSau", ".txt", "C://");
    }
}
