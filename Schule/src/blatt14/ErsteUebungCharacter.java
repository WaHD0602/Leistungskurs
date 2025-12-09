package blatt14;


import schisch_visualizer.SchischVisualizer;

public class ErsteUebungCharacter {


    public static void main(String[] args) {
        SchischVisualizer sv = new SchischVisualizer();
        char[][] charr = blatt14.MultiArrays.createEmpty2DCharArray(11,14);
        for ( int i = 0; i < 14; i++ ) {
                charr[0][i] = '1';
                charr[10][i] = '1';
            }

        for ( int i = 0; i < 11; i++ ) {
            charr[i][0] = '1';
            charr[i][13] = '1';
        }

        for ( int i = 0; i < 12; i++ ) {
            charr[2][i] = '1';
            charr[8][i] = '1';
        }

        for (int i = 3; i <= 7; i++ ) {
            charr[i][11] = '1';
            charr[5][11] = '0';
        }

        charr[5][12] = 'p';

        charr[4][3] = '1';
        charr[5][3] = '1';
        charr[6][3] = '1';

        charr[4][5] = '1';
        charr[5][5] = '1';
        charr[6][5] = '1';

        sv.step(charr);
        sv.start();
    }
}
