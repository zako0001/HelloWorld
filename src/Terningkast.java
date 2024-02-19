import java.util.Random;

public class Terningkast {
    public static void main (String[] args) {

        Random rand = new Random();
        int first;
        int second;
        int sum = 0;

        while (sum != 7) {
            first = rand.nextInt(1,7);
            second = rand.nextInt(1,7);
            sum = first + second;
            System.out.println(first + " + " + second + " = " + sum);
        }
    }
}