/*

Skriv et program, der givet 7 dagstemperaturer udregner og udskriver temperaturdifferencen mellem alle
to på hinanden følgende dage (dvs. Tirsdag-Mandag, Onsdag-Tirsdag . . . Søndag-Lørdag).
 */
public class Main {
    public static void main(String[] args) {
        double mon = 21.5;
        double tue = 23.7;
        double wed = 19.6;
        double thu = 22.5;
        double fri = 25.3;
        double sat = 21.7;
        double sun = 18.9;

        double diff1 = mon - tue;
        double diff2 = tue - wed;
        double diff3 = wed - thu;
        double diff4 = thu - fri;
        double diff5 = fri - sat;
        double diff6 = sat - sun;
        double diff7 = sun - mon;

        System.out.println("The difference is " + Math.abs(diff1));
        System.out.println("The difference is " + Math.abs(diff2));
        System.out.println("The difference is " + Math.abs(diff3));
        System.out.println("The difference is " + Math.abs(diff4));
        System.out.println("The difference is " + Math.abs(diff5));
        System.out.println("The difference is " + Math.abs(diff6));
        System.out.println("The difference is " + Math.abs(diff7));
    }
}
