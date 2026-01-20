package blatt14;

import schisch_visualizer.*;

public class OasenSuche {

    static char[][] spielfeld;
    static SchischVisualizer sv;

    public static void initialisiereSpielfeld(int l, int b) {
        spielfeld = new char[l][b];
        Simulationen.fuellen(spielfeld,' ',1);
    }

    public static void zufallsPositionSpieler() {
        Simulationen.platzieren(spielfeld,'P',true);
    }

    public static void wasserZufall(double ws) {
        if (ws >= 0 && ws <= 1) {
            Simulationen.fuellen(spielfeld,'6',ws,' ');
        }
    }

    public static void steinZufall(double ws) {
        if (ws >= 0 && ws <= 1) {
            Simulationen.fuellen(spielfeld,'A',ws,' ');
        }
    }

    public static void energy(int ws) {
        int energy = ws;
    }


    public static int[] findeSpieler() {
        for (int i = 0; i < spielfeld.length; i++) {
            for (int j = 0; j < spielfeld[i].length; j++) {
                if (spielfeld[i][j] == 'P') {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    public static void findeWasser(int energy) {
        while (true) {
            //zufallswert von 1-4
            sv.step(spielfeld);
            int zufall = blatt13.Zufall.zufallGanz(1, 5);
            int[] spielerposition = findeSpieler();
            if (zufall == 1 && spielerposition[1] > 0) {
                if (spielfeld[spielerposition[0]][spielerposition[1] - 1] != 'A') {
                    spielfeld[spielerposition[0]][spielerposition[1]] = '4';
                    spielfeld[spielerposition[0]][spielerposition[1] - 1] = 'P';
                    energy--;

                }
            }
            if (zufall == 2 && spielerposition[1] < spielfeld[0].length-1) {

                if (spielfeld[spielerposition[0]][spielerposition[1] + 1] != 'A') {
                    spielfeld[spielerposition[0]][spielerposition[1]] = '4';
                    spielfeld[spielerposition[0]][spielerposition[1] + 1] = 'P';
                    energy--;
                }
            }
            if (zufall == 3 && spielerposition[0] > 0) {

                if (spielfeld[spielerposition[0] - 1][spielerposition[1]] != 'A') {
                    spielfeld[spielerposition[0]][spielerposition[1]] = '4';
                    spielfeld[spielerposition[0] - 1][spielerposition[1]] = 'P';
                    energy--;
                }
            }
            if (zufall == 4 && spielerposition[0] < spielfeld.length-1) {

                if (spielfeld[spielerposition[0] + 1][spielerposition[1]] != 'A') {
                    spielfeld[spielerposition[0]][spielerposition[1]] = '4';
                    spielfeld[spielerposition[0] + 1][spielerposition[1]] = 'P';
                    energy--;
                }
            }


            spielerposition = findeSpieler();

            if (spielerposition[0] > 0) {
                if (spielfeld[spielerposition[0]-1][spielerposition[1]] == '6') {
                    System.out.println("Sie haben Wasser gefunden!");
                    break;
                }
            }


            if (spielerposition[0] < spielfeld.length - 1) {
                if (spielfeld[spielerposition[0]+1][spielerposition[1]] == '6') {
                    System.out.println("Sie haben Wasser gefunden!");
                    break;
                }
            }


            if (spielerposition[1] > 0) {
                if (spielfeld[spielerposition[0]][spielerposition[1]-1] == '6') {
                    System.out.println("Sie haben Wasser gefunden!");
                    break;
                }
            }

            if (spielerposition[1] < spielfeld[0].length - 1) {
                if (spielfeld[spielerposition[0]][spielerposition[1]+1] == '6') {
                    System.out.println("Sie haben Wasser gefunden!");
                    break;
                }
            }


            if (energy <= 0) {
                System.out.println("Sie sind verdurstet!");
                break;
            }
        }
    }




    public static void main(String[] args) {
        sv = new SchischVisualizer();
        initialisiereSpielfeld(60,60);
        zufallsPositionSpieler();
        sv.step(spielfeld);
        wasserZufall(0.03);
        sv.step(spielfeld);
        steinZufall(0.15);
        sv.step(spielfeld);
        findeWasser(50);
        sv.step(spielfeld);
        sv.start();
    }
}
