import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Taschenrechner {
    public static void main (String[] args ){
        int zahl1;
        int zahl2;
        int ergebnis;

        Scanner eingabe = new Scanner(System.in);

        for(int i=1; i<10; i++) {

            System.out.print("Erste Zahl eingeben: ");
            zahl1 = eingabe.nextInt();

            System.out.print("Zweite Zahl eingeben: ");
            zahl2 = eingabe.nextInt();

            /*Summieren*/
            ergebnis = zahl1 + zahl2;
            System.out.println("Ergebnis 1 = " + ergebnis);

            /*Subtrahieren*/
            ergebnis = zahl1 - zahl2;
            System.out.println("Ergebnis 2 = " + ergebnis);

            /*Mal*/
            ergebnis = zahl1 * zahl2;
            System.out.println("Ergebnis 3 = " + ergebnis);

            /*Dividieren*/
            ergebnis = zahl1 / zahl2;
            System.out.println("Ergebnis 4 = " + ergebnis);
        }

    }
}
