package blatt08;

public class Palindrom {

    public static String umdrehen(String text) {
        String neu = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            neu += text.charAt(i);
        }
        return neu;
    }

    public static Boolean istPalindrom(String text) {
       String umgedreht = umdrehen(text);
       if (umgedreht.equals(text)) {
           return true;
       }
       else return false;
    }

    public static void main (String[] args) {
        System.out.println(istPalindrom("Girafarig"));
    }
}
