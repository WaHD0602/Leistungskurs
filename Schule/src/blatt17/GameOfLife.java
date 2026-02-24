package blatt17;
import blatt14.MultiArrays;
import blatt14.Simulationen;
import schisch_visualizer.*;
public class GameOfLife {

    public static char[][] spielfeld;

    public static int zaehlenAcht(char[][] spielfeld, int x, int y, char such) {
        int c = 0;

        if (x > 0) {
            if (spielfeld[x-1][y]  == such) {
                c++;
            }
            if (y > 0) {
                if (spielfeld[x-1][y-1]  == such) {
                    c++;
                }
            }
            if (y < spielfeld[x].length-1) {
                if (spielfeld[x-1][y+1]  == such) {
                    c++;
                }
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

            if (y > 0) {
                if (spielfeld[x+1][y-1]  == such) {
                    c++;
                }
            }
            if (y < spielfeld[x].length-1) {
                if (spielfeld[x+1][y+1]  == such) {
                    c++;
                }
            }
        }
        if (y < spielfeld[x].length-1) {
            if (spielfeld[x][y+1] == such) {
                c++;
            }
        }

        return c;
    }

    public static void initRandom(double ws) {
        spielfeld = MultiArrays.createEmpty2DCharArrayNew(100,100);
        Simulationen.fuellen(spielfeld,'9',ws);

    }

    public static void initOszillierend(int i) {
        spielfeld = MultiArrays.createEmpty2DCharArrayNew(100,100);
        int x = spielfeld.length/2;
        int y = spielfeld[x].length/2;
        if (i == 1) {
            spielfeld[x][y] = '9';
            spielfeld[x-1][y] = '9';
            spielfeld[x+1][y] = '9';
        } else if (i == 2) {
            spielfeld[x][y] = '9';
            spielfeld[x-1][y+1] = '9';
            spielfeld[x-2][y+1] = '9';
            spielfeld[x][y+2] = '9';
            spielfeld[x+1][y+2] = '9';
            spielfeld[x-1][y+3] = '9';
        } else if (i == 3) {
            spielfeld[x][y] = '9';
            spielfeld[x][y+1] = '9';
            spielfeld[x][y+2] = '9';
            spielfeld[x+1][y+1] = '9';
            spielfeld[x+1][y+2] = '9';
            spielfeld[x+1][y+3] = '9';
        } else if (i == 4) {
            spielfeld[x][y] = '9';
            spielfeld[x+1][y] = '9';
            spielfeld[x][y+1] = '9';
            spielfeld[x+3][y+2] = '9';
            spielfeld[x+3][y+3] = '9';
            spielfeld[x+2][y+3] = '9';
        } else if (i == 5) {
            spielfeld[x][y] = '9';
            spielfeld[x+1][y] = '9';
            spielfeld[x][y+1] = '9';
            spielfeld[x+1][y+2] = '9';
            spielfeld[x+3][y+2] = '9';
            spielfeld[x+4][y+3] = '9';
            spielfeld[x+4][y+4] = '9';
            spielfeld[x+3][y+4] = '9';
        } else if (i == 6) {
            spielfeld[x][y] = '9';
            spielfeld[x+1][y] = '9';
            spielfeld[x+2][y] = '9';
            spielfeld[x+1][y-1] = '9';
            spielfeld[x+2][y-2] = '9';
            spielfeld[x+1][y+1] = '9';
            spielfeld[x+2][y+2] = '9';
            spielfeld[x+2][y+1] = '9';
            spielfeld[x+2][y-1] = '9';

            spielfeld[x+9][y] = '9';
            spielfeld[x+9][y+1] = '9';
            spielfeld[x+9][y+2] = '9';
            spielfeld[x+9][y-1] = '9';
            spielfeld[x+9][y-2] = '9';
            spielfeld[x+10][y] = '9';
            spielfeld[x+10][y-1] = '9';
            spielfeld[x+10][y+1] = '9';
            spielfeld[x+11][y] = '9';


        } else if (i == 7) {
            spielfeld[x][y] = '9';
            spielfeld[x][y-1] = '9';
            spielfeld[x+1][y-2] = '9';
            spielfeld[x+2][y-1] = '9';
            spielfeld[x+3][y] = '9';
            spielfeld[x+2][y+1] = '9';
            spielfeld[x+2][y+2] = '9';
            spielfeld[x+3][y+2] = '9';
            spielfeld[x+5][y] = '9';
            spielfeld[x+6][y-1] = '9';
            spielfeld[x+7][y-2] = '9';
            spielfeld[x+8][y-1] = '9';
            spielfeld[x+8][y] = '9';
            spielfeld[x+6][y+1] = '9';
            spielfeld[x+6][y+2] = '9';
            spielfeld[x+5][y+2] = '9';
        } else if (i == 8) {
            spielfeld[x][y] = '9';
            spielfeld[x-1][y+1] = '9';
            spielfeld[x+1][y+1] = '9';
            spielfeld[x+2][y+1] = '9';
            spielfeld[x+3][y] = '9';
            spielfeld[x+4][y+1] = '9';
            spielfeld[x][y+2] = '9';
            spielfeld[x][y+3] = '9';
            spielfeld[x-1][y+4] = '9';
            spielfeld[x+1][y+4] = '9';
            spielfeld[x][y+5] = '9';
            spielfeld[x+2][y+4] = '9';
            spielfeld[x+4][y+4] = '9';
            spielfeld[x+3][y+5] = '9';
            spielfeld[x+3][y+2] = '9';
            spielfeld[x+3][y+3] = '9';
        }
    }

    //to do muss noch initRaumschiff und initChaos

    public static void weiter() {
        char[][] spielfeldNeu = MultiArrays.copy2DCharArray(spielfeld);
        for (int x = 0; x < spielfeld.length; x++) {
            for (int y = 0; y < spielfeld[x].length; y++) {
                int zaehleLebend = zaehlenAcht(spielfeld,x,y,'9');


                if (zaehleLebend == 3 && spielfeld[x][y] == '0') { //Regel 1

                    spielfeldNeu[x][y] = '9';
                } else if (spielfeld[x][y] == '9' && zaehleLebend < 2) { //Regel 2

                    spielfeldNeu[x][y] = '0';
                } else if (spielfeld[x][y] == '9' && zaehleLebend == 3) { //Regel 3


                } else if (spielfeld[x][y] == '9' && zaehleLebend > 3) { //Regel 4

                    spielfeldNeu[x][y] = '0';
                }
            }
        }

        spielfeld = spielfeldNeu;
    }



    public static void main(String[] args) {
        SchischVisualizer sv = new SchischVisualizer();
        //initRandom(0.2);
        initOszillierend(8);
        sv.step(spielfeld);

        for (int i = 0; i < 500; i++) {
            weiter();
            sv.step(spielfeld);

        }
        sv.start();

    }
}
