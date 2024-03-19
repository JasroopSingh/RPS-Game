import java.util.Scanner; // import the java.util.Scanner class, allows you to take user input 
import java.util.Random; // import the java.util.Random class, allows you to generate random numbers/other vaules


public class RockPaperScissorsGame 
{
    private String[] validOptions = {"rock", "paper", "scissors"}; // Array of valid options rock, paper, scissors
    private Random random = new Random(); //used random for generating random numbers, used by bot to choose play from 
    private Scanner scanner = new Scanner(System.in); // used scanner for taking user input

    public RockPaperScissorsGame() {} // Constructor for RockPaperScissorsGame

    public void run() // function to run the Rock Paper Scissors game
    {
        int totalRounds = 3; //Total Rounds that can be played Player vs Bot
        int currentRound = 0; // Current round number

        // Number of wins for player and bot
        int playerWins = 0;
        int botWins = 0;

        System.out.println("***********************");
        System.out.println("* Welcome to the Game *");
        System.out.println("***********************");

        while (currentRound < totalRounds) 
        {
            System.out.print("Please type your choose from the following:\n - Rock \n - Paper \n - Scissors \n\nInput: "); // Prompt user for input
            String playerChoose = scanner.next().trim().toLowerCase(); // Get user input, .trim() used to remove extra spaces, .toLowerCase() used to lower case all user input
            String botChoose = validOptions[random.nextInt(3)]; // Generate random bot choice for the game

            if (playerChoose.equals(botChoose)) 
            {
                System.out.println("Bot guessed that too.\n"); // Inform about the tie
            } 
            else if (playerChoose.equals("rock") && botChoose.equals("paper")) 
            {
                System.out.println("Player chosse: " + playerChoose);
                System.out.println("Bot chosse: " + botChoose);
                System.out.println();
                botWins++;
                System.out.println("Bot wins: paper beats rock\n");
            } 
            else if (playerChoose.equals("rock") && botChoose.equals("scissors")) 
            {
                System.out.println("Player chosse: " + playerChoose);
                System.out.println("Bot chosse: " + botChoose);
                System.out.println();
                playerWins++;
                System.out.println("Player wins: rock beats scissors\n");
            } 
            else if (playerChoose.equals("paper") && botChoose.equals("rock")) 
            {
                System.out.println("Player chosse: " + playerChoose);
                System.out.println("Bot chosse: " + botChoose);
                System.out.println();
                playerWins++;
                System.out.println("Player wins: paper beats rock\n");
            } 
            else if (playerChoose.equals("paper") && botChoose.equals("scissors")) 
            {
                System.out.println("Player chosse: " + playerChoose);
                System.out.println("Bot chosse: " + botChoose);
                System.out.println();
                botWins++;
                System.out.println("Bot wins: scissors beats paper\n");
            } 
            else if (playerChoose.equals("scissors") && botChoose.equals("rock")) 
            {
                System.out.println("Player chosse: " + playerChoose);
                System.out.println("Bot chosse: " + botChoose);
                System.out.println();
                botWins++;
                System.out.println("Bot wins: rock beats scissors\n");
            } 
            else if (playerChoose.equals("scissors") && botChoose.equals("paper")) 
            {
                System.out.println("Player chosse: " + playerChoose);
                System.out.println("Bot chosse: " + botChoose);
                System.out.println();
                playerWins++;
                System.out.println("Player wins: scissors beats paper\n");
            } 
            
            else 
            {
                System.out.print("Invalid input (" + playerChoose + ")" + "Please type Rock, Paper or Scissors \n\n");
                currentRound--;
            }
            
            currentRound++;
            
        
            if (currentRound >= totalRounds)
                {
                    System.out.println("Game over. Player " + playerWins + " - " + botWins + " Computer"); // Print game result
                    System.out.print("Play again? (Y/N): "); // Prompt for replay
                    String playAgain = scanner.next().trim().toLowerCase(); // Get input for players decision

                    if (playAgain.equals("y")) {run();} // Restart the game

                    else 
                    {
                    System.out.println("Thanks for playing! Goodbye.");
                    System.exit(0); // Exit the game
                    }
                }
        }
    }
}
