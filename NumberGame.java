import java.util.*;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int rounds = 0, score = 0;

        while (true) {
            int num = rand.nextInt(100) + 1, guess, attempts = 0;
            System.out.println("\nGuess a number (1–100), Max 7 attempts:");

            while (attempts++ < 7) {
                System.out.print("Guess: ");
                guess = sc.nextInt();
                if (guess == num) {
                    System.out.println("Correct in " + attempts + " tries!");
                    score += 8 - attempts;
                    break;
                }
                System.out.println(guess < num ? "Too low!" : "Too high!");
            }

            if (attempts > 7) System.out.println("Out of attempts! Number: " + num);
            rounds++;
            System.out.print("Play again? (y/n): ");
            if (!sc.next().equalsIgnoreCase("y")) break;
        }

        System.out.println("\nGame Over! Rounds: " + rounds + ", Score: " + score);
        sc.close();
    }
}
