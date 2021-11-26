/*
Skriv et program, hvori
• Der udskrives en tabel af matchende Celcius og Fahrenheit værdier.
– Formel: Tf = 32 + 9/5Tc
• Der skal være ét sæt matchende værdier per linje. • Listen skal starte med -5◦C og slutte ved 40◦C.
• Listen skal have én linje for hver 0,5◦C.
 */
public class Main {
    public static void main(String[] args) {
        double C = -5;
        double F;

        for (int i = 0; C<45.5; i++){
            System.out.print(C + " Degrees Celcius converts to ");
            F = 32 + (9/5)*C;
            C = C+0.5;
            System.out.print(F + " Fahrenheit");
            System.out.println("");
        }
    }
}
