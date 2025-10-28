package blatt10;

public class Aufwand {

    public static int zahlDerUmbrueche(char[] charr, int z, int b, int o) {
        int count = 0;
        z++;
        for (int i = 0; i < charr.length-1; i++) {
            b++;
            z++;
            o++;
            o++;
            z++;
            if (charr[i] == '.') {
                b++;
                if (charr[i+1] == ' ') {
                    b++;
                    o++;
                    count++;
                    o++;
                    z++;
                }
            }
        }
        return count;
    }

    public static char[] umbrueche(String s) {
        int z = 0;
        int b = 0;
        int o = 0;
        char[] charr = s.toCharArray();
        z++;
        int c = zahlDerUmbrueche(charr, z, b, o);
        z++;
        int k = 0;
        z++;
        char[] charr2 = new char[charr.length+c];
        z++;
        while (c > 0) {
            b++;
            for (int i = 0; i < charr.length-1; i++) {
                z++;
                b++;
                z++;
                o++;
                o++;
                if (charr[i] == '.') {
                    b++;
                    if (charr[i+1] == ' ') {
                        b++;
                        o++;
                        charr2[i] = charr[i];
                        z++;
                        charr2[i+1] = '\n';
                        o++;
                        k++;
                        c--;
                        o++;
                        o++;
                        z++;
                        z++;
                    } else {
                        charr2[i+k] = charr[i];
                        o++;
                        z++;
                    }
                } else {
                    if (charr[i] == ' ' && charr[i-1] == '.') {
                        b++;
                        b++;
                        o++;
                    } else {
                        charr2[i] = charr[i];
                        z++;
                    }
                }
            }
        }
        System.out.println(z + " " + b + " " + o);
        return charr2;


    }

    public static void main(String[] args) {
        String eingabe = "Nussecken (1 Blech). Teig: 300g Mehl, 1 TL Backpulver, 130g Zucker, 1 Pkg Vanillezucker, 2 EL Leinsamen, 6 EL Wasser, 130g Margarine/Butter. Belag: 200g Margarine/Butter, 6 EL Wasser, 200g Zucker, 1 Pkg Vanillezucker, 400g gemahlene Haselnüsse/Mandeln. Außerdem: Erdbeer-/Himbeermarmelade, 100g Zartbitterschokolade. Schritte: Die Leinsamen in 6 EL Wasser aufquellen lassen. Alle Zutaten für den Teig vermischen und zu einem relativ weichen Teig zerkneten, dann auf einem mit Backpapier ausgelegten Backbleck dünn drücken. Marmelade dünn auf dem Teig verteilen. Margarine, Wasser, Zucker und Vanillezucker in einem Topf schmelzen und kurz aufkochen lassen, dann Nüsse dazugeben und alles vermischen. Belag auf der Marmelade verteilen. Im vorgeheizten Backofen bei 180° C Ober/Unterhitze oder 160° C Umluft ca. 30 Minuten backen. Glasur erwärmen und mit einem Löffel über das Blech sprenkeln (so wird es gleichmäßiger und geht schneller als die Ecken in Schokolade zu tunken), abkühlen lassen. Zu Ecken schneiden.";
        char[] ausgabe = umbrueche(eingabe);
        System.out.println(eingabe);
        System.out.println(ausgabe);
    }
}
// A) das programm fügt einem text umbrüche hintz wie auch brüche wo welche gebraucht werden bzw. überall
// B) z = 3049 b = 1060 o = 2082 vielleicht falsch aber hoffentlich ähnlich