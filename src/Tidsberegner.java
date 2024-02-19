import java.util.Scanner;

public class Tidsberegner {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hvor lang tid er der gået siden midnat i timer, minutter og sekunder?\nIndtast timer:");
        int timer = input.nextInt();
        System.out.println("Indtast minutter:");
        int minutter = input.nextInt();
        System.out.println("Indtast sekunder:");
        int sekunder = input.nextInt();
        int samledeSekunder = (timer * 60 + minutter) * 60 + sekunder;
        System.out.println("Der er gået " + samledeSekunder + " sekunder siden midnat.");
    }
}