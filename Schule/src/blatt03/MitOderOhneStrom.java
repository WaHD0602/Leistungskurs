package blatt03;

import java.util.Scanner;

public class MitOderOhneStrom {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welches Gatter möchten Sie benutzen? Sie können AND, NOT, OR, XOR alle benutzen nach dem auswählen wird es noch einmal erklärt");
        String gatter = input.nextLine();
        //Lässt den Nutzer ein Gatter auswählen

        if (gatter.equals("AND")) {
            System.out.println("Das AND-Gatter: \nDas Gatter verfügt über 2 Eingänge oder einen Ausgang.");
            //erklärt grob das AND-Gatter
            System.out.println("Befindet sich auf Eingang 1 Strom? Antworten Sie bitte mit true oder false.");
            boolean eingang1 = input.nextBoolean();
            //Fragt ob der erste Eingang true oder false ist
            System.out.println("Befindet sich auf Eingang 2 Strom? Antworten Sie bitte mit true oder false.");
            boolean eingang2 = input.nextBoolean();
            //Fragt ob der zweite Eingang true oder false ist

            if (eingang1 && eingang2 == true) {
                System.out.println("Der Strom ist an");
                System.exit(0);
                //Überprüft ob beide Eingänge true sind und gibt dann aus, dass der Strom an ist
            } else System.out.println("Sie brauchen auf jedem Eingang Strom.");
            System.out.println("Der Strom ist aus.");
            //Falls dem nicht so ist wird der Strom als aus angegeben
        }

        if (gatter.equals("NOT")) {
            System.out.println("Das Not-Gatter: \nDas Gatter verfügt über einen Eingang und einen Ausgang.");
            //Erklärt grob das NOT-Gatter
            System.out.println("Befindet sich auf dem Eingang Strom? Antworten Sie bitte mit true oder false.");
            boolean eingang = input.nextBoolean();
            //Fragt ob der Eingang true oder false ist

            if (eingang == false) {
                System.out.println("Der Strom ist an.");
                System.exit(0);
                //Falls der Eingang false ist wird ausgegeben, dass der Strom an ist

            } else System.out.println("Der Strom ist aus.");
        }   //Falls der Eingang nicht false ist wird ausgegeben, dass der Strom aus ist

        if (gatter.equals("OR")) {
            System.out.println("Das OR-Gatter: \nDas Gatter verfügt über zwei Eingänge und einen Ausgang.");
            System.out.println("Befindet sich auf Eingang 1 Strom? Antworten Sie bitte mit true oder false");
            boolean eingang1 = input.nextBoolean();
            System.out.println("Befindet sich auf Eingang 2 Strom? Antworten Sie bitte mit true oder false");
            boolean eingang2 = input.nextBoolean();
            // zuerst wird abgefragt ob OR ausgewählt wurde. Der schlüssel dafür ist das er richtig und groß geschrieben wird. danach wie immer einigermaßen erklärt und abgefragt worauf denn strom ist

            if (eingang1 || eingang2 == true) {
                System.out.println("Der Strom ist an.");
                System.exit(0);
            } else System.out.println("Es befindet sich auf keinem Eingang Strom");
        }   // wenn eines von beiden nur erfüllt ist hat es strom da bei OR nur eines von beiden benötigt wird. wenn keines erfüllt es sagt er das es nicht geht und wo das problem liegt

        if (gatter.equals("XOR")) {
            System.out.println("Das XOR-Gatter: \nDas Gatter verfügt über zwei Eingänge und einen Ausgang.");
            System.out.println("Befindet sich auf Eingang 1 Strom? Antworten Sie bitte mit true oder false");
            boolean eingang1 = input.nextBoolean();
            System.out.println("Befindet sich auf Eingang 2 Strom? Antworten Sie bitte mit true oder false");
            boolean eingang2 = input.nextBoolean();
            //zuerst wird die art von XOR grob erklärt fehler fälle erst danach. es wird abgefragt worauf strom liegt und auch wie man antowrten soll, so dass der boolean erfüllt werden kann mit hilfe des Scanners

            if (eingang1 && eingang2 == true) {
                System.out.println("Sie dürfen nur auf einem Eingang Strom haben.");
                System.out.println("Der Strom ist aus.");
            } else
                System.out.println("Der Strom ist an.");
            System.exit(0);
            //der anfang dient dazu das nur eines von beiden erfüllt sein darf also nur eingang strom haben darf. danach erklärt er das strom aus ist und warum. der andere fall aber wird erfüllt wenn nur einer strom hat und so ist er bei XOR eingeschaltet
        }

    }
}
