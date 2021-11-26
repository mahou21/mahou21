/*
Undervisningskalenderen fortæller os at der (blandt andet) er følgende ferier:
• Efterårsferie Oktober
• Juleferie December
• Påskeferie April
• Sommerferie Juli + August
Skriv et program, hvori
1. Et månedsnummer gives via en variabel.
2. Afhængigt af indholdet af denne variabel udskrives en feries navn (hvis der er ferie i måneden)
eller “Hårdt arbejde” (hvis der ikke er)
 */
public class Main {
    public static void main(String[] args) {
        int month = 7;

        if (month == 4){
            System.out.println("Påskeferie");
        } else if (month == 7){
            System.out.println("Sommerferie");
        }  else if (month == 8){
            System.out.println("Sommerferie");
        }   else if (month == 10){
            System.out.println("Efterårsferie");
        } else if (month == 12){
            System.out.println("Juleferie");
        } else {
            System.out.println("Hårdt arbejde!");
        }




        //4, 7 & 8, 10, 12
    }
}
