package blatt17;

import blatt14.MultiArrays;
import blatt14.Simulationen;
import schisch_visualizer.SchischVisualizer;

public class Waldentwicklung {
    public static char[][] spielfeld;


    public static int zaehlenVier(char[][] spielfeld, int x, int y, char such) {
        int c = 0;

        if (x > 0) {
            if (spielfeld[x-1][y]  == such) {
                c++;
            }

        }
        if (y > 0) {
            if (spielfeld[x][y-1] == such) {
                c++;
            }
        }
        if (x < spielfeld.length-1) {
            if (spielfeld[x+1][y] == such) {
                c++;
            }
        }
        if (y < spielfeld[x].length-1) {
            if (spielfeld[x][y+1] == such) {
                c++;
            }
        }

        return c;
    }

    public static void init() {
        spielfeld = MultiArrays.createEmpty2DCharArrayNew(100,100);
    }

    public static void weiter(double p, double q) {
        char[][] spielfeldNeu = MultiArrays.copy2DCharArray(spielfeld);
        for (int x = 0; x < spielfeld.length; x++) {
            for (int y = 0; y < spielfeld[x].length; y++) {
                if (spielfeld[x][y] == '0') {
                    int zaehleBaum = zaehlenVier(spielfeld,x,y,'9');

                    if (Math.random() <= p+zaehleBaum*0.02) {
                        spielfeldNeu[x][y] = '9';
                    }
                } else if (spielfeld[x][y] == '9') {
                    if (Math.random() <= q) {
                        spielfeldNeu[x][y] = '4';
                    }

                    int zaehleFeuer = zaehlenVier(spielfeld,x,y,'4');
                    if (zaehleFeuer > 0) {
                        spielfeldNeu[x][y] = '4';
                    }

                } else if (spielfeld[x][y] == '4') {
                    spielfeldNeu[x][y] = '0';
                }


            }
        }

        spielfeld = spielfeldNeu;
    }



    public static void main(String[] args) {
        SchischVisualizer sv = new SchischVisualizer();
        init();

        sv.step(spielfeld);

        for (int i = 0; i < 500; i++) {
            weiter(0.005, 0.002);
            sv.step(spielfeld);

        }
        sv.start();

    }
}
