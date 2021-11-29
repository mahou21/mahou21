/*
Skriv et program der udregner og udskriver arealet (π · r2)
af tre cirkler med radius på hhv. 1, 3 og 5.
 */
public class Main {
    public static void main(String[] args) {
        double[] r = {1,3,5};
        double pi = 3.14;

        for (double i : r){
            System.out.print("Arealet = ");
            System.out.println(pi*i*i);
        }
    }
}
