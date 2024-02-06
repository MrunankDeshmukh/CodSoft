import java.util.Random;
import java.util.Scanner;

public class Task1{
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        Random random = new Random();
        
        int minvalue = 1;
        int maxvalue = 100;
        int maxattempts = 10;
        int rounds = 0;
        int score = 0;

        System.out.println("Hello, Welcome to My Number Game, Let's start!");
        
        do {
            int Number = random.nextInt(maxvalue - minvalue + 1) + minvalue;
            int attempts = 0;
            
            System.out.println("\nRound " + (rounds + 1));
            System.out.println("Guess the number between " + minvalue + " and " + maxvalue);

            while (attempts < maxattempts) {
                System.out.print("Enter your guess: ");
                int Guess = task.nextInt();
                attempts++;

                if (Guess == Number) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    score += maxattempts - attempts;
                    break;
                } else if (Guess < Number) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (attempts == maxattempts) {
                System.out.println("Sorry, you won't be able to try again, the attempts are over. The correct number was " +Number);
            }

            System.out.println("Your score: " + score);
            
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = task.next();
            
            if (playAgain.equals("no")){
                break;
            }
            


            rounds++;
        } while (true);

        System.out.println("Thanks for playing! Your final score is: " + score);
        task.close();
    }
}