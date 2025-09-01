package blatt02;
import java.util.Scanner;
public class Talking {
    public static void main(String[] args) {
        Scanner baba = new Scanner(System.in);
        System.out.println("Guten Tag, wie heißen Sie?");
        String name =  baba.nextLine();
        System.out.println("Hallo " + name + "!");
    }
}
