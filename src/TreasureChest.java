
public class TreasureChest extends Entity{
	
	private boolean isFound;

	public TreasureChest(int posX, int posY, boolean isFound) {
		super(posX, posY);
		this.isFound = isFound;
	}

	public boolean isFound() {
		return isFound;
	}

	public void setFound(boolean isFound) {
		this.isFound = isFound;
	}
	
	

}
