/*
Skriv et program, hvori
1. En temperatur angives i Celcius via en variabel.
2. Denne temperatur konverteres til Fahrenheit og gemmes i en anden variabel.
3. Konverteringen udskrives på en passende måde.
 */
public class Main {
    public static void main(String[] args) {
        int C;
        int F;

        C = 25;
        F = 32+(9/5)*C;

        System.out.println(C + " grader Celcius er " + F + " grader Fahrenheit.");
    }
}
