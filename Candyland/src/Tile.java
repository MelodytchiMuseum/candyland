public class Tile {
	//Variables.
	protected TileColors tileColor;
	protected TileAreas tileArea;
	protected Tile tileShortcut = null;
	protected boolean tileLicorice;
	
	//These are solely for drawing players in the correct position.
	protected int x;
	protected int y;
	
	//Constructor.
	public Tile(TileColors tileColor, TileAreas tileArea, boolean tileLicorice, int x, int y) {
		this.tileColor = tileColor;
		this.tileArea = tileArea;
		this.tileLicorice = tileLicorice;
		this.x = x;
		this.y = y;
	}
	
	//Changing shortcut.
	public void changeShortcut(Tile tileShortcut) {this.tileShortcut = tileShortcut;}
	
	//Returning functions.
	public TileColors getColor() {return tileColor;}
	public TileAreas getArea() {return tileArea;}
	public Tile getShortcut() {return tileShortcut;}
	public boolean getLicorice() {return tileLicorice;}
	public int getX() {return x;}
	public int getY() {return y;}
}