/*
Skriv et program hvori
1. Et antal sekunder siden et bestemt tidspunkt (fx 1. Januar 1970) gemmes i en variabel.
2. Konvertér dette tal til et helt antal år (lad os antage at der er 365 dage på et år) og et antal hele dage indenfor
det sidste år. Lægges disse to tal sammen skal resultatet altså være indenfor 24 timer af udgangspunktet.
3. Udskriv disse to tal.
Verificér at programmet virker.
 */
public class Main {
    public static void main(String[] args) {
        //Sekunder siden 1. januar 1970 - 1. januar 2000
        int sec = 30*365*24*60*60;

        System.out.println("Seconds from 1. january 1970 to 1. january 2000: " + sec + "Sec");
    }
}
