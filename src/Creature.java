
public class Creature extends Entity {
	
	private int health;

	public Creature(int posX, int posY, int health) {
		super(posX, posY);
		this.setHealth(health);
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
}
