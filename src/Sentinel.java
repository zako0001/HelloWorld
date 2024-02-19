import java.util.Scanner;

public class Sentinel {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        final int SENTINEL = 0; // Nul er valgt, da nul ikke giver mening at summere alligevel.
        int sum = 0; // En sum starter givet vis på nul. Skal initieres før while-loop pga. linje 12.
        System.out.println("Indtast 0 for at afslutte.\nIndtast heltal, der skal summeres:");
        int number = input.nextInt();
        while (number != SENTINEL) {
            sum += number;
            System.out.println("Summen er foreløbigt " + sum + ".\nIndtast heltal, der skal summeres:");
            number = input.nextInt();
        }
    }
}