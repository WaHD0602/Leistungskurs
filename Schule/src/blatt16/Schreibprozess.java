package blatt16;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;

public class Schreibprozess {
    public static void main(String[] args) {

        File f = new File("io");
        boolean exists = f.isDirectory();
        if (exists != true) {
            f.mkdir();
        }
        try {

            File t = new File("io/Test01.txt");
            FileWriter fw = new FileWriter(t);
            fw.write("Max guckt nie meine Tik toks die ich ihm schicke \n");
            fw.write("Max singt sehr viel in Informatik \n");
            fw.write("Das Problem liegt meistens nicht im Pc sondern vor dem Pc \n");
            fw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        File css = new File("io/css");
        if (css.exists() != true) {
            css.mkdir();
        }

        File img = new File("io/img");
        if (img.exists() != true) {
            img.mkdir();
        }

        try {
            File h = new File("io/Test02.html");
            FileWriter fw = new FileWriter(h);
            fw.write("<!DOCTYPE html> \n");
            fw.write("<html> \n");
            fw.write("<head> \n");
            fw.write("<title>HTML aus Java</title> \n");
            fw.write("</head> \n");
            fw.write("<body> \n");
            fw.write("<h1>HTML aus Java?</h1> \n");
            fw.write("<p> Es geht. Wirklich. </p> \n");
            fw.write("</body> \n");
            fw.write("</html> \n");
            fw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
