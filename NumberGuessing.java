



import java.util.Scanner;
import java.util.Random;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int attempts = 0;
        int maxAttempts = 7;
        int score = 100; // Initial score

         System.out.println("                 Welcome to the Number Guessing Game!");
        System.out.println();
        System.out.println("========================================================================================");
        System.out.println();
        System.out.println("you have 7 attempts to guess the number otherwise you will lose the game");
        System.out.println( );
        System.out.println("========================================================================================");
        
        System.out.println("I have selected a number between " + lowerBound + " and " + upperBound + ". Try to guess it!");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                break;
            } else if (guess < randomNumber) {
                System.out.println("The number is higher than your guess.");
            } else {
                System.out.println("The number is lower than your guess.");
            }

            // Update score based on attempts
            score -= 10; // Decrease score for each attempt
        }

        if (attempts == maxAttempts) {
            System.out.println("Sorry, you've used all your attempts. The number was: " + randomNumber);
        }

        System.out.println("Your score: " + score);
        scanner.close();
    }
}