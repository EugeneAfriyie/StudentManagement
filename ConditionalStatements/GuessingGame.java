package ConditionalStatements;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        int target = (int) (Math.random() * 100) + 1;
        int attempts = 0;
        Scanner scanner = new Scanner(System.in);

        while (attempts < 5) {
            System.out.print("Guess the number (1-100): ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == target) {
                System.out.println("Correct! You guessed it in " + attempts + " tries.");
                break;
            } else if (guess < target) {
                System.out.println("Too low.");
            } else {
                System.out.println("Too high.");
            }
        }

        if (attempts == 5) {
            System.out.println("Out of attempts. The number was: " + target);
        }

        scanner.close();
    }
}
