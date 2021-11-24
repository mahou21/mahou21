/*
Når vi godt vil konvertere mellem int værdier og long værdier skal der udføres et cast.
Men, hvornår er det at dette cast skal gøres eksplicit, og hvornår må det være implicit?

1. Hvorved adskilder int og long sig?
2. Prøv at skrive et program der (i) erklærer i som en int variabel,
(ii)tildeler den en værdi, (iii) erklærer l som en long variabel,
(iv) tildeler værdien af i til l, og (v) slutteligt tildeler værdien af l til i.
 */
public class Main {
    public static void main(String[] args) {
        int i;
        long l;

        i=128;
        l=i;
        i= (int) l;

        System.out.println(l);
        System.out.println(i);
    }
}
