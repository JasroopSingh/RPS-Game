import java.util.Scanner; // import the java.util.Scanner class, allows you to take user input 
import java.util.Random; // import the java.util.Random class, allows you to generate random numbers/other vaules


public class RockPaperScissorsGame 
{
    private String[] validOptions = {"rock", "paper", "scissors"};
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    public RockPaperScissorsGame() {}

    
    public void letBattleBegin() 
    {
        while (true) 
        {
            boolean battleEnded = false;

            while (!battleEnded) 
            { // START OF WHILE LOOP
                System.out.print("Rock, Paper, or Scissors? ");
                String playerGuess = scanner.next().trim().toLowerCase();

                String computerGuess = validOptions[random.nextInt(3)];

                if (playerGuess.equals(computerGuess)) 
                    {
                        System.out.println("Computer guessed that too.\n");
                        continue;
                    } 
                else if (playerGuess.equals("rock") && computerGuess.equals("paper")) 
                    {
                        battleEnded = true;
                        System.out.println("Computer won: paper beats rock\n");
                    } 
                else if (playerGuess.equals("rock") && computerGuess.equals("scissors")) 
                    {
                        battleEnded = true;
                        System.out.println("Player won: rock beats scissors\n");
                    } 
                else if (playerGuess.equals("paper") && computerGuess.equals("rock")) 
                    {
                        battleEnded = true;
                        System.out.println("Player won: paper beats rock\n");
                    } 
                else if (playerGuess.equals("paper") && computerGuess.equals("scissors")) 
                    {
                        battleEnded = true;
                        System.out.println("Computer won: scissors beats paper\n");
                    } 
                else if (playerGuess.equals("scissors") && computerGuess.equals("rock")) 
                    {
                        battleEnded = true;
                        System.out.println("Computer won: rock beats scissors\n");
                    } 
                else if (playerGuess.equals("scissors") && computerGuess.equals("paper")) 
                    {
                        battleEnded = true;
                        System.out.println("Player won: scissors beats paper\n");
                    } 
                else {System.out.println("Invalid input.\n");}

                break; // Add this line to break out of the inner while loop
            } // END OF WHILE LOOP
        }
    }
}