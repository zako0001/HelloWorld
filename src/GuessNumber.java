import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int numberToGuess = rand.nextInt(10) + 1;
        int usersGuess;
        int numberOfGuesses = 0;

        System.out.println("Her skal du gætte et heltal, som er mindst 1 og højst 10.\nIndtast gæt:");

        while (true) {

            numberOfGuesses++;
            usersGuess = input.nextInt();

            if (usersGuess < numberToGuess) {
                System.out.println("Gæt højere:");
            }
            else if (usersGuess > numberToGuess) {
                System.out.println("Gæt lavere:");
            }
            else {
                break;
            }
        }

        System.out.println("Du gættede rigtigt " + numberOfGuesses + ". gang.");
    }
}