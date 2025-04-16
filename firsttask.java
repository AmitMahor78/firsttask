import java.util.Random;
import java.util.Scanner;

public class firsttask {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;
        int totalRounds = 0;
        int totalWins = 0;
        int totalAttempts = 0;

        while (playAgain) {
            int randomNumber = random.nextInt(max - min + 1) + min;
            boolean guessedCorrectly = false;
            int attempts = 0;

            System.out.println("Welcome to the number guessing game!");
            System.out.println("I'm thinking of a number between " + min + " and " + max + ".");

            while (!guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess < min || guess > max) {
                    System.out.println("Your guess is out of range. Please try again.");
                } else if (guess < randomNumber) {
                    System.out.println("Your guess is too low. Try again!");
                } else if (guess > randomNumber) {
                    System.out.println("Your guess is too high. Try again!");
                } else {
                    System.out.println("Congratulations! You guessed the number correctly in " + attempts + " attempts.");
                    guessedCorrectly = true;
                    
                    totalWins++;
                }
            }

            totalRounds++;
            totalAttempts += attempts;

            System.out.println("Your current score:");
            System.out.println("Rounds played: " + totalRounds);
            System.out.println("Rounds won: " + totalWins);
            System.out.println("Total attempts: " + totalAttempts);
            System.out.println("Average attempts per round: " + (totalAttempts / (double) totalRounds));

            System.out.print("Would you like to play again? (yes/no): ");
            String response = scanner.next().toLowerCase();

            while (!response.equals("yes") && !response.equals("no")) {
                System.out.print("Invalid input. Please enter 'yes' or 'no': ");
                response = scanner.next().toLowerCase();
            }

            playAgain = response.equals("yes");
        }

        System.out.println("Thanks for playing!");
        System.out.println("Your final score:");
        System.out.println("Rounds played: " + totalRounds);
        System.out.println("Rounds won: " + totalWins);
        System.out.println("Total attempts: " + totalAttempts);
        System.out.println("Average attempts per round: " + (totalAttempts / (double) totalRounds));

        scanner.close();
    }
}
