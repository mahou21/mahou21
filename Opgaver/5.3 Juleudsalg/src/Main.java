/*
Skriv et program, hvori
1. En variabel oprettes (deklareres) og initialiseres til værdien 21816000.
Dette tal repræsenterer et antal sekunder siden nytår (alle måneder an- tages at være 30 dage lange).
2. En anden variabel indeholder en pris på 599,95 dkr.
3. Der skal gives et 30% tilskud hvis det er Jul. Find selv på en fornuftig definition af hvornår det er Jul.
4. Udregn den gældende pris (eventuelt tilskud medregnet) og gem denne i en variabel.
5. Udskriv denne variabel.
6. Sørg for at teste den logik I har skrevet ved at prøve at tildele den første variable forskellige andre værdier.
Hvilke værdier vil være fornuftige at teste?
 */
public class Main {
    public static void main(String[] args) {
        int time = 21816000;
        double price = 599.95;
        int days = time/60/60/24;
        //int months = (days/30);
        int months = 11;

        if (months == 11){
            price = price * 0.7;
            System.out.println(price);
        } else {
            System.out.println(price);
        }

        System.out.println(days);
        System.out.println(months);
    }
}
