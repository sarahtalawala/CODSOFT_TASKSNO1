
import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int score = 0;
        String playAgain = "yes";

        System.out.println("================================");
        System.out.println("       WELCOME TO NUMBER GAME");
        System.out.println("================================");

        while (playAgain.equalsIgnoreCase("yes")) {

            int number = random.nextInt(100) + 1;
            int attempts = 7;
            boolean guessed = false;

            System.out.println("\nI have selected a number between 1 and 100.");
            System.out.println("You have 7 attempts to guess it!");

            while (attempts > 0) {

                System.out.print("\nEnter your guess: ");
                int guess = sc.nextInt();

                attempts--;

                if (guess == number) {
                    System.out.println("Correct! You guessed the number!");
                    guessed = true;
                    score++;
                    break;
                }
                else if (guess < number) {
                    System.out.println("Too Low! Try again.");
                }
                else {
                    System.out.println("Too High! Try again.");
                }

                System.out.println("Attempts left: " + attempts);
            }

            if (!guessed) {
                System.out.println("\nGame Over!");
                System.out.println("The correct number was: " + number);
            }

            System.out.println("\nYour total score: " + score);

            System.out.print("\nDo you want to play again? (yes/no): ");
            playAgain = sc.next();
        }

        System.out.println("\nThank you for playing!");
        System.out.println("Final Score: " + score);

        sc.close();
    }
}
