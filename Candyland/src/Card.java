public class Card {
	//Variables.
	protected TileColors cardColor;
	protected TileAreas cardArea;
	protected CardTypes cardType;
	protected boolean isDouble;
	
	//Constructor.
	public Card(CardTypes cardType, boolean isDouble, TileColors cardColor, TileAreas cardArea) {
		this.cardType = cardType;
		this.isDouble = isDouble;
		this.cardColor = cardColor;
		this.cardArea = cardArea;
	}
	
	//Returning stuff.
	public CardTypes getType() {return cardType;}
	public boolean getDouble() {return isDouble;}
	public TileColors getColor() {return cardColor;}
	public TileAreas getArea() {return cardArea;}
	
	//To string.
	public String toString() {
		String retstr = "";
		if (cardType == CardTypes.Color) {
			retstr = "Color card: ";
			if (isDouble) retstr += "Double ";
			if (cardColor == TileColors.Orange) retstr += "Orange";
			else if (cardColor == TileColors.Purple) retstr += "Purple";
			else if (cardColor == TileColors.Yellow) retstr += "Yellow";
			else if (cardColor == TileColors.Blue) retstr += "Blue";
			else if (cardColor == TileColors.Gold) retstr += "Gold";
			else retstr += "Green";
		}
		else {
			retstr = "Location card: ";
			if (cardArea == TileAreas.Gingerbread) retstr += "Gingerbread Tree";
			else if (cardArea == TileAreas.Mint) retstr += "Peppermint Forest";
			else if (cardArea == TileAreas.Gumdrop) retstr += "Gumdrop Mountains";
			else if (cardArea == TileAreas.Nutt) retstr += "Peanut Acres";
			else if (cardArea == TileAreas.Lollipop) retstr += "Lollipop Woods";
			else retstr += "Snow Flake Lake";
		}
		return retstr;
	}
}