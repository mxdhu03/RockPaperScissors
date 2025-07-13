import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = { "Rock", "Paper", "Scissors" };

        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Enter your choice: Rock, Paper, or Scissors");

        String userInput = scanner.nextLine().trim().toLowerCase();

        // Validate user input
        if (!userInput.equals("rock") && !userInput.equals("paper") && !userInput.equals("scissors")) {
            System.out.println("Invalid input! Please enter Rock, Paper, or Scissors.");
            return;
        }

        // Computer makes a random choice
        int computerIndex = random.nextInt(3);
        String computerChoice = choices[computerIndex];
        System.out.println("Computer chose: " + computerChoice);

        // Determine winner
        if (userInput.equals(computerChoice.toLowerCase())) {
            System.out.println("It's a tie!");
        } else if (
            (userInput.equals("rock") && computerChoice.equals("Scissors")) ||
            (userInput.equals("paper") && computerChoice.equals("Rock")) ||
            (userInput.equals("scissors") && computerChoice.equals("Paper"))
        ) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }
}
