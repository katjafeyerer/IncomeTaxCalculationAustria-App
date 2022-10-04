/* Beginn von Kommentar

 Ende von Kommentar*/

import java.util.Scanner;

public class ClassnameApp {

    //psvm
    public static void main(String[] args) {

        System.out.println("Jahresteuerberechnung Pro 7.0");
        System.out.println("Bitte monatliches Gehalt eingeben: ");

        // um Variable zu definieren, name und variable erstellen
        //sinnvoller default Wert 0, weil im schlimmsten Fall 0 überweisen (was ist ein Wert, der nicht weh tut)
        /* ganzzahltypen    byte (-128 bis +127; 1 byte), x int (4 byte, knapp 2 Milliarden drin), long (doppelt so groß wie int; 8 byte)
        gleichkommytypen    float, double (doppelt so genau wie float)
        zeichen             char: 'X'; String: "X" (String = Referenzdatentyp);
         */
        double monthlyIncome = 0;

        Scanner scanner = new Scanner(System.in);
        monthlyIncome = scanner.nextDouble();

        double yearlyIncome = monthlyIncome * 14; //+, -, *, / und % (%: Rest von Ganzzahldivision)

        //soutv
        System.out.println("yearlyIncome = " + yearlyIncome);
        //=
        System.out.println("Das Jahresgehalt lautet: " + yearlyIncome);

        //double sv = yearlyIncome *0.1812;
        //yearlyIncome = yearlyIncome -sv;

        yearlyIncome = yearlyIncome * (1 - 0.1812);
        System.out.println("Das Jahresgehalt abzüglich SV lautet: " + yearlyIncome);

        double tax = 0; //6500

        if (yearlyIncome < 11000) {
            tax = 0;
        }
        if (yearlyIncome >= 11000 && yearlyIncome < 18000) ;
        {
            //15.000 --> 15.000 -11.000 = 4.000 * 20 (0.2) versteuert
            tax = (yearlyIncome - 11000) * 0.2;
        }
        if (yearlyIncome >= 18000 && yearlyIncome < 31000) ;
        {
            //20000 --> 20000-18000 = 2000 *32,5% (0.325) = 650
            tax = (((18000-11000)*0.2)
                    + (yearlyIncome -18000)*0.325);

        }
        if (yearlyIncome >= 31000 && yearlyIncome < 60000) ;
        {
            //die Zeile bei Java hört da auf, wo der Strichpunkt am Ende ist --> solange ist es eine Zeile
            tax = (18000 - 11000) * 0.2
                    + (31000 - 18000) * 0.325
                    + (yearlyIncome - 31000) * 0.42;
        }
        System.out.println("Jährliche Steuer: " + tax);
    }
}
