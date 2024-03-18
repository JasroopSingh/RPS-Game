import java.util.Scanner; // import the java.util.Scanner class, allows you to take user input 
import java.util.Random; // import the java.util.Random class, allows you to generate random numbers/other vaules

public class RockPaperScissorsGame 
{
    private String[] validOptions = {"rock", "paper", "scissors"};
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    public RockPaperScissorsGame() {}
    
    public void run() 
    {
        int totalRounds = 3;
        int currentRound = 0;
        int playerWins = 0;
        int computerWins = 0;

        while (currentRound < totalRounds) 
        {
            System.out.println("Chose one of the following plays:\n 1. Rock \n 2. Paper \n 3. Scissors \n");
            String playerChoose = scanner.next().trim().toLowerCase();
            String computerGuess = validOptions[random.nextInt(3)];
            
            System.out.println("Player attacked with: " + playerChoose);
            System.out.println("Bot attacked with: " + computerGuess); 

            if (playerChoose.equals(computerGuess)) 
            {
                System.out.println("Computer guessed that too.\n");
                continue;
            } 
            else if (playerChoose.equals("rock") && computerGuess.equals("paper")) 
            {
                computerWins++;
                System.out.println("Computer wins: paper beats rock\n");
            } 
            else if (playerChoose.equals("rock") && computerGuess.equals("scissors")) 
            {
                playerWins++;
                System.out.println("Player wins: rock beats scissors\n");
            } 
            else if (playerChoose.equals("paper") && computerGuess.equals("rock")) 
            {
                playerWins++;
                System.out.println("Player wins: paper beats rock\n");
            } 
            else if (playerChoose.equals("paper") && computerGuess.equals("scissors")) 
            {
                computerWins++;
                System.out.println("Computer wins: scissors beats paper\n");
            } 
            else if (playerChoose.equals("scissors") && computerGuess.equals("rock")) 
            {
                computerWins++;
                System.out.println("Computer wins: rock beats scissors\n");
            } 
            else if (playerChoose.equals("scissors") && computerGuess.equals("paper")) 
            {
                playerWins++;
                System.out.println("Player wins: scissors beats paper\n");
            } 
            else {
                System.out.println("Invalid input.\n");
            }
            currentRound++;
        } // END OF WHILE LOOP

            System.out.println("Game over. Player " + playerWins + " - " + computerWins + " Computer");
            System.out.print("Play again? (Y/N): ");
            String playAgain = scanner.next().trim().toLowerCase();
            if (!playAgain.equals("y")) {
                return;
            } else {
                run(); // Restart the game
            }
    }
}
