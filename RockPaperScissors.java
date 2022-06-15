import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        do {

            // Num of rounds
            System.out.println("How many rounds do you want to play? Enter between 1-10.");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            scanner.nextLine();

            // Validate rounds, start game
            if (input >= 1 && input <= 10) {
                playGame(input);
            } else {
                System.out.println("Invalid number of rounds.");
            }

            // Play again
            System.out.println("Do you want to play again? Type YES or NO.");
            String playAgain = scanner.nextLine();
            if (playAgain.equalsIgnoreCase("No")){
                System.out.println("Ok quitting game...");
                break;
            } else if (!playAgain.equalsIgnoreCase("Yes")){
                System.out.println("Didn't receive YES input, quitting game...");
            }

        } while (true);
    }

    // Play game method
    static void playGame(int rounds) {

        int playerWins = 0, compWins = 0, draws = 0;

        // Loop rounds
        for (int i = 1; i <= rounds; i++) {

            int playerMove, compMove;
            System.out.println("=============== Round " + i + " ===============");
            System.out.println("Rock (1), Paper (2), or Scissors (3)? ");

            // User play
            Scanner playScanner = new Scanner(System.in);
            playerMove = playScanner.nextInt();
            switch (playerMove) {
                case 1:
                    System.out.println("Player has picked Rock.");
                    break;
                case 2:
                    System.out.println("Player has picked Paper.");
                    break;
                case 3:
                    System.out.println("Player has picked Scissors.");
                    break;
            }

            // Computer play
            Random random = new Random();
            compMove = random.nextInt(4);
            switch (compMove) {
                case 1:
                    System.out.println("Computer has picked Rock.");
                    break;
                case 2:
                    System.out.println("Computer has picked Paper.");
                    break;
                case 3:
                    System.out.println("Computer has picked Scissors.");
                    break;
            }

            // Game draw result
            if (playerMove == compMove) {
                draws = draws + 1;
                System.out.println("Round result: Draw.");
            }

            // Player picks rock
            else if (playerMove == 1) {
                if (compMove == 2) {
                    compWins += 1;
                    System.out.println("Round result: Computer Win.");
                } else if (compMove == 3) {
                    playerWins += 1;
                    System.out.println("Round result: Player Win.");
                }
            }

            // Player picks paper
            else if (playerMove == 2) {
                if (compMove == 1) {
                    playerWins += 1;
                    System.out.println("Round result: Player Win.");
                } else if (compMove == 3) {
                    compWins += 1;
                    System.out.println("Round result: Computer Win.");
                }
            }

            // Player picks scissors
            else if (playerMove == 3) {
                if (compMove == 1) {
                    compWins += 1;
                    System.out.println("Round result: Computer Win.");
                } else if (compMove == 2) {
                    playerWins += 1;
                    System.out.println("Round result: Player Win.");
                }
            }
        }

        // End of game results
        System.out.println("=============== Results ===============");
        System.out.printf("Player has won %d rounds %n", playerWins);
        System.out.printf("Computer has won %d rounds %n", compWins);
        if (playerWins > compWins){
            System.out.println("Player Wins!");
        } else if (playerWins < compWins){
            System.out.println("Computer Wins!");
        } else {
            System.out.println("The game has ended in a draw!");
        }
        System.out.println("=======================================");
    }
}