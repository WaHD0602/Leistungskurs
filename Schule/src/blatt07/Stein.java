package blatt07;

public class Stein {

    public static int steinGGT(int a,int b) {
        int count = 0;
        while(a != 0 || b != 0) {
            if (a % 2 == 0 && b % 2 == 0) {
                a /= 2;
                b /= 2;
                count++;
            } else if (a % 2 == 0) {
                a /= 2;
            } else if (b % 2 == 0) {
                b /= 2;
            } else {
                if (a <= b) {
                    b = (b - a) /2;
                } else a = (a - b) /2;
            }
        }
        if (a > b) {
            return a;
        }

    }

    public static void main(String[] args) {
         int a = 55;
         int b = 22;
    }
}
