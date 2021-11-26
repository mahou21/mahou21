/*
Skriv et program, hvori
1. Værdien af et terningeslag er gemt i en variabel ved navn dice.
• Hvilken type giver det mening at erklære variablen som?
• Vælg selv en specifik værdi.
2. Opret en boolsk variabel og tildel den en værdi der repræsenterer hvorvidt
værdien fra variablen dice er lige og større end 3.
3. Udskriv den værdien af denne boolske variabel.
 */
public class Main {
    public static void main(String[] args) {
        int dice = 4;
        boolean test;

        if (dice >= 3){
            test = true;
            System.out.println("3 or above");
        } else {
            test = false;
            System.out.println("Under 3");
        }
        System.out.println(test);
    }
}
