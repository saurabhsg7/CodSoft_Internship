import java.util.Random;
import java.util.Scanner;

// CODSOFT INTERNSHIP TASK NO - 1 BY SAURABH GAIKWAD A29 BATCH 
// THANKS FOR OPPORTUNITY!

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int minRange = 1;
        int maxRange = 100;
        int attemptsLimit = 5;
        int score = 0;
        
        boolean playAgain = true;
        
        System.out.println("Welcome to the Number Guessing Game! - by Saurabh Gaikwad");
        
        while (playAgain) {
            int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            boolean guessedCorrectly = false;
            
            System.out.println("\nI have selected a number between " + minRange + " and " + maxRange + ". Guess it!");
            
            while (attempts < attemptsLimit && !guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;
                
                if (guess == randomNumber) {
                    System.out.println("Congratulations! You've guessed the correct number in " + attempts + " attempts.");
                    score++;
                    guessedCorrectly = true;
                } else if (guess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }
            
            if (!guessedCorrectly) {
                System.out.println("Sorry, you've used all your attempts. The correct number was: " + randomNumber);
            }
            
            System.out.println("Your current score: " + score);
            
            System.out.print("\nDo you want to play again? (yes/no): ");
            String playChoice = scanner.next();
            playAgain = playChoice.equalsIgnoreCase("yes");
        }
        
        System.out.println("\nThanks for playing the Number Guessing Game!");
        scanner.close();
    }
}
