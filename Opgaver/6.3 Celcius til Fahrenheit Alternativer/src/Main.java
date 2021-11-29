public class Main {
    public static void main(String[] args) {
        double[] C = {-5, -4.5, -4};
        double F;

        for (double i : C){
            System.out.print(" Celcius = " + i + " ");
            F = 32 + (9/5)*i;
            System.out.print("Fahrenheit = " + F);
            System.out.println("");
        }
    }
}
