
public class Player extends Creature {
	
	private int lvl, exp;

	public Player(int posX, int posY, int health, int lvl, int exp) {
		super(posX, posY, health);
		this.lvl = lvl;
		this.exp = exp;
	}

	public int getLvl() {
		return lvl;
	}

	public void setLvl(int lvl) {
		this.lvl = lvl;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	
	
}
