import java.util.*;

public class task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("Guess a number between 1 and 100");

        while(guess != number) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if(guess == number) {
                System.out.println("Correct! You guessed it in " + attempts + " attempts.");
            }
            else if(guess > number) {
                System.out.println("Too high!");
            }
            else {
                System.out.println("Too low!");
            }
        }
    }
}