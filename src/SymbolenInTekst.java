import java.util.Arrays;
import java.util.Scanner;

/**
 * Ewout : SymbolenInTekst
 *
 * @author : Toon Van Havermaet
 * @version : 23/05/2022
 */
//strategie : dubbele Array waarbij een rij elk uniek karakter bijhoudt en een bijhorende teller

public class SymbolenInTekst {
    public static void main(String[] args) {
        System.out.println("geef tekst in : ");
        Scanner input = new Scanner(System.in);
        String tekst = input.nextLine();
        int row = tekst.length(); // maximale lengte is de lengte van de volledige tekst
        int lengte = 0;
        char[] overzicht = new char[tekst.length()];
        int[] teller = new int[tekst.length()];
        for (int i = 0; i < tekst.length(); i++) { //deze loop filtert de tekst op unieke karakters en telt ze ook als ze meermaals voorkomen
            if (! Arrays.asList(overzicht).contains(tekst.charAt(i))) { // dit heb ik moeten googlen
                overzicht[lengte] = tekst.charAt(i); // character en teller zitten op dezelfde rij, maar de teller zit 1 kolom naar rechts
                teller[lengte] = 1;
                lengte++;
            } else { //het char zit wel al in de array
                teller[Arrays.asList(teller).indexOf(tekst.charAt(i))] += 1; //dit ook moeten googlen
            }
        }
        for (int i = 0; i < overzicht.length; i++) {
         System.out.println("karakter " + overzicht[i] + " komt " + teller[i] + " keer voor");
        }
    }
}
//op een of andere manier kent het programma elk karakter toe aan de array, ook al scan ik of het karakter al in de array zit