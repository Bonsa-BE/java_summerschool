import java.util.Scanner;

/**
 * Ewout : ExamenPunten
 *
 * @author : Toon Van Havermaet
 * @version : 22/05/2022
 */
public class ExamenPunten {
    public static void main(String[] args) {
        int som = 0;
        int getal;
        boolean geslaagd = false;
        for (int i = 0; i < 3; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("geef score");
            getal = input.nextInt(); // geen rekening gehouden met exceptionhandling: een String of een Char zal hier een error geven
            geslaagd = true;
            som += getal;
            if (getal < 4) {
                geslaagd = false;
                break; //onder 4 moet het programma sowieso stoppen, dit filtert ook negatieve getallen
            }else if (getal > 10) { // else if, want staat lager in orde dan "kleiner dan 4 zijn" en moet pas na dat statement gecheckt worden
                System.out.println("geef een nieuwe score, want een score kan niet > 10");
                Scanner tweedeinput = new Scanner(System.in);
                getal = tweedeinput.nextInt();
            }

        }
        if (som > 15 && geslaagd) {
            System.out.println("geslaagd met een score van " + som + "/30");
        } else {
            System.out.println("niet geslaagd");
        }
    }
}
