/**
 * Ewout : Punt
 *
 * @author : Toon Van Havermaet
 * @version : 22/05/2022
 */
/*dit heeft redelijk lang geduurd om opgelost te krijgen. Uiteindelijk probleem was dat de velden x en y eerst als private gedeclareerd stonden.
    Uiteraard geraakt de methode GetAfstandTussen dan nooit aan de coordinaten van puntA en puntB
 */
public class Punt {
    private double x = 0.0; //voor de leesbaarheid worden de waarden geïnitialiseerd met een .0 achter, maar is niet verplicht
    private double y = 0.0; // zelfs een waarde toekennen hoeft hier niet, ze worden enkels als veld aangemaakt, dit is puur voor leesbaarheid


    public Punt(int xCo, int yCo) {
        this.x = xCo;
        this.y = yCo;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static double GetAfstandTussen(Punt puntA, Punt puntB) {
        return Math.sqrt(Math.pow(puntA.getX() - puntB.getX(), 2) + (Math.pow(puntA.getY() - puntB.getY(), 2)));
    }
    public static void main(String[] args) {
        Punt puntA = new Punt(7, 2);
        Punt puntB = new Punt(4, 6);
        System.out.println(GetAfstandTussen(puntA, puntB));
    }
}

//ter referentie: code die ik onlangs moeten maken heb
/*
package logica;

import java.util.Objects;

/**
 * overerving-figuren : Punt
 *
 * @author : Toon Van Havermaet
 * @version : 11/05/2022
 *

public class Punt {
    private int x = 0;
    private int y = 0;

    public Punt(int xCo, int yCo){
        this.x = xCo;
        this.y = yCo;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public double berekenAfstand(Punt punt){
        return Math.sqrt(Math.pow(x - punt.x, 2) + (Math.pow(y - punt.y,2)));
    }

    @Override
    public String toString() {
        return "Punt{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Punt)) return false;
        Punt punt = (Punt) o;
        return x == punt.x && y == punt.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
 */