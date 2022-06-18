import java.util.Scanner;

/**
 * Ewout : Achterstevoren
 *
 * @author : Toon Van Havermaet
 * @version : 22/05/2022
 */

public class Achterstevoren {
    public static void main(String[] args) {
        StringBuilder achterstevoren = new StringBuilder();
        Scanner input = new Scanner(System.in);
        System.out.println("Geef een tekst : ");
        String text = input.nextLine();
        for (int i = text.length(); i - 1 >= 0; i--) {
            achterstevoren.append(text.charAt(i - 1)); // .append() is hetzelfde voor Strings als "+=" voor getallen
        }
        System.out.println(achterstevoren);
    }
}
