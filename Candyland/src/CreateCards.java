import java.util.ArrayList;

//This class isn't anywhere near as big as CreateBoard, but it's still
//useful for organizational purposes and consistency. This deck should
//be accurate to the original game.
public class CreateCards {
	//List.
	protected ArrayList<Card> cardList;
	
	//Constructor.
	public CreateCards(ArrayList<Card> cardList) {
		//Color cards.
		for(int i = 0; i < 8; i += 1) cardList.add(new Card(CardTypes.Color, false, TileColors.Orange, TileAreas.Standard));
		for(int i = 0; i < 2; i += 1) cardList.add(new Card(CardTypes.Color, true, TileColors.Orange, TileAreas.Standard));
		for(int i = 0; i < 8; i += 1) cardList.add(new Card(CardTypes.Color, false, TileColors.Purple, TileAreas.Standard));
		for(int i = 0; i < 2; i += 1) cardList.add(new Card(CardTypes.Color, true, TileColors.Purple, TileAreas.Standard));
		for(int i = 0; i < 8; i += 1) cardList.add(new Card(CardTypes.Color, false, TileColors.Yellow, TileAreas.Standard));
		for(int i = 0; i < 2; i += 1) cardList.add(new Card(CardTypes.Color, true, TileColors.Yellow, TileAreas.Standard));
		for(int i = 0; i < 8; i += 1) cardList.add(new Card(CardTypes.Color, false, TileColors.Blue, TileAreas.Standard));
		for(int i = 0; i < 2; i += 1) cardList.add(new Card(CardTypes.Color, true, TileColors.Blue, TileAreas.Standard));
		for(int i = 0; i < 8; i += 1) cardList.add(new Card(CardTypes.Color, false, TileColors.Green, TileAreas.Standard));
		for(int i = 0; i < 2; i += 1) cardList.add(new Card(CardTypes.Color, true, TileColors.Green, TileAreas.Standard));
		for(int i = 0; i < 8; i += 1) cardList.add(new Card(CardTypes.Color, false, TileColors.Gold, TileAreas.Standard));
		for(int i = 0; i < 2; i += 1) cardList.add(new Card(CardTypes.Color, true, TileColors.Gold, TileAreas.Standard));
		
		//Areas.
		cardList.add(new Card(CardTypes.Area, false, TileColors.Pink, TileAreas.Gingerbread));
		cardList.add(new Card(CardTypes.Area, false, TileColors.Pink, TileAreas.Mint));
		cardList.add(new Card(CardTypes.Area, false, TileColors.Pink, TileAreas.Gumdrop));
		cardList.add(new Card(CardTypes.Area, false, TileColors.Pink, TileAreas.Nutt));
		cardList.add(new Card(CardTypes.Area, false, TileColors.Pink, TileAreas.Lollipop));
		cardList.add(new Card(CardTypes.Area, false, TileColors.Pink, TileAreas.Frostine));
	}
}