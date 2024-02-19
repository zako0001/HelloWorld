import java.util.Scanner;

public class Portoberegner {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Her kan du få beregnet prisen på forsendelse af dit brev. Brug komma som decimaltegn.\nIndtast brevets vægt i gram:");
        double weight = input.nextDouble();

        // Først tjekker vi, om prisen kan beregnes.
        if (weight <= 0 || weight > 2000) {
            // Her kan prisen ikke beregnes.
            System.out.println("Et brev med denne vægt kan vi ikke sende.");
        }  else {
            // Her kan prisen godt beregnes. Vi laver en chain, for at finde prisen.
            int pris;
            if (weight <= 100) {
                pris = 25;
            } else if (weight <= 250) {
                pris = 50;
            } else {
                pris = 75;
            }
            System.out.println("Det koster " + pris + " kr. at sende dit brev.");
        }
    }
}