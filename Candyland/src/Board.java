import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//Board is a singleton.
public enum Board {
	INSTANCE;
	
	//Lists.
	protected ArrayList<Tile> tileList = new ArrayList<Tile>();
	protected ArrayList<Card> cardList = new ArrayList<Card>();
	protected ArrayList<Player> playerList = new ArrayList<Player>();
	
	//Variables.
	protected int playerTurn = 0;
	protected boolean gameFinished = false;
	protected boolean gameClosed = false;
	protected Card drawnCard;
	protected boolean lostTurn;
	
	//Randomizer.
	protected Random randomizer = new Random();
	
	//Constructor.
	private Board() {
		new CreateBoard(tileList);
		new CreateCards(cardList);
	}
	
	//Returning lists (you can use these for drawing things).
	public ArrayList<Tile> getTiles() {return tileList;}
	public ArrayList<Player> getPlayers() {return playerList;}
	
	//Setting players.
	public void setPlayers(int players) {
		for(int i = 0; i < players; i += 1) playerList.add(new Player(i));
	}
	
	//Ending the game.
	public void finishGame() {gameFinished = true;}
	
	//Finding out if the game is finished.
	public boolean isFinished() {return gameFinished;}
	
	//Seeing whose turn it is.
	public int whoseTurn() {return playerTurn;}
	
	//Carrying out a turn.
	public void performTurn() {
		//Seeing if player lost turn.
		lostTurn = playerList.get(playerTurn).getLost();
		
		//Drawing card/removing penalty.
		if (!lostTurn) {
			drawnCard = cardList.get(randomizer.nextInt(cardList.size()));
			System.out.println(drawnCard);
			if (drawnCard.getType() == CardTypes.Color) playerList.get(playerTurn).moveToColor(drawnCard.getColor(), drawnCard.getDouble());
			else playerList.get(playerTurn).moveToArea(drawnCard.getArea());
		}
		else playerList.get(playerTurn).removePenalty();
		
		//Moving to next player.
		if (playerTurn < playerList.size() - 1) playerTurn += 1;
		else playerTurn = 0;
	}
	
	//Finding a specific tile.
	public Tile getOneTile(int at) {return tileList.get(at);}
	
	//Reset.
	public void resetGame() {
		playerTurn = 0;
		playerList.clear();
		gameFinished = false;
	}
	
	//Closing game.
	public void closeGame() {gameClosed = true;}
	public boolean checkClosed() {return gameClosed;}
}