import java.util.Scanner;

/**
 * The game that allows the players to play.
 * @author Joseph
 *
 */
public class Game {
	Player player1;
	Player player2;
	private int p1Points;
	private int p2Points;
	
	/**
	 * Creates the game that the players play.
	 */
	public Game() {
		p1Points = 0;
		p2Points = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("1 for Human vs. Computer; 2 for Computer vs. Computer: ");
		int gameType = sc.nextInt();
		if (gameType == 1)
		{
			player1 = new Player();
			System.out.print("Enter computer threshold (between 0 and 1): ");
			player2 = new Player(sc.nextDouble());
		}
		else
		{
			System.out.print("Enter computer 1 threshold (between 0 and 1): ");
			player1 = new Player(sc.nextDouble());
			System.out.print("Enter computer 2 threshold (between 0 and 1): ");
			player2 = new Player(sc.nextDouble());
		}
	}
	
	/**
	 * The method that allows the players to play and calculates 
	 * the scores and decides the winner.
	 * @param rounds The number of rounds of the game to be played.
	 */
	public void playGame(long rounds)
	{
		for (int i = 0; i < rounds; i++)
		{
			int sumOfNumbers = player1.chooseNumber() + player2.chooseNumber();
			if (sumOfNumbers % 2 == 0)
			{
				p1Points -= sumOfNumbers;
				p2Points += sumOfNumbers;
				System.out.println("P2 WINS");
			}
			else
			{
				p1Points += sumOfNumbers;
				p2Points -= sumOfNumbers;
				System.out.println("P1 WINS");
			}
			System.out.println("P1 points: " + p1Points + "\n" + "P2 points: " + p2Points);
			System.out.println("   ***");
		}
		if(p1Points > p2Points)
		{
			System.out.println("Player 1 Wins!");
		}
		else if (p1Points < p2Points)
		{
			System.out.println("Player 2 Wins!");
		}
		else
		{
			System.out.println("It's a Tie!");
		}
	}
	
	public String toString()
	{
		String report = "";
		report += "player 1: " + player1.toString() + " p1 points: " + p1Points +"\n";
		report += "player 2: " + player2.toString() + " p2 points: " + p2Points;
		return report;
	}
}
