import java.util.Scanner;

public class BMIBeregner {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Her kan du få beregnet dit BMI. Brug komma som decimaltegn.\nIndtast meters højde:");
        double mHeight = input.nextDouble();
        System.out.println("Indtast kg kropsvægt:");
        double kgWeight = input.nextDouble();
        double bmi = kgWeight / Math.pow(mHeight, 2);
        System.out.println("Dit BMI er beregnet til " + bmi + " kg/kvm.");
        // opgave 2 begynder her
        String str;
        if (bmi < 18.5) {
            str = "under";
        } else if (bmi < 25) {
            str = "normal";
        } else if (bmi < 30) {
            str = "over";
        } else {
            str = "svært over";
        }
        System.out.println("Du er " + str + "vægtig.");
    }
}