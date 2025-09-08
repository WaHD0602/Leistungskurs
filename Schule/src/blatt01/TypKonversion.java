package blatt01;

public class TypKonversion {
    public static void main(String[] args) {

        int a = 14;
        double b = -21.25;

        int c = (int) b;            //die c variable ist der wert der b variable aber als integer ohne kommazahlen (baba)
        double d = (double) a;      //wie oben wurden einfach kommas hinzugefügt

        System.out.println(c);
        System.out.println(d);

        char e = 'a';
        int f = 65;

        int g = (int) e;            //Char e wird zu einem integer. Aus a wird 97
        char h = (char) f;          //Integer f wird zu einem Char Aus 65 wird A

        System.out.println(g);
        System.out.println(h);


    }
}

//Aufgabe 8 c) Sind beides Zahlenangaben, double kann auch kommazahlen enthalten
//Aufgabe 8 d) der zusammenhang besteht darin das char auch als ein integer gesehen werden kann. beispiel klein a hat den wert von 97 so ist es einfach anders dargestellt
//Aufgabe 8 e) Die Typen boolean udn char sind nicht kompatibel und können deswegen nicht konvertiert werden