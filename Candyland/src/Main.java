import java.util.Scanner;

public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Temporary.
		int tempAction = 0;
		int playerAmount = 0;
		
		//Function.
		while(!Board.INSTANCE.checkClosed()) {
			//Temporary scanner (this will get replaced by a graphic interface).
			Scanner temp = new Scanner(System.in);
			playerAmount = 0;
		
			//Temporary player settings.
			System.out.println("How many people will play?");
			while(playerAmount < 2) {
				playerAmount = temp.nextInt();
				if (playerAmount < 2) System.out.println("At least 2 people need to play.");
			}
		
			//Setting players.
			Board.INSTANCE.setPlayers(playerAmount);
		
			//Carrying out the game.
			while(!Board.INSTANCE.isFinished()) {
				System.out.println("Player " + (Board.INSTANCE.whoseTurn() + 1) + "'s turn.");
				System.out.println("Choose an action.\n1. Draw card\n2. End current game");
				tempAction = 0;
				while(tempAction != 1 && tempAction != 2) {
					tempAction = temp.nextInt();
					if (tempAction != 1 && tempAction != 2) System.out.println("Please select an option.");
				}
				if (tempAction == 1) Board.INSTANCE.performTurn();
				else {
					Board.INSTANCE.finishGame();
					System.out.println("The game has been forcefully ended.");
				}
			}
			
			//Playing again.
			System.out.println("Would you like to play again?\n1. Yes\n2. No");
			tempAction = 0;
			while(tempAction != 1 && tempAction != 2) {
				tempAction = temp.nextInt();
				if (tempAction != 1 && tempAction != 2) System.out.println("Please select an option.");
			}
			if (tempAction == 1) Board.INSTANCE.resetGame();
			else Board.INSTANCE.closeGame();
		}
	}
}