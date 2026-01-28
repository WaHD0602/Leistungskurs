package blatt15;

import schisch_visualizer.*;

public class Farben {

    static SchischVisualizer sv;
    static int[] spielerPosX;
    static int[] spielerPosY;
    static int[] reihenfolge;
    static char[][] spielfeld;

    public static void initialisiereSpielfeld() {
        spielfeld = blatt14.MultiArrays.createEmpty2DCharArray(80,80);
        for (int i = 0; i < 80; i++) {
            for (int j = 0; j < 80; j++) {
                spielfeld[0][j] = '8';
                spielfeld[i][0] = '8';
                spielfeld[79][j] = '8';
                spielfeld[i][79] = '8';
            }
        }
    }

    public static void startPositionen() {

    }

        public static void main(String[] args) {
        sv = new SchischVisualizer();
        initialisiereSpielfeld();
        sv.step(spielfeld);
        sv.start();
    }
}
