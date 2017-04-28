public class Player {
	//Variables.
	protected int tileIndex;
	protected boolean lostTurn;
	protected boolean reachedEnd;
	protected int playerNumber;
	
	//Constructor.
	public Player(int playerNumber) {
		this.playerNumber = playerNumber;
		this.tileIndex = 0;
		this.lostTurn = false;
		this.reachedEnd = false;
	}
	
	//Returning things.
	public int getTile() {return tileIndex;}
	public boolean getLost() {return lostTurn;}
	
	//Removing penalty.
	public void removePenalty() {
		System.out.println("Player " + (playerNumber + 1) + "'s turn has been skipped.");
		lostTurn = false;
	}
	
	//Moving to color.
	public void moveToColor(TileColors moveTo, boolean gotDouble) {
		int temp = tileIndex;
		boolean found = false;
		while(!found) {
			temp += 1;
			if (Board.INSTANCE.getOneTile(temp).getColor() == TileColors.Rainbow) {
				reachedEnd = true;
				System.out.println("Player " + (playerNumber + 1) + " has reached Candy Castle and won the game!");
				Board.INSTANCE.finishGame();
				tileIndex = temp;
				found = true;
			}
			else if (Board.INSTANCE.getOneTile(temp).getColor() == moveTo) {
				if (gotDouble) gotDouble = false;
				else {
					tileIndex = temp;
					found = true;
					if (Board.INSTANCE.getOneTile(temp).getLicorice()) {
						lostTurn = true; System.out.println("Player " + (playerNumber + 1) + " has landed on a licorice space and lost their next turn.");
					}
				}
			}
		}
	}
	
	//Moving to area.
	public void moveToArea(TileAreas moveTo) {
		int temp = -1;
		boolean found = false;
		while(!found) {
			temp += 1;
			if (Board.INSTANCE.getOneTile(temp).getArea() == moveTo) {found = true; tileIndex = temp;}
		}
	}
}