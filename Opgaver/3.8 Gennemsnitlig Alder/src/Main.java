/*
Undersøg hvordan følgende stykke kode fungerer ved at modificere indholdet af strengen i den sidste linje:
 */
public class Main {
    public static void main(String[] args) {
        int i = 42;
        long l = 56;
        float f = (float) 3.14159;
        double d = 3.14159*10;

        System.out.printf("i=%d 1=%,4d f=%f d=%6.2f", i, l, f, d);
    }
}
