/*

 */
public class Main {
    public static void main(String[] args) {
        double C = 40;
        double F;

        for (int i = 0; C>-5.5; i++){
            System.out.print(C + " Degrees Celcius converts to ");
            F = 32 + (9/5)*C;
            C = C-0.5;
            System.out.print(F + " Fahrenheit");
            System.out.println("");
        }
    }
}