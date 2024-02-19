import java.util.Scanner;

public class Tommeberegner {
    public static void main (String[] args) {
        final double CENTIMETER_PER_TOMME = 2.54;
        Scanner input = new Scanner(System.in);
        System.out.println("Her kan du omregne tommer til centimenter. Brug komma som decimaltegn.\nIndtast antal tommer:");
        double tommer = input.nextDouble();
        double centimeter = tommer * CENTIMETER_PER_TOMME;
        System.out.println(tommer + " tommer er " + centimeter + " centimeter.");
    }
}