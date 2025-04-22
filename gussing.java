import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int numberToGuess = r.nextInt(10); // increase difficulties here
        int guess;
        int lives = 3;
        Scanner scnr = new Scanner(System.in);

        System.out.println("Guess a number between 0 and 10!");

        while (lives > 0) {
            System.out.print("Guess (" + lives + " lives remaining): ");
            guess = scnr.nextInt();

            if (guess > numberToGuess) {
                System.out.println("Too high!");
                lives--;
            } else if (guess < numberToGuess) {
                System.out.println("Too low!");
                lives--;
            } else {
                System.out.println("Congratulations, you won!");
                break;
            }
        }

        if (lives == 0) {
            System.out.println("Game over! The number was " + numberToGuess);
        }

        scnr.close();
    }
}
